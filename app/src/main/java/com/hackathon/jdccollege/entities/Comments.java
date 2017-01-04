package com.hackathon.jdccollege.entities;

/**
 * Created by Arele-PC on 1/4/2017.
 */

public class Comments {
   public static final String kid= "_id";
   public static final String kcourseid= "course_id";
   public static final String kauthor= "author" ;
   public static final String krating=         "rating" ;
    String Id;
    String courseId;
    String text;
    String Author;
    String Rating;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public Comments(String id, String courseId, String text, String author, String rating) {

        Id = id;
        this.courseId = courseId;
        this.text = text;
        Author = author;
        Rating = rating;
    }
}
