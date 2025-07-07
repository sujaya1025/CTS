package com.example.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentappApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(StudentappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Student("Alice"));
        repo.save(new Student("Bob"));

        repo.findAll().forEach(student -> System.out.println(student.getName()));
    }
}
