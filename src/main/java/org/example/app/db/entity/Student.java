package org.example.app.db.entity;

public class Student {
    private Long id;
    private String name;
    private int age;
    private String lastName;
    private String phone;
    private String birthplace;
    private Character gender;
    private String courseName;

    public Student(Long id, String name, int age, String lastName, String phone, String birthplace, Character gender, String courseName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.phone = phone;
        this.birthplace = birthplace;
        this.gender = gender;
        this.courseName = courseName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

        this.id = 0L;
        this.age = 0;
        this.name = "";
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

        @Override
        public String toString () {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", lastName='" + lastName + '\'' +
                    ", phone='" + phone + '\'' +
                    ", birthplace='" + birthplace + '\'' +
                    ", gender=" + gender +
                    ", courseName='" + courseName + '\'' +
                    '}';

        }
    }

