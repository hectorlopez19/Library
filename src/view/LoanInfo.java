package view;



import javax.swing.*;

public class LoanInfo extends JFrame {
    private JPanel bgPanel;
    private JPanel buttonsPanel;
    private JButton backButton;
    private JButton cleanButton;
    private JButton saveButton;
    private JPanel contentPanel;
    private JPanel headerPanel;
    private JLabel headerLabel;
    private JPanel loansListPanel;
    private JPanel loansInfoPanel;
    private JList loansList;
    private JLabel studentLabel;
    private JLabel BookLabel;
    private JLabel loanDateLabel;
    private JLabel returnDateLabel;
    private JLabel emptyInfoLabel;
    private JLabel datesLabel;
    private JSeparator separator;
    private JLabel studentNameLabel;
    private JLabel studentIdLabel;
    private JLabel studentCareerLabel;
    private JLabel studentGradeLabel;
    private JLabel bookTitleLabel;
    private JLabel bookAuthorLabel;
    private JLabel bookEditionLabel;
    private JLabel bookIdLabel;
    private JPanel studentInfoPanel;
    private JPanel bookInfoPanel;
    private JPanel datesInfoPanel;


    public LoanInfo(String title) {
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

    public JPanel getLoansListPanel() {
        return loansListPanel;
    }

    public void setLoansListPanel(JPanel loansListPanel) {
        this.loansListPanel = loansListPanel;
    }

    public JPanel getLoansInfoPanel() {
        return loansInfoPanel;
    }

    public void setLoansInfoPanel(JPanel loansInfoPanel) {
        this.loansInfoPanel = loansInfoPanel;
    }

    public JList getLoansList() {
        return loansList;
    }

    public void setLoansList(JList loansList) {
        this.loansList = loansList;
    }

    public JLabel getStudentLabel() {
        return studentLabel;
    }

    public void setStudentLabel(JLabel studentLabel) {
        this.studentLabel = studentLabel;
    }

    public JLabel getBookLabel() {
        return BookLabel;
    }

    public void setBookLabel(JLabel bookLabel) {
        BookLabel = bookLabel;
    }

    public JLabel getLoanDateLabel() {
        return loanDateLabel;
    }

    public void setLoanDateLabel(JLabel loanDateLabel) {
        this.loanDateLabel = loanDateLabel;
    }

    public JLabel getReturnDateLabel() {
        return returnDateLabel;
    }

    public void setReturnDateLabel(JLabel returnDateLabel) {
        this.returnDateLabel = returnDateLabel;
    }

    public JLabel getEmptyInfoLabel() {
        return emptyInfoLabel;
    }

    public void setEmptyInfoLabel(JLabel emptyInfoLabel) {
        this.emptyInfoLabel = emptyInfoLabel;
    }

    public JLabel getDatesLabel() {
        return datesLabel;
    }

    public void setDatesLabel(JLabel datesLabel) {
        this.datesLabel = datesLabel;
    }

    public JSeparator getSeparator() {
        return separator;
    }

    public void setSeparator(JSeparator separator) {
        this.separator = separator;
    }

    public JLabel getStudentNameLabel() {
        return studentNameLabel;
    }

    public void setStudentNameLabel(JLabel studentNameLabel) {
        this.studentNameLabel = studentNameLabel;
    }

    public JLabel getStudentIdLabel() {
        return studentIdLabel;
    }

    public void setStudentIdLabel(JLabel studentIdLabel) {
        this.studentIdLabel = studentIdLabel;
    }

    public JLabel getStudentCareerLabel() {
        return studentCareerLabel;
    }

    public void setStudentCareerLabel(JLabel studentCareerLabel) {
        this.studentCareerLabel = studentCareerLabel;
    }

    public JLabel getStudentGradeLabel() {
        return studentGradeLabel;
    }

    public void setStudentGradeLabel(JLabel studentGradeLabel) {
        this.studentGradeLabel = studentGradeLabel;
    }

    public JLabel getBookTitleLabel() {
        return bookTitleLabel;
    }

    public void setBookTitleLabel(JLabel bookTitleLabel) {
        this.bookTitleLabel = bookTitleLabel;
    }

    public JLabel getBookAuthorLabel() {
        return bookAuthorLabel;
    }

    public void setBookAuthorLabel(JLabel bookAuthorLabel) {
        this.bookAuthorLabel = bookAuthorLabel;
    }

    public JLabel getBookEditionLabel() {
        return bookEditionLabel;
    }

    public void setBookEditionLabel(JLabel bookEditionLabel) {
        this.bookEditionLabel = bookEditionLabel;
    }

    public JLabel getBookIdLabel() {
        return bookIdLabel;
    }

    public void setBookIdLabel(JLabel bookIdLabel) {
        this.bookIdLabel = bookIdLabel;
    }

    public JPanel getStudentInfoPanel() {
        return studentInfoPanel;
    }

    public void setStudentInfoPanel(JPanel studentInfoPanel) {
        this.studentInfoPanel = studentInfoPanel;
    }

    public JPanel getBookInfoPanel() {
        return bookInfoPanel;
    }

    public void setBookInfoPanel(JPanel bookInfoPanel) {
        this.bookInfoPanel = bookInfoPanel;
    }

    public JPanel getDatesInfoPanel() {
        return datesInfoPanel;
    }

    public void setDatesInfoPanel(JPanel datesInfoPanel) {
        this.datesInfoPanel = datesInfoPanel;
    }
}