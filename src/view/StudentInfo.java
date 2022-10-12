package view;



import javax.swing.*;

public class StudentInfo extends JFrame {
    private JPanel bgPanel;
    private JPanel buttonsPanel;
    private JButton backButton;
    private JButton cleanButton;
    private JButton saveButton;
    private JPanel contentPanel;
    private JPanel headerPanel;
    private JLabel headerLabel;
    private JPanel studentsListPanel;
    private JPanel studentsInfoPanel;
    private JList studentsList;
    private JLabel nameLabel;
    private JLabel idLabel;
    private JLabel careerLabel;
    private JLabel gradeLabel;
    private JLabel emptyInfoLabel;


    public StudentInfo(String title) {
        super(title);
        setContentPane(bgPanel);



    }


    // ------------------------------ Getter and Setters ------------------------------
    public JPanel getBgPanel() {
        return bgPanel;
    }

    public void setBgPanel(JPanel bgPanel) {
        this.bgPanel = bgPanel;
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public void setButtonsPanel(JPanel buttonsPanel) {
        this.buttonsPanel = buttonsPanel;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JButton getCleanButton() {
        return cleanButton;
    }

    public void setCleanButton(JButton cleanButton) {
        this.cleanButton = cleanButton;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JPanel getHeaderPanel() {
        return headerPanel;
    }

    public void setHeaderPanel(JPanel headerPanel) {
        this.headerPanel = headerPanel;
    }

    public JLabel getHeaderLabel() {
        return headerLabel;
    }

    public void setHeaderLabel(JLabel headerLabel) {
        this.headerLabel = headerLabel;
    }

    public JPanel getStudentsListPanel() {
        return studentsListPanel;
    }

    public void setStudentsListPanel(JPanel studentsListPanel) {
        this.studentsListPanel = studentsListPanel;
    }

    public JPanel getStudentsInfoPanel() {
        return studentsInfoPanel;
    }

    public void setStudentsInfoPanel(JPanel studentsInfoPanel) {
        this.studentsInfoPanel = studentsInfoPanel;
    }

    public JList getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(JList studentsList) {
        this.studentsList = studentsList;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JLabel getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel) {
        this.idLabel = idLabel;
    }

    public JLabel getCareerLabel() {
        return careerLabel;
    }

    public void setCareerLabel(JLabel careerLabel) {
        this.careerLabel = careerLabel;
    }

    public JLabel getGradeLabel() {
        return gradeLabel;
    }

    public void setGradeLabel(JLabel gradeLabel) {
        this.gradeLabel = gradeLabel;
    }

    public JLabel getEmptyInfoLabel() {
        return emptyInfoLabel;
    }

    public void setEmptyInfoLabel(JLabel emptyInfoLabel) {
        this.emptyInfoLabel = emptyInfoLabel;
    }
}