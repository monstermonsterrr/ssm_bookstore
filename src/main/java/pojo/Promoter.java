package pojo;

import java.util.Date;

public class Promoter {

    private int promoId;
    private int loginId;
    private String loginName;
    private String promoName;

    @Override
    public String toString() {
        return "Promoter{" +
                "promoId=" + promoId +
                ", loginId=" + loginId +
                ", loginName='" + loginName + '\'' +
                ", promoName='" + promoName + '\'' +
                ", promoAmount=" + promoAmount +
                ", promoPrice=" + promoPrice +
                ", promoTableFalse=" + promoTableFalse +
                ", promoTableTrue=" + promoTableTrue +
                ", promoAddSubTime=" + promoAddSubTime +
                '}';
    }

    public int getPromoId() {
        return promoId;
    }

    public void setPromoId(int promoId) {
        this.promoId = promoId;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public int getPromoAmount() {
        return promoAmount;
    }

    public void setPromoAmount(int promoAmount) {
        this.promoAmount = promoAmount;
    }

    public int getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(int promoPrice) {
        this.promoPrice = promoPrice;
    }

    public int getPromoTableFalse() {
        return promoTableFalse;
    }

    public void setPromoTableFalse(int promoTableFalse) {
        this.promoTableFalse = promoTableFalse;
    }

    public int getPromoTableTrue() {
        return promoTableTrue;
    }

    public void setPromoTableTrue(int promoTableTrue) {
        this.promoTableTrue = promoTableTrue;
    }

    public Date getPromoAddSubTime() {
        return promoAddSubTime;
    }

    public void setPromoAddSubTime(Date promoAddSubTime) {
        this.promoAddSubTime = promoAddSubTime;
    }

    private int promoAmount;
    private int promoPrice;
    private int promoTableFalse;
    private int promoTableTrue;
    private Date promoAddSubTime;
}
