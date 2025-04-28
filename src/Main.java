import entities.Course;
import entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // construct student
        Student student = new Student();
        student.setName("John");
        student.setRollNo(1);
        student.setEmail("abc@gmail.com");
        System.out.println(student.getName()+" "+student.getRollNo()+" "+student.getEmail());

        // construct course
        Course javaCourse = new Course();
        javaCourse.setCourseName("Java");
        javaCourse.setCourseId(1);

        Course pythonCourse = new Course();
        pythonCourse.setCourseName("Python");
        pythonCourse.setCourseId(2);

        List<Course> courseList = new ArrayList<>();
        courseList.add(javaCourse);
        courseList.add(pythonCourse);
        student.setCourse(courseList);
        for(Course course : student.getCourse()){
            System.out.println("Before: "+course.getCourseName());
        }

        // remove first course
        student.getCourse().remove(0);   //Java is removed now
        System.out.println("After removing first course: ");



        // update first course (now at index 0 after removal)
        Course updatedCourse = new Course();
        updatedCourse.setCourseName("Advanced Python");
        updatedCourse.setCourseId(3);
        student.getCourse().set(0, updatedCourse); // set new course at index 0
        System.out.println("This is updated at index 0: "+updatedCourse.getCourseName());

        // print updated course list
        for(Course course : student.getCourse()){
            System.out.println("After : "+course.getCourseName());
        }


    }

}


