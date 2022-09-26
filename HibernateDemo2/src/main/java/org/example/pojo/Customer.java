package org.example.pojo;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="tblCustomer") //optional
public class Customer {
    @Id
    private int customerId;
    @Column(length = 25, nullable = false)
    private String customerName;
    @Column(nullable = false)
    private LocalDate dob;
    @Column(length = 10, nullable = false)
    private String mobile;
//    @OneToOne
//    @JoinColumn(unique = true, name="addressid")
//    private Address addressid;

    public Customer(int customerId, String customerName, LocalDate dob, String mobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.dob = dob;
        this.mobile = mobile;
    }

    public Customer() {}

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
