package service;
import java.util.*;
import entities.Student;


public interface StudentService {
    // add
    void add(Student student);

    // remove
    void remove(int index);

    // update
    void update(int index, Student student);


    // print
    void printStudentList();

    // get

    List<Student> getStudentList();
}

