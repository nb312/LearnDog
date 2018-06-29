package coin.otc.com.network.controller.advertise.item;

import com.nb.libcommon.view.inter.IBaseItem;

/**
 * Created by NieBin on 2018/1/18.
 * GitHub: https://github.com/nb312
 */

public class MyAdItem implements IBaseItem {

    private long id;
    private String serialNumber;
    private int entrustType;
    private String entrustTypeDesc;
    private String country;
    private String countryDesc;
    private String coinCode;
    private String currency;
    private String exchangeName;
    private double premium;
    private String premiumStr;
    private String formula;
    private double price;
    private String priceStr;
    private int minAmount;
    private int maxAmount;
    private String amountLimitDesc;
    private long createDate;
    private String createDateDesc;
    private int status;
    private String statusDesc;
    private boolean fixedPrice;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getEntrustType() {
        return entrustType;
    }

    public void setEntrustType(int entrustType) {
        this.entrustType = entrustType;
    }

    public String getEntrustTypeDesc() {
        return entrustTypeDesc;
    }

    public void setEntrustTypeDesc(String entrustTypeDesc) {
        this.entrustTypeDesc = entrustTypeDesc;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryDesc() {
        return countryDesc;
    }

    public void setCountryDesc(String countryDesc) {
        this.countryDesc = countryDesc;
    }

    public String getCoinCode() {
        return coinCode;
    }

    public void setCoinCode(String coinCode) {
        this.coinCode = coinCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public String getPremiumStr() {
        return premiumStr;
    }

    public void setPremiumStr(String premiumStr) {
        this.premiumStr = premiumStr;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceStr() {
        return priceStr;
    }

    public void setPriceStr(String priceStr) {
        this.priceStr = priceStr;
    }

    public int getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getAmountLimitDesc() {
        return amountLimitDesc;
    }

    public void setAmountLimitDesc(String amountLimitDesc) {
        this.amountLimitDesc = amountLimitDesc;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public String getCreateDateDesc() {
        return createDateDesc;
    }

    public void setCreateDateDesc(String createDateDesc) {
        this.createDateDesc = createDateDesc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public boolean isFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(boolean fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
}