package kz.keremet.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Column(name = "reg_no")
    private String reg_no;

    @Column(name = "model_id")
    private int model_id;

    @Column(name = "rate")
    private double rate;

    public Car() {
    }

    public Car(String reg_no, int model_id, double rate) {
        this.reg_no = reg_no;
        this.model_id = model_id;
        this.rate = rate;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
