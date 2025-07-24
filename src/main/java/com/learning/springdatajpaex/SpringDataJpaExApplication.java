package com.learning.springdatajpaex;

import com.learning.springdatajpaex.model.Student;
import com.learning.springdatajpaex.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);
        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);


//        s1.setRollNo(101);
//        s1.setName("Mukesh");
//        s1.setMarks(88);
//
//        s2.setRollNo(102);
//        s2.setName("Sunny");
//        s2.setMarks(92);
//
//        s3.setRollNo(103);
//        s3.setName("Honey");
//        s3.setMarks(96);
//
//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

//        Optional<Student> s = repo.findById(105);
//        System.out.println(s.orElse(new Student()));
//
//        System.out.println(repo.findByName("Honey"));
//
//        System.out.println(repo.findByMarks(88));
//
//        System.out.println(repo.findByMarksGreaterThan(90));
//
//        s1.setMarks(90);
//
//        repo.save(s1);
//
//        System.out.println(repo.findById(101));

        s1.setRollNo(101);
        s1.setName("Mukesh Kumar");
        s1.setMarks(100);
        repo.save(s1);

        System.out.println(s1);

        repo.delete(s1);

    }


}

