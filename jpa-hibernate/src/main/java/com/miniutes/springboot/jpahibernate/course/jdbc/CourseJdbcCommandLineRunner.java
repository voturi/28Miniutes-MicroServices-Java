package com.miniutes.springboot.jpahibernate.course.jdbc;

import com.miniutes.springboot.jpahibernate.course.jdbc.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBCRepository repository;
    @Override  public void run(String... args) throws Exception {
         repository.insert(new Course(1,"LearnKAfka1", "Praveen"));
        repository.insert(new Course(23,"LearnKAfka", "Praveen"));
        repository.insert(new Course(22,"SOLID", "Voturi"));


        repository.delete(23);
       System.out.println( repository.search(1));
        System.out.println( repository.search(22));

    }
}
