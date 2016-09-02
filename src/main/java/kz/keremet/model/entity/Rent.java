package kz.keremet.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HP on 02.09.2016.
 */
@Entity
@Table(name = "rent")
public class Rent {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "rent_id")
    private int rent_id;

    @Column(name = "cust_id")
    private int cust_id;

    @Column(name = "reg_no")
    private String reg_no;

    @Column(name = "rent_date")
    private Date rent_date;

    @Column(name = "return_date")
    private Date return_date;

    public int getRent_id() {
        return rent_id;
    }

    public void setRent_id(int rent_id) {
        this.rent_id = rent_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public Date getRent_date() {
        return rent_date;
    }

    public void setRent_date(Date rent_date) {
        this.rent_date = rent_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
}
