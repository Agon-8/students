//package org.example;
//
//import org.example.app.db.DBConnection;
//import org.example.app.db.entity.Student;
//import org.example.app.repository.StudentRepository;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//
//        DBConnection dbc = new DBConnection();
//        dbc.connect();
//        StudentRepository studentRepo = new StudentRepository(dbc);
//        studentRepo.createStudent(new Student("Rigon",17));
//        Student studenti =  studentRepo.findStudentById(1L);
//        System.out.println(studenti);
//
//        }
//    }
////find all students
package org.example;

import com.sun.jdi.LongValue;
import org.example.app.db.DBConnection;
import org.example.app.db.entity.Student;
import org.example.app.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        DBConnection dbc = new DBConnection();

        StudentRepository studentRepo = new StudentRepository(dbc);

//        studentRepo.createStudent(new Student("Rigon", 17));

//        Student newStudent = new Student(0L,"Hajdar",21,"Hasani","949093","Podujeve",'M',"Pitagoras");
//        studentRepo.createStudent(newStudent);

        System.out.println(studentRepo.kthejTeGjitheStudentet());

        while (true) {

            System.out.println("Press 1 if u want to see the list of students");
            System.out.println("Press 2 if u want to uptade a Students");
            System.out.println("Press 3 if u want to delete a Students");
            System.out.println("Press x if u want to exit");

            String input = scanner.nextLine();
            if(input.equals("x")) {
                break;

            }else if (input.equals(("1"))) {
                List<Student> students = studentRepo.kthejTeGjitheStudentet();
                students.stream().forEach((Student s) -> {
                    System.out.println(s);
                });
            } else if (input.equals("2")) {
                System.out.println("Which student should I update ,tell me the id");
                String id = scanner.nextLine();
                Student studenti = studentRepo.findStudentById(Long.valueOf(id));
                if (studenti == null) {
                    System.out.println("Student was not found");
                } else {
                    System.out.println(studenti);
                    System.out.println("Please tell new name and new age");
                    System.out.println("If u dont want to change plase leave it blank");
                    System.out.println("Name:");
                    String emriIRi = scanner.nextLine();
                    System.out.println("Age:");
                    int moshaERe = 0;
                    String moshaInput = scanner.nextLine();
                    if (!moshaInput.isEmpty()) {
                        moshaERe = Integer.valueOf(moshaInput);
                    }
                    System.out.println("Last name:");
                    String lastNameR = scanner.nextLine();
                    System.out.println("Phone:");
                    String phoneR = scanner.nextLine();
                    System.out.println("Gender:");
                    String genderR = scanner.nextLine();
                    System.out.println("Birthplace:");
                    String birthPlaceR = scanner.nextLine();
                    System.out.println("Course name:");
                    String courseNameR = scanner.nextLine();


                    Student updatedStudent = new Student();
                    if (emriIRi.isEmpty()) {
                        updatedStudent.setName(studenti.getName());
                    } else {
                        updatedStudent.setName(emriIRi);
                    }
                    if (moshaERe == 0) {
                        updatedStudent.setAge(studenti.getAge());
                    } else {
                        updatedStudent.setAge(moshaERe);
                    }
                    if (lastNameR.isEmpty()){
                        updatedStudent.setLastName(studenti.getLastName());
                    } else {
                        updatedStudent.setLastName(lastNameR);
                    }
                    if (phoneR.isEmpty()){
                        updatedStudent.setPhone(studenti.getPhone());
                    } else {
                        updatedStudent.setPhone(phoneR);
                    }
                    if (genderR.isEmpty()){
                        updatedStudent.setGender(studenti.getGender());
                    } else {
                        updatedStudent.setGender(genderR.charAt(0));

                    }
                    if (birthPlaceR.isEmpty()){
                        updatedStudent.setBirthplace(studenti.getBirthplace());
                    } else {
                        updatedStudent.setBirthplace(birthPlaceR);
                    }
                    if (courseNameR.isEmpty()){
                        updatedStudent.setCourseName(studenti.getCourseName());
                    } else {
                        updatedStudent.setCourseName(courseNameR);
                    }


                        studentRepo.updateStudent(studenti.getId(), updatedStudent);
                }
            }else if(input.equals("3")){
                System.out.println("Which student should I delete ,tell me the id");
                String id = scanner.nextLine();
                Student studenti = studentRepo.findStudentById(Long.valueOf(id));
                if(studenti == null){
                    System.out.println("User has not been found");
                }else{
                    studentRepo.deleteStudent(Long.valueOf(id));
                }
            }
        }
    }
}
