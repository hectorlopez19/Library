package view;



import controller.RegisterBookFormController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterBookForm extends JFrame {
    private JPanel bgPanel;
    private JPanel titlePanel;
    private JPanel titleAlertPanel;
    private JLabel titleAlertLabel;
    private JLabel titleLabel;
    private JTextField titleTxt;
    private JPanel buttonsPanel;
    private JButton backButton;
    private JButton cleanButton;
    private JButton saveButton;
    private JPanel fieldsPanel;
    private JPanel headerPanel;
    private JLabel HeaderLabel;
    private JPanel authorPanel;
    private JPanel editionPanel;
    private JPanel idPanel;
    private JPanel authorAlertPanel;
    private JLabel authorAlertLabel;
    private JLabel authorLabel;
    private JTextField authorTxt;
    private JPanel editionAlertPanel;
    private JLabel editionAlertLabel;
    private JLabel editionLabel;
    private JTextField editionTxt;
    private JPanel idAlertPanel;
    private JLabel idAlertLabel;
    private JLabel idLabel;
    private JTextField idTxt;


    public RegisterBookForm(String title) {
        super(title);
        setContentPane(bgPanel);


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterBookFormController.saveBtnClicked();
            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterBookFormController.cleanBtnClicked();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterBookFormController.backBtnClicked();
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

    public JPanel getTitlePanel() {
        return titlePanel;
    }

    public void setTitlePanel(JPanel titlePanel) {
        this.titlePanel = titlePanel;
    }

    public JPanel getTitleAlertPanel() {
        return titleAlertPanel;
    }

    public void setTitleAlertPanel(JPanel titleAlertPanel) {
        this.titleAlertPanel = titleAlertPanel;
    }

    public JLabel getTitleAlertLabel() {
        return titleAlertLabel;
    }

    public void setTitleAlertLabel(JLabel titleAlertLabel) {
        this.titleAlertLabel = titleAlertLabel;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    public JTextField getTitleTxt() {
        return titleTxt;
    }

    public void setTitleTxt(JTextField titleTxt) {
        this.titleTxt = titleTxt;
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

    public JPanel getAuthorPanel() {
        return authorPanel;
    }

    public void setAuthorPanel(JPanel authorPanel) {
        this.authorPanel = authorPanel;
    }

    public JPanel getEditionPanel() {
        return editionPanel;
    }

    public void setEditionPanel(JPanel editionPanel) {
        this.editionPanel = editionPanel;
    }

    public JPanel getIdPanel() {
        return idPanel;
    }

    public void setIdPanel(JPanel idPanel) {
        this.idPanel = idPanel;
    }

    public JPanel getAuthorAlertPanel() {
        return authorAlertPanel;
    }

    public void setAuthorAlertPanel(JPanel authorAlertPanel) {
        this.authorAlertPanel = authorAlertPanel;
    }

    public JLabel getAuthorAlertLabel() {
        return authorAlertLabel;
    }

    public void setAuthorAlertLabel(JLabel authorAlertLabel) {
        this.authorAlertLabel = authorAlertLabel;
    }

    public JLabel getAuthorLabel() {
        return authorLabel;
    }

    public void setAuthorLabel(JLabel authorLabel) {
        this.authorLabel = authorLabel;
    }

    public JTextField getAuthorTxt() {
        return authorTxt;
    }

    public void setAuthorTxt(JTextField authorTxt) {
        this.authorTxt = authorTxt;
    }

    public JPanel getEditionAlertPanel() {
        return editionAlertPanel;
    }

    public void setEditionAlertPanel(JPanel editionAlertPanel) {
        this.editionAlertPanel = editionAlertPanel;
    }

    public JLabel getEditionAlertLabel() {
        return editionAlertLabel;
    }

    public void setEditionAlertLabel(JLabel editionAlertLabel) {
        this.editionAlertLabel = editionAlertLabel;
    }

    public JLabel getEditionLabel() {
        return editionLabel;
    }

    public void setEditionLabel(JLabel editionLabel) {
        this.editionLabel = editionLabel;
    }

    public JTextField getEditionTxt() {
        return editionTxt;
    }

    public void setEditionTxt(JTextField editionTxt) {
        this.editionTxt = editionTxt;
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
}