package entity;

import java.util.Date;

public class vacate {
    private String v_no;
    private String v_name;
    private String v_type;
    private String v_cause;
    private Date begintime;
    private Date finishtime;
    private String v_state;
    private Date committime;

    public String getV_no() {
        return v_no;
    }

    public void setV_no(String v_no) {
        this.v_no = v_no;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_type() {
        return v_type;
    }

    public void setV_type(String v_type) {
        this.v_type = v_type;
    }

    public String getV_cause() {
        return v_cause;
    }

    public void setV_cause(String v_cause) {
        this.v_cause = v_cause;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public String getV_state() {
        return v_state;
    }

    public void setV_state(String v_state) {
        this.v_state = v_state;
    }

    public Date getCommittime() {
        return committime;
    }

    public void setCommittime(Date committime) {
        this.committime = committime;
    }
}
