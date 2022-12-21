package com.miniutes.springboot.jpahibernate.course.jdbc.course;

public class Course {
    private int id;
    private String name;
    private String author;

    public
    Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public
    Course() {

    }

    public
    int getId() {
        return id;
    }

    public
    void setId(int id) {
        this.id = id;
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public
    String getAuthor() {
        return author;
    }

    public
    void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public
    String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
