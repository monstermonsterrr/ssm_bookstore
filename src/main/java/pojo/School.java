package pojo;

import java.util.Date;

public class School {

    private int schoolid;

    private String schMajorName;

    private int schMajorId;
    private String schMajorSign;
    private Date schMajorSubTime;

    @Override
    public String toString() {
        return "School{" +
                "schoolid=" + schoolid +
                ", schMajorName='" + schMajorName + '\'' +
                ", schMajorId=" + schMajorId +
                ", schMajorSign='" + schMajorSign + '\'' +
                ", schMajorSubTime=" + schMajorSubTime +
                ", schName='" + schName + '\'' +
                ", schDesc='" + schDesc + '\'' +
                '}';
    }

    private String schName;

    public int getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(int schoolid) {
        this.schoolid = schoolid;
    }

    public String getSchMajorName() {
        return schMajorName;
    }

    public void setSchMajorName(String schMajorName) {
        this.schMajorName = schMajorName;
    }

    public int getSchMajorId() {
        return schMajorId;
    }

    public void setSchMajorId(int schMajorId) {
        this.schMajorId = schMajorId;
    }

    public String getSchMajorSign() {
        return schMajorSign;
    }

    public void setSchMajorSign(String schMajorSign) {
        this.schMajorSign = schMajorSign;
    }

    public Date getSchMajorSubTime() {
        return schMajorSubTime;
    }

    public void setSchMajorSubTime(Date schMajorSubTime) {
        this.schMajorSubTime = schMajorSubTime;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchDesc() {
        return schDesc;
    }

    public void setSchDesc(String schDesc) {
        this.schDesc = schDesc;
    }

    private String schDesc;
}
