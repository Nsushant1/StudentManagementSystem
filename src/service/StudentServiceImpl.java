package service;
import java.util.*;
import entities.Student;

public class StudentServiceImpl implements StudentService {

    private List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {
        this.students.add(student);
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < this.students.size()) {
            this.students.remove(index);
        } else {
            System.out.println("Invalid index. Cannot remove student.");
        }
    }

    @Override
    public void update(int index, Student student) {
        if (index >= 0 && index < this.students.size()) {
            this.students.set(index, student);
        } else {
            System.out.println("Invalid index. Cannot update student.");
        }
    }

    @Override
    public void printStudentList() {
        System.out.println("Student List:");
        for (Student student : this.students) {
            System.out.println("Name: " + student.getName() +
                    ", Roll No: " + student.getRollNo() +
                    ", Email: " + student.getEmail());
        }
    }

    @Override
    public List<Student> getStudentList() {
        return this.students;
    }
}



