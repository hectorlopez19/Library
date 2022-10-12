package view;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegisterLoanForm extends JFrame {
    private JPanel bgPanel;
    private JPanel studentPanel;
    private JPanel studentAlertPanel;
    private JLabel studentAlertLabel;
    private JLabel studentLabel;
    private JTextField studentTxt;
    private JPanel buttonsPanel;
    private JButton backButton;
    private JButton cleanButton;
    private JButton saveButton;
    private JPanel fieldsPanel;
    private JPanel headerPanel;
    private JLabel HeaderLabel;
    private JPanel bookPanel;
    private JPanel loanDatePanel;
    private JPanel bookAlertPanel;
    private JLabel bookAlertLabel;
    private JLabel bookLabel;
    private JTextField bookTxt;
    private JPanel loanDateAlertPanel;
    private JLabel loanDateAlertLabel;
    private JLabel loanDateLabel;
    private JTextField loanMonthTxt;
    private JLabel loanMonthLabel;
    private JLabel loanDayLabel;
    private JTextField loanDayTxt;
    private JLabel loanYearLabel;
    private JTextField loanYearTxt;
    private JPanel returnDatePanel;
    private JLabel returnDateLabel;
    private JPanel returnDateAlertPanel;
    private JLabel returnDateAlertLabel;
    private JLabel returnMonthLabel;
    private JTextField returnMonthTxt;
    private JLabel returnDayLabel;
    private JTextField returnDayTxt;
    private JLabel returnYearLabel;
    private JTextField returnYearTxt;


    public RegisterLoanForm(String title) {
        super(title);
        setContentPane(bgPanel);


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

    public JPanel getStudentPanel() {
        return studentPanel;
    }

    public void setStudentPanel(JPanel studentPanel) {
        this.studentPanel = studentPanel;
    }

    public JPanel getStudentAlertPanel() {
        return studentAlertPanel;
    }

    public void setStudentAlertPanel(JPanel studentAlertPanel) {
        this.studentAlertPanel = studentAlertPanel;
    }

    public JLabel getStudentAlertLabel() {
        return studentAlertLabel;
    }

    public void setStudentAlertLabel(JLabel studentAlertLabel) {
        this.studentAlertLabel = studentAlertLabel;
    }

    public JLabel getStudentLabel() {
        return studentLabel;
    }

    public void setStudentLabel(JLabel studentLabel) {
        this.studentLabel = studentLabel;
    }

    public JTextField getStudentTxt() {
        return studentTxt;
    }

    public void setStudentTxt(JTextField studentTxt) {
        this.studentTxt = studentTxt;
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

    public JPanel getBookPanel() {
        return bookPanel;
    }

    public void setBookPanel(JPanel bookPanel) {
        this.bookPanel = bookPanel;
    }

    public JPanel getLoanDatePanel() {
        return loanDatePanel;
    }

    public void setLoanDatePanel(JPanel loanDatePanel) {
        this.loanDatePanel = loanDatePanel;
    }

    public JPanel getBookAlertPanel() {
        return bookAlertPanel;
    }

    public void setBookAlertPanel(JPanel bookAlertPanel) {
        this.bookAlertPanel = bookAlertPanel;
    }

    public JLabel getBookAlertLabel() {
        return bookAlertLabel;
    }

    public void setBookAlertLabel(JLabel bookAlertLabel) {
        this.bookAlertLabel = bookAlertLabel;
    }

    public JLabel getBookLabel() {
        return bookLabel;
    }

    public void setBookLabel(JLabel bookLabel) {
        this.bookLabel = bookLabel;
    }

    public JTextField getBookTxt() {
        return bookTxt;
    }

    public void setBookTxt(JTextField bookTxt) {
        this.bookTxt = bookTxt;
    }

    public JPanel getLoanDateAlertPanel() {
        return loanDateAlertPanel;
    }

    public void setLoanDateAlertPanel(JPanel loanDateAlertPanel) {
        this.loanDateAlertPanel = loanDateAlertPanel;
    }

    public JLabel getLoanDateAlertLabel() {
        return loanDateAlertLabel;
    }

    public void setLoanDateAlertLabel(JLabel loanDateAlertLabel) {
        this.loanDateAlertLabel = loanDateAlertLabel;
    }

    public JLabel getLoanDateLabel() {
        return loanDateLabel;
    }

    public void setLoanDateLabel(JLabel loanDateLabel) {
        this.loanDateLabel = loanDateLabel;
    }

    public JTextField getLoanMonthTxt() {
        return loanMonthTxt;
    }

    public void setLoanMonthTxt(JTextField loanMonthTxt) {
        this.loanMonthTxt = loanMonthTxt;
    }

    public JLabel getLoanMonthLabel() {
        return loanMonthLabel;
    }

    public void setLoanMonthLabel(JLabel loanMonthLabel) {
        this.loanMonthLabel = loanMonthLabel;
    }

    public JLabel getLoanDayLabel() {
        return loanDayLabel;
    }

    public void setLoanDayLabel(JLabel loanDayLabel) {
        this.loanDayLabel = loanDayLabel;
    }

    public JTextField getLoanDayTxt() {
        return loanDayTxt;
    }

    public void setLoanDayTxt(JTextField loanDayTxt) {
        this.loanDayTxt = loanDayTxt;
    }

    public JLabel getLoanYearLabel() {
        return loanYearLabel;
    }

    public void setLoanYearLabel(JLabel loanYearLabel) {
        this.loanYearLabel = loanYearLabel;
    }

    public JTextField getLoanYearTxt() {
        return loanYearTxt;
    }

    public void setLoanYearTxt(JTextField loanYearTxt) {
        this.loanYearTxt = loanYearTxt;
    }

    public JPanel getReturnDatePanel() {
        return returnDatePanel;
    }

    public void setReturnDatePanel(JPanel returnDatePanel) {
        this.returnDatePanel = returnDatePanel;
    }

    public JLabel getReturnDateLabel() {
        return returnDateLabel;
    }

    public void setReturnDateLabel(JLabel returnDateLabel) {
        this.returnDateLabel = returnDateLabel;
    }

    public JPanel getReturnDateAlertPanel() {
        return returnDateAlertPanel;
    }

    public void setReturnDateAlertPanel(JPanel returnDateAlertPanel) {
        this.returnDateAlertPanel = returnDateAlertPanel;
    }

    public JLabel getReturnDateAlertLabel() {
        return returnDateAlertLabel;
    }

    public void setReturnDateAlertLabel(JLabel returnDateAlertLabel) {
        this.returnDateAlertLabel = returnDateAlertLabel;
    }

    public JLabel getReturnMonthLabel() {
        return returnMonthLabel;
    }

    public void setReturnMonthLabel(JLabel returnMonthLabel) {
        this.returnMonthLabel = returnMonthLabel;
    }

    public JTextField getReturnMonthTxt() {
        return returnMonthTxt;
    }

    public void setReturnMonthTxt(JTextField returnMonthTxt) {
        this.returnMonthTxt = returnMonthTxt;
    }

    public JLabel getReturnDayLabel() {
        return returnDayLabel;
    }

    public void setReturnDayLabel(JLabel returnDayLabel) {
        this.returnDayLabel = returnDayLabel;
    }

    public JTextField getReturnDayTxt() {
        return returnDayTxt;
    }

    public void setReturnDayTxt(JTextField returnDayTxt) {
        this.returnDayTxt = returnDayTxt;
    }

    public JLabel getReturnYearLabel() {
        return returnYearLabel;
    }

    public void setReturnYearLabel(JLabel returnYearLabel) {
        this.returnYearLabel = returnYearLabel;
    }

    public JTextField getReturnYearTxt() {
        return returnYearTxt;
    }

    public void setReturnYearTxt(JTextField returnYearTxt) {
        this.returnYearTxt = returnYearTxt;
    }
}