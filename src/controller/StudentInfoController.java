package controller;

import model.Model;
import model.Student;
import view.RegisterStudentForm;
import view.StudentInfo;

public class StudentInfoController {
    public static StudentInfo studentInfo = new StudentInfo("Students info");
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        studentInfo.setSize(1000, 600);
        studentInfo.setLocationRelativeTo(null);
        studentInfo.setVisible(true);
        reset();
        showStudents();
    }

    public static void end() {
        studentInfo.setVisible(false);
    }

    public static void reset() {
        studentInfo.getNameLabel().setText("");
        studentInfo.getIdLabel().setText("");
        studentInfo.getCareerLabel().setText("");
        studentInfo.getGradeLabel().setText("");
        studentInfo.getStudentsList().clearSelection();
    }

    // -------------------------------------------------- Functions --------------------------------------------------
    public static String[] strStudents() {
        String[] students = new String[model.getStudents().length()];
        for(int i = 0; i < students.length; i++) {
            Student actualStudent = model.getStudents().valueOf(i);
            students[i] = actualStudent.getId() + "   " + actualStudent.getName();
        }
        return students;
    }

    public static void showStudents() {
        if(model.getStudents().length() > 0 ) {
            studentInfo.getStudentsListPanel().setVisible(true);
            studentInfo.getStudentsInfoPanel().setVisible(true);
            studentInfo.getEmptyInfoLabel().setVisible(false);
            studentInfo.getStudentsList().setListData(strStudents());
        }
        else {
            studentInfo.getStudentsListPanel().setVisible(false);
            studentInfo.getStudentsInfoPanel().setVisible(false);
            studentInfo.getEmptyInfoLabel().setVisible(true);
        }
    }

    public static void showStudentInfo(Student student) {
        studentInfo.getNameLabel().setText("Name: " + student.getName());
        studentInfo.getIdLabel().setText("ID: " + student.getId());
        studentInfo.getCareerLabel().setText("Career: " + student.getCareer());
        studentInfo.getGradeLabel().setText("Grade: " + student.getGrade());
    }

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void studentSelected() {
        int index = studentInfo.getStudentsList().getSelectedIndex();
        showStudentInfo(model.getStudents().valueOf(index));
    }

    public static void cleanBtnClicked() {
        reset();
    }

    public static void backBtnClicked() {
        end();
        HomeController.start();
    }
}
