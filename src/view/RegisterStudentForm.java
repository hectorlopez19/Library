package view;


import controller.RegisterStudentFormController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegisterStudentForm extends JFrame {
    private JPanel bgPanel;
    private JPanel namePanel;
    private JPanel nameAlertPanel;
    private JLabel nameAlertLabel;
    private JLabel nameLabel;
    private JTextField nameTxt;
    private JPanel buttonsPanel;
    private JButton backButton;
    private JButton cleanButton;
    private JButton saveButton;
    private JPanel fieldsPanel;
    private JPanel headerPanel;
    private JLabel HeaderLabel;
    private JPanel idPanel;
    private JPanel careerPanel;
    private JPanel gradePanel;
    private JPanel idAlertPanel;
    private JLabel idAlertLabel;
    private JLabel idLabel;
    private JTextField idTxt;
    private JPanel careerAlertPanel;
    private JLabel careerAlertLabel;
    private JLabel careerLabel;
    private JTextField careerTxt;
    private JPanel gradeAlertPanel;
    private JLabel gradeAlertLabel;
    private JLabel gradeLabel;
    private JTextField gradeTxt;


    public RegisterStudentForm(String title) {
        super(title);
        setContentPane(bgPanel);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterStudentFormController.saveBtnClicked();
            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterStudentFormController.cleanBtnClicked();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterStudentFormController.backBtnClicked();
            }
        });
    }


    // ------------------------------ Getter and Setters ------------------------------
    public JPanel getBgPanel() {
        return bgPanel;
    }

    public void setBgPanel(JPanel bgPanel) {
        this.bgPanel = bgPanel;
    }

    public JPanel getNamePanel() {
        return namePanel;
    }

    public void setNamePanel(JPanel namePanel) {
        this.namePanel = namePanel;
    }

    public JPanel getNameAlertPanel() {
        return nameAlertPanel;
    }

    public void setNameAlertPanel(JPanel nameAlertPanel) {
        this.nameAlertPanel = nameAlertPanel;
    }

    public JLabel getNameAlertLabel() {
        return nameAlertLabel;
    }

    public void setNameAlertLabel(JLabel nameAlertLabel) {
        this.nameAlertLabel = nameAlertLabel;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public void setNameTxt(JTextField nameTxt) {
        this.nameTxt = nameTxt;
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

    public JPanel getFieldsPanel() {
        return fieldsPanel;
    }

    public void setFieldsPanel(JPanel fieldsPanel) {
        this.fieldsPanel = fieldsPanel;
    }

    public JPanel getHeaderPanel() {
        return headerPanel;
    }

    public void setHeaderPanel(JPanel headerPanel) {
        this.headerPanel = headerPanel;
    }

    public JLabel getHeaderLabel() {
        return HeaderLabel;
    }

    public void setHeaderLabel(JLabel headerLabel) {
        HeaderLabel = headerLabel;
    }

    public JPanel getIdPanel() {
        return idPanel;
    }

    public void setIdPanel(JPanel idPanel) {
        this.idPanel = idPanel;
    }

    public JPanel getCareerPanel() {
        return careerPanel;
    }

    public void setCareerPanel(JPanel careerPanel) {
        this.careerPanel = careerPanel;
    }

    public JPanel getGradePanel() {
        return gradePanel;
    }

    public void setGradePanel(JPanel gradePanel) {
        this.gradePanel = gradePanel;
    }

    public JPanel getIdAlertPanel() {
        return idAlertPanel;
    }

    public void setIdAlertPanel(JPanel idAlertPanel) {
        this.idAlertPanel = idAlertPanel;
    }

    public JLabel getIdAlertLabel() {
        return idAlertLabel;
    }

    public void setIdAlertLabel(JLabel idAlertLabel) {
        this.idAlertLabel = idAlertLabel;
    }

    public JLabel getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel) {
        this.idLabel = idLabel;
    }

    public JTextField getIdTxt() {
        return idTxt;
    }

    public void setIdTxt(JTextField idTxt) {
        this.idTxt = idTxt;
    }

    public JPanel getCareerAlertPanel() {
        return careerAlertPanel;
    }

    public void setCareerAlertPanel(JPanel careerAlertPanel) {
        this.careerAlertPanel = careerAlertPanel;
    }

    public JLabel getCareerAlertLabel() {
        return careerAlertLabel;
    }

    public void setCareerAlertLabel(JLabel careerAlertLabel) {
        this.careerAlertLabel = careerAlertLabel;
    }

    public JLabel getCareerLabel() {
        return careerLabel;
    }

    public void setCareerLabel(JLabel careerLabel) {
        this.careerLabel = careerLabel;
    }

    public JTextField getCareerTxt() {
        return careerTxt;
    }

    public void setCareerTxt(JTextField careerTxt) {
        this.careerTxt = careerTxt;
    }

    public JPanel getGradeAlertPanel() {
        return gradeAlertPanel;
    }

    public void setGradeAlertPanel(JPanel gradeAlertPanel) {
        this.gradeAlertPanel = gradeAlertPanel;
    }

    public JLabel getGradeAlertLabel() {
        return gradeAlertLabel;
    }

    public void setGradeAlertLabel(JLabel gradeAlertLabel) {
        this.gradeAlertLabel = gradeAlertLabel;
    }

    public JLabel getGradeLabel() {
        return gradeLabel;
    }

    public void setGradeLabel(JLabel gradeLabel) {
        this.gradeLabel = gradeLabel;
    }

    public JTextField getGradeTxt() {
        return gradeTxt;
    }

    public void setGradeTxt(JTextField gradeTxt) {
        this.gradeTxt = gradeTxt;
    }
}