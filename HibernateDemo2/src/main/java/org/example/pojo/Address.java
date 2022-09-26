package org.example.pojo;

import javax.persistence.*;

@Entity
@Table(name="tbladdress")
public class Address {
    @Id
    private int addressId;
    @Column(length = 10)
    private String hno;
    @Column(length = 15)
    private String street;
    @Column(length = 10)
    private String area;
    @Column(length = 10)
    private String zipcode;

    //foreign as non-primary key
    @OneToOne
    @JoinColumn(name="customerId")
    private Customer customerId;

    public Address() {}

    public Address(int addressId, String hno, String street, String area, String zipcode) {
        this.addressId = addressId;
        this.hno = hno;
        this.street = street;
        this.area = area;
        this.zipcode = zipcode;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getHno() {
        return hno;
    }

    public void sethno(String hNo) {
        this.hno = hNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
