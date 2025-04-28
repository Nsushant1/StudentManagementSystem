import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;

import java.util.List;
import java.util.Scanner;
import java.util.*;
public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();

        boolean runProgram = true;

        while (runProgram) {
            int choice;
            System.out.println("Enter \n 1 to add \n 2 to remove \n 3 to update \n 4 fetch students \n 5 to exit program");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // take new data from user and add
                    Student student = new Student();

                    System.out.println("Enter student name: ");
                    String name = scanner.next();

                    System.out.println("Enter student roll no: ");
                    Integer rollNo = scanner.nextInt();

                    System.out.println("Enter student email: ");
                    String email = scanner.next();

                    student.setName(name);
                    student.setRollNo(rollNo);
                    student.setEmail(email);

                    studentService.add(student);
                    System.out.println("Student added successfully !");
                    break;


                case 2:
                    // remove student
                    System.out.println("Enter index to remove: ");
                    int indexToRemove = scanner.nextInt();

                    List<Student> studentList = studentService.getStudentList();
                    if (indexToRemove >= 0 && indexToRemove < studentList.size()) {
                        studentService.remove(indexToRemove);
                        System.out.println("Student removed successfully !");
                    } else {
                        System.out.println("Invalid index, Cannot remove student.");
                    }
                    break;


                case 3:
                    // update students...
                    // ask user index
                    System.out.println("Enter index to update: ");
                    int indexToUpdate = scanner.nextInt();

                    // fetch data for that index and display data
                    List<Student> currentStudents = studentService.getStudentList();
                    if (indexToUpdate >= 0 && indexToUpdate < currentStudents.size()) {
                        Student studentToUpdate = currentStudents.get(indexToUpdate);
                        System.out.println("Current student data:");
                        System.out.println(studentToUpdate.getName() + " " + studentToUpdate.getRollNo() + " " + studentToUpdate.getEmail());

                        // ask user to enter new name and update at that index
                        System.out.println("Enter new name: ");
                        String newName = scanner.next();
                        studentToUpdate.setName(newName);

                        System.out.println("Student name updated successfully!");
                    } else {
                        System.out.println("Invalid index. No student updated.");
                    }
                    break;


                case 4:
                    // fetch students
                    List<Student> students = studentService.getStudentList();
                    System.out.println("Displaying all students in the list");
                    for (Student stdData : students) {
                        System.out.println(stdData.getName() + " " + stdData.getRollNo() + " " + stdData.getEmail());
                    }
                    break;


                case 5:
                    runProgram = false;
                    break;
//take user name
                case 6:

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

