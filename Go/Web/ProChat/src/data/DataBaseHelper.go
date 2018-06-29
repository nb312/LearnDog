package data

import(
	"database/sql"
	"fmt"
	_ "github.com/go-sql-driver/mysql"
	"time"
)
const DATABASE_NAME="danmu"

/**如果数据不存在 则创建表*/
func createDB(database_name string){
	db,err :=sql.Open(driver_name,database_url)
	if err!=nil {
		fmt.Printf(err.Error())
	}
	result,err :=db.Exec("create database "+database_name)
	if err!=nil{//如果创建失败 直接打开
		fmt.Printf(err.Error())
		db,err:=sql.Open(driver_name,database_url+database_name)
		if err!=nil{
			println(err.Error())
		}else{
		db.Exec("use "+database_name)
		createTable(db)
		}
	}else{
		result.LastInsertId()
		db.Exec("use "+database_name)
		createTable(db)
	}
	
}

/**创建数据库表*/
func createTable(db *sql.DB){
	db.Exec(create_table_user)
	db.Exec(create_table_topic)
	db.Exec(create_table_commit)
	db.Exec(create_table_like)
}

func InitDB(){
	createDB(DATABASE_NAME)
}

func insertUserData(){
	cur:=time.Now().UnixNano()
	fmt.Printf(string(cur))
}

func InsertUser( user UserInfo){
	db,err:=sql.Open(driver_name,database_url+DATABASE_NAME)
	if err ==nil {
		db.Exec(user.InsertSql())
	}
}
func Find_with_openid(user UserInfo) UserInfo{
	db,err:=sql.Open(driver_name,database_url+DATABASE_NAME)
	if err ==nil {
		rows,err:=db.Query(user.FindWithUserid())
		if err == nil{
			for rows.Next(){
				rows.Scan(&user.ID,&user.Nickname,&user.AvatarUrl,&user.Gender)
			}
			
			return user
		}
	}
	return user
}

func TestData(){
	fmt.Printf("hello world")
	db, err := sql.Open("mysql", "root:nbin312@tcp(localhost:3307)/")
	if err != nil {
		fmt.Printf(err.Error())  // Just for example purpose. You should use proper error handling instead of panic
	}
	db.Exec("create database Bus")
	// db.Exec("use Girl")
	db.Exec("CREATE TABLE example ( id integer, name varchar(32) )")
	
/**
	rows,err:=db.Query("SELECT Name FROM city")
	if err!=nil {
		fmt.Printf(err.Error())
	}else{
		for rows.Next() {
			var Name string
			err = rows.Scan(&Name)
			fmt.Println(Name)
		}
	}
	
	defer rows.Close()
	*/
	defer db.Close()
}	

