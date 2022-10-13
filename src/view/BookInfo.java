package view;



import controller.BookInfoController;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookInfo extends JFrame {
    private JPanel bgPanel;
    private JPanel buttonsPanel;
    private JButton backButton;
    private JButton cleanButton;
    private JButton saveButton;
    private JPanel contentPanel;
    private JPanel headerPanel;
    private JLabel headerLabel;
    private JPanel booksListPanel;
    private JPanel booksInfoPanel;
    private JList booksList;
    private JLabel titleLabel;
    private JLabel authorLabel;
    private JLabel editionLabel;
    private JLabel idLabel;
    private JLabel emptyInfoLabel;


    public BookInfo(String title) {
        super(title);
        setContentPane(bgPanel);

        booksList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                BookInfoController.bookSelected();
            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BookInfoController.cleanBtnClicked();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BookInfoController.backBtnClicked();
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

    public JPanel getBooksListPanel() {
        return booksListPanel;
    }

    public void setBooksListPanel(JPanel booksListPanel) {
        this.booksListPanel = booksListPanel;
    }

    public JPanel getBooksInfoPanel() {
        return booksInfoPanel;
    }

    public void setBooksInfoPanel(JPanel booksInfoPanel) {
        this.booksInfoPanel = booksInfoPanel;
    }

    public JList getBooksList() {
        return booksList;
    }

    public void setBooksList(JList booksList) {
        this.booksList = booksList;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    public JLabel getAuthorLabel() {
        return authorLabel;
    }

    public void setAuthorLabel(JLabel authorLabel) {
        this.authorLabel = authorLabel;
    }

    public JLabel getEditionLabel() {
        return editionLabel;
    }

    public void setEditionLabel(JLabel editionLabel) {
        this.editionLabel = editionLabel;
    }

    public JLabel getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel) {
        this.idLabel = idLabel;
    }

    public JLabel getEmptyInfoLabel() {
        return emptyInfoLabel;
    }

    public void setEmptyInfoLabel(JLabel emptyInfoLabel) {
        this.emptyInfoLabel = emptyInfoLabel;
    }
}