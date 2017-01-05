package com.hackathon.jdccollege.entities;

/**
 * Created by Arele-PC on 1/4/2017.
 */

public class Course {

    public static final String kid ="_id"                                    ;
    public static final String kname="name";
    public static final String kcollege_id=        "college_id";
    public static final String kcertification="certification";
    public static final String kduration=        "duration";
    public static final String kperiod="period";
    public static final String k_price=        "price";
    public static final String kdescription="description" ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getTeuda() {
        return teuda;
    }

    public void setTeuda(String teuda) {
        this.teuda = teuda;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRezifut() {
        return rezifut;
    }

    public void setRezifut(String rezifut) {
        this.rezifut = rezifut;
    }




    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreCourses() {
        return preCourses;
    }

    public void setPreCourses(String preCourses) {
        this.preCourses = preCourses;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String id;
   private String name;
   private String collegeId;
   private String teuda;
   private String duration;
   private String rezifut;


   private String price;
   private String description;
   private String preCourses;
   private String area;

    public Course(String id, String name, String collegeId, String teuda,
                  String duration, String rezifut, String price, String description,
                  String preCourses, String area) {
        this.id = id;
        this.collegeId = collegeId;

        this.teuda = teuda;
        this.duration = duration;
        this.rezifut = rezifut;
        this.name = name;
        this.price = price;
        this.description = description;
        this.preCourses = preCourses;
        this.area = area;
    }


}
