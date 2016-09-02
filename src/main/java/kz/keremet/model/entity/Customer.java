package kz.keremet.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by HP on 02.09.2016.
 */
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "cust_id")
    private int cust_id;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "address")
    private String address;

    @Column(name = "cust_iin")
    private BigInteger cust_iin;

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getCust_iin() {
        return cust_iin;
    }

    public void setCust_iin(BigInteger cust_iin) {
        this.cust_iin = cust_iin;
    }
}
