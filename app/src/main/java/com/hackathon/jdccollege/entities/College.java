package com.hackathon.jdccollege.entities;

/**
 * Created by Arele-PC on 1/4/2017.
 */

public class College {
    public static final String kid  ="_id" ;
    public static final String kname  ="name" ;
    public static final String kwebsite  =        "web_site";
    public static final String kphone  =        "phone" ;
    public static final String kadress  =        "address";

    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWeb_Site() {
        return Web_Site;
    }

    public void setWeb_Site(String web_Site) {
        Web_Site = web_Site;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    private String Name;
    private String Web_Site;
    private String Phone;
    private String Address;

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    private String Town;

    public College(String id, String name, String web_site, String phone, String address,String town) {
        ID = id;
        Name = name;
        Web_Site = web_site;
        Phone = phone;
        Address = address;
        Town= town;

    }
}
