package org.example.pojo;

import javax.persistence.*;


public class Address {

    private int addressId;
    private String hno;

    private String street;

    private String area;

    private String zipcode;


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
