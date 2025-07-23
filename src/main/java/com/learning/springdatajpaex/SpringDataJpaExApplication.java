package com.learning.springdatajpaex;

import com.learning.springdatajpaex.model.Student;
import com.learning.springdatajpaex.model.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);
        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);



        s1.setRollNo(101);
        s1.setName("Mukesh");
        s1.setMarks(88);

        s2.setRollNo(102);
        s2.setName("Sunny");
        s2.setMarks(92);

        s3.setRollNo(103);
        s3.setName("Honey");
        s3.setMarks(96);

        repo.save(s3);



    }

}
