package entity;

import java.util.Date;

public class expense {
    private String e_no;
    private String e_name;
    private String e_type;
    private Double e_money;
    private Date e_Date;
    private String e_state;

    public String getE_no() {
        return e_no;
    }

    public void setE_no(String e_no) {
        this.e_no = e_no;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_type() {
        return e_type;
    }

    public void setE_type(String e_type) {
        this.e_type = e_type;
    }

    public Double getE_money() {
        return e_money;
    }

    public void setE_money(Double e_money) {
        this.e_money = e_money;
    }

    public Date getE_Date() {
        return e_Date;
    }

    public void setE_Date(Date e_Date) {
        this.e_Date = e_Date;
    }

    public String getE_state() {
        return e_state;
    }

    public void setE_state(String e_state) {
        this.e_state = e_state;
    }
}
