/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mthus
 */
public class Main {
    public static void main(String[] args) {
        Teacher nimal = new Teacher(1,"Nimal",500);
        Teacher sanath = new Teacher(2,"Sanath",700);
        Teacher kusuma = new Teacher(3,"Kusuma",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(nimal);
        teacherList.add(sanath);
        teacherList.add(kusuma);


        Student supun = new Student(1,"Supun",4);
        Student sadun = new Student(2,"Sadun",12);
        Student akila = new Student(3,"Akila",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(supun);
        studentList.add(sadun);
        studentList.add(akila);




        School abc = new School(teacherList,studentList);

        Teacher siriyawathi = new Teacher(6,"Siriyawathi", 900);

        abc.addTeacher(siriyawathi);


        supun.payFees(5000);
        sadun.payFees(6000);
        System.out.println("GHS has earned $"+ abc.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        nimal.receiveSalary(nimal.getSalary());
        System.out.println("GHS has spent for salary to " + nimal.getName()
        +" and now has $" + abc.getTotalMoneyEarned());

        kusuma.receiveSalary(kusuma.getSalary());
        System.out.println("GHS has spent for salary to " + kusuma.getName()
                +" and now has $" + abc.getTotalMoneyEarned());


        System.out.println(akila);

        sanath.receiveSalary(sanath.getSalary());

        System.out.println(sanath);


    }
    
}
