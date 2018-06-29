package coin.otc.com.network.controller.publicad.item;

import com.nb.libcommon.view.inter.IBaseItem;

/**
 * Created by NieBin on 2018/1/19.
 * GitHub: https://github.com/nb312
 */

public class AdPublicItem implements IBaseItem {

    private String avatar;
    private int coinId;
    private String currency;
    private int entrustType;
    private int exchangeId;
    private boolean fixedPrice;
    private int id;
    private String limitAmountDesc;
    private int maxAmount;
    private int minAmount;
    private String niceName;
    private boolean onlineStatus;
    private String payProviderName;
    private String positiveRate;
    private int premium;
    private double price;
    private String priceStr;
    private boolean realName;
    private int tradeNum;
    private int trustNum;
    private int userId;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getCoinId() {
        return coinId;
    }

    public void setCoinId(int coinId) {
        this.coinId = coinId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getEntrustType() {
        return entrustType;
    }

    public void setEntrustType(int entrustType) {
        this.entrustType = entrustType;
    }

    public int getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(int exchangeId) {
        this.exchangeId = exchangeId;
    }

    public boolean isFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(boolean fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLimitAmountDesc() {
        return limitAmountDesc;
    }

    public void setLimitAmountDesc(String limitAmountDesc) {
        this.limitAmountDesc = limitAmountDesc;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public int getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    public boolean isOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getPayProviderName() {
        return payProviderName;
    }

    public void setPayProviderName(String payProviderName) {
        this.payProviderName = payProviderName;
    }

    public String getPositiveRate() {
        return positiveRate;
    }

    public void setPositiveRate(String positiveRate) {
        this.positiveRate = positiveRate;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPriceStr() {
        return priceStr;
    }

    public void setPriceStr(String priceStr) {
        this.priceStr = priceStr;
    }

    public boolean isRealName() {
        return realName;
    }

    public void setRealName(boolean realName) {
        this.realName = realName;
    }

    public int getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(int tradeNum) {
        this.tradeNum = tradeNum;
    }

    public int getTrustNum() {
        return trustNum;
    }

    public void setTrustNum(int trustNum) {
        this.trustNum = trustNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}