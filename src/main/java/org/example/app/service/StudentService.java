package org.example.app.service;

import org.example.app.db.entity.Pagesa;
import org.example.app.db.entity.Student;
import org.example.app.repository.PagesaRepository;
import org.example.app.repository.StudentRepository;

import java.sql.Date;

public class StudentService {

    private StudentRepository studentRepo;
    private PagesaRepository pagesaRepo;

    public StudentService(StudentRepository sRepo,PagesaRepository pagesaRepo) {
        this.studentRepo = sRepo;
        this.pagesaRepo = pagesaRepo;
    }

    public void createStudent(Student newStudent){
        studentRepo.createStudent(newStudent);

        newStudent = studentRepo.findLastStudent();

        for(int i = 0; i <= 10;i++){
            Pagesa pagesa = new Pagesa(0L,newStudent.getId(),new Date(2024-1900,i,1),new Date(2024-1900,i+1,1),false,null);
            pagesaRepo.createPagesa(pagesa);
        }
    }

}
