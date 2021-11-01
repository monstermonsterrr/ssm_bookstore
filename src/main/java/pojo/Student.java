package pojo;

public class Student {
    private int stuid;

    private String stuSchName;

    private int stuSchId;

    private String stuSubMajor;

    private String stuName;

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuSchName() {
        return stuSchName;
    }

    public void setStuSchName(String stuSchName) {
        this.stuSchName = stuSchName;
    }

    public int getStuSchId() {
        return stuSchId;
    }

    public void setStuSchId(int stuSchId) {
        this.stuSchId = stuSchId;
    }

    public String getStuSubMajor() {
        return stuSubMajor;
    }

    public void setStuSubMajor(String stuSubMajor) {
        this.stuSubMajor = stuSubMajor;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    public String getStuSubTime() {
        return stuSubTime;
    }

    public void setStuSubTime(String stuSubTime) {
        this.stuSubTime = stuSubTime;
    }

    public String getStuPromoName() {
        return stuPromoName;
    }

    public void setStuPromoName(String stuPromoName) {
        this.stuPromoName = stuPromoName;
    }

    public int getStuPromoId() {
        return stuPromoId;
    }

    public void setStuPromoId(int stuPromoId) {
        this.stuPromoId = stuPromoId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuSchName='" + stuSchName + '\'' +
                ", stuSchId=" + stuSchId +
                ", stuSubMajor='" + stuSubMajor + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuTel='" + stuTel + '\'' +
                ", stuSubTime='" + stuSubTime + '\'' +
                ", stuPromoName='" + stuPromoName + '\'' +
                ", stuPromoId=" + stuPromoId +
                '}';
    }

    private String stuTel;

    private String stuSubTime;
    private String stuPromoName;
    private int stuPromoId;
}
