package org.example.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BankDetails implements Serializable {

    //foreign as primary key
    @Id
    @OneToOne
    @JoinColumn(name="customerId")
    private Customer customerId;

    @Column(length = 12)
    private String accountNo;

    @Column(length = 20)
    private String bankName;

    public BankDetails() {}

    public BankDetails(Customer customerId, String accountNo, String bankName) {
        this.customerId = customerId;
        this.accountNo = accountNo;
        this.bankName = bankName;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
