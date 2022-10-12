package model;

public class Student {
    private String name;
    private String id;
    private String career;
    private int grade;

    public Student(String name, String id, String career, int grade) {
        this.name = name;
        this.id = id;
        this.career = career;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
