package com.in28miniutes.rest.webservices.restfulwebservices.user;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class User {


    public
    User(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    private Integer id;

    @Size(min=2)
    private String name;

    @Past
    private LocalDate birthDate;

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public
    LocalDate getBirthDate() {
        return birthDate;
    }

    public
    void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public
    Integer getId() {
        return id;
    }

    public
    void setId(Integer id) {
        this.id = id;
    }
    @Override
    public
    String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
