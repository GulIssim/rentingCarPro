package kz.keremet.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by HP on 02.09.2016.
 */
@Entity
@Table(name = "car_type")
public class CarType {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "model_id")
    private int model_id;

    @Column(name = "mark")
    private String mark;

    @Column(name = "model")
    private int model;

    @Column(name = "year")
    private int yaer;

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getYaer() {
        return yaer;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }
}
