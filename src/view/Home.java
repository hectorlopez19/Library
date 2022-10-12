/*
 * Created by JFormDesigner on Tue Oct 11 17:59:48 CDT 2022
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
import controller.HomeController;

/**
 * @author Hector Lopez
 */
public class Home extends JFrame {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hector Lopez
    private JPanel bgPanel;
    private JPanel headerPanel;
    private JLabel headerLabel;
    private JPanel contentPanel;
    private JPanel menuBarPanel;
    private JMenuBar menuBar;
    private JMenu studentsMenu;
    private JMenuItem registerStudentMenuItem;
    private JMenuItem showStudentsMenuItem;
    private JMenu loansMenu;
    private JMenuItem registerLoanMenuItem;
    private JMenuItem showLoansMenuItem;
    private JMenu booksMenu;
    private JMenuItem registerBookMenuItem;
    private JMenuItem showBooksMenuItem;
    private JButton logOutButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public Home(String title) {
        super(title);
        initComponents();
    }

    private void registerStudent(ActionEvent e) {
        HomeController.registerStudent();
    }

    private void showStudents(ActionEvent e) {
        HomeController.showStudents();
    }

    private void registerLoan(ActionEvent e) {
        HomeController.registerLoan();
    }

    private void showLoans(ActionEvent e) {
        HomeController.showLoans();
    }

    private void registerBook(ActionEvent e) {
        HomeController.registerBook();
    }

    private void showBooks(ActionEvent e) {
        HomeController.showBooks();
    }

    private void logOut(ActionEvent e) {
        HomeController.logOutBtnClicked();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hector Lopez
        bgPanel = new JPanel();
        headerPanel = new JPanel();
        headerLabel = new JLabel();
        contentPanel = new JPanel();
        menuBarPanel = new JPanel();
        menuBar = new JMenuBar();
        studentsMenu = new JMenu();
        registerStudentMenuItem = new JMenuItem();
        showStudentsMenuItem = new JMenuItem();
        loansMenu = new JMenu();
        registerLoanMenuItem = new JMenuItem();
        showLoansMenuItem = new JMenuItem();
        booksMenu = new JMenu();
        registerBookMenuItem = new JMenuItem();
        showBooksMenuItem = new JMenuItem();
        logOutButton = new JButton();

        //======== this ========
        setName("homeFrame");
        setMinimumSize(new Dimension(1000, 600));
        setTitle("TMC Library");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), 0, 0));

        //======== bgPanel ========
        {
            bgPanel.setPreferredSize(new Dimension(1000, 600));
            bgPanel.setBackground(new Color(0x222435));
            bgPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), 0, 0));

            //======== headerPanel ========
            {
                headerPanel.setMinimumSize(new Dimension(85, 10));
                headerPanel.setPreferredSize(new Dimension(1000, 250));
                headerPanel.setBorder(null);
                headerPanel.setBackground(new Color(0x222435));
                headerPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

                //---- headerLabel ----
                headerLabel.setIcon(new ImageIcon(getClass().getResource("/view/img/header-image.png")));
                headerLabel.setHorizontalTextPosition(SwingConstants.CENTER);
                headerLabel.setText("TMC LIBRARY");
                headerLabel.setIconTextGap(0);
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerLabel.setFont(new Font("Roboto Light", Font.PLAIN, 30));
                headerLabel.setForeground(Color.white);
                headerPanel.add(headerLabel, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            bgPanel.add(headerPanel, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== contentPanel ========
            {
                contentPanel.setPreferredSize(new Dimension(1000, 350));
                contentPanel.setBorder(null);
                contentPanel.setBackground(new Color(0x222435));
                contentPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 10, 0), -1, -1));

                //======== menuBarPanel ========
                {
                    menuBarPanel.setBackground(Color.white);
                    menuBarPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 20, 0, 20), -1, -1));

                    //======== menuBar ========
                    {
                        menuBar.setBackground(Color.white);
                        menuBar.setBorder(null);
                        menuBar.setBorderPainted(false);

                        //======== studentsMenu ========
                        {
                            studentsMenu.setText("Students");
                            studentsMenu.setBackground(Color.white);
                            studentsMenu.setPreferredSize(new Dimension(320, 33));
                            studentsMenu.setHorizontalTextPosition(SwingConstants.CENTER);
                            studentsMenu.setHorizontalAlignment(SwingConstants.CENTER);
                            studentsMenu.setBorder(null);
                            studentsMenu.setForeground(new Color(0x222435));

                            //---- registerStudentMenuItem ----
                            registerStudentMenuItem.setText("Register");
                            registerStudentMenuItem.setPreferredSize(new Dimension(320, 32));
                            registerStudentMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
                            registerStudentMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
                            registerStudentMenuItem.setBackground(new Color(0x2f344c));
                            registerStudentMenuItem.setBorder(null);
                            registerStudentMenuItem.setForeground(new Color(0xe4e4e4));
                            registerStudentMenuItem.addActionListener(e -> registerStudent(e));
                            studentsMenu.add(registerStudentMenuItem);

                            //---- showStudentsMenuItem ----
                            showStudentsMenuItem.setText("Show info");
                            showStudentsMenuItem.setPreferredSize(new Dimension(320, 32));
                            showStudentsMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
                            showStudentsMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
                            showStudentsMenuItem.setBackground(new Color(0x2f344c));
                            showStudentsMenuItem.setBorder(null);
                            showStudentsMenuItem.setForeground(new Color(0xe4e4e4));
                            showStudentsMenuItem.addActionListener(e -> showStudents(e));
                            studentsMenu.add(showStudentsMenuItem);
                        }
                        menuBar.add(studentsMenu);

                        //======== loansMenu ========
                        {
                            loansMenu.setText("Loans");
                            loansMenu.setBackground(Color.white);
                            loansMenu.setPreferredSize(new Dimension(320, 33));
                            loansMenu.setHorizontalTextPosition(SwingConstants.CENTER);
                            loansMenu.setHorizontalAlignment(SwingConstants.CENTER);
                            loansMenu.setBorder(null);
                            loansMenu.setForeground(new Color(0x222435));

                            //---- registerLoanMenuItem ----
                            registerLoanMenuItem.setText("Register");
                            registerLoanMenuItem.setPreferredSize(new Dimension(320, 32));
                            registerLoanMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
                            registerLoanMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
                            registerLoanMenuItem.setBackground(new Color(0x2f344c));
                            registerLoanMenuItem.setBorder(null);
                            registerLoanMenuItem.setForeground(new Color(0xe4e4e4));
                            registerLoanMenuItem.addActionListener(e -> registerLoan(e));
                            loansMenu.add(registerLoanMenuItem);

                            //---- showLoansMenuItem ----
                            showLoansMenuItem.setText("Show info");
                            showLoansMenuItem.setPreferredSize(new Dimension(320, 32));
                            showLoansMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
                            showLoansMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
                            showLoansMenuItem.setBackground(new Color(0x2f344c));
                            showLoansMenuItem.setBorder(null);
                            showLoansMenuItem.setForeground(new Color(0xe4e4e4));
                            showLoansMenuItem.addActionListener(e -> showLoans(e));
                            loansMenu.add(showLoansMenuItem);
                        }
                        menuBar.add(loansMenu);

                        //======== booksMenu ========
                        {
                            booksMenu.setText("Books");
                            booksMenu.setBackground(Color.white);
                            booksMenu.setPreferredSize(new Dimension(320, 33));
                            booksMenu.setHorizontalTextPosition(SwingConstants.CENTER);
                            booksMenu.setHorizontalAlignment(SwingConstants.CENTER);
                            booksMenu.setBorder(null);
                            booksMenu.setForeground(new Color(0x222435));

                            //---- registerBookMenuItem ----
                            registerBookMenuItem.setText("Register");
                            registerBookMenuItem.setPreferredSize(new Dimension(320, 32));
                            registerBookMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
                            registerBookMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
                            registerBookMenuItem.setBackground(new Color(0x2f344c));
                            registerBookMenuItem.setBorder(null);
                            registerBookMenuItem.setForeground(new Color(0xe4e4e4));
                            registerBookMenuItem.addActionListener(e -> registerBook(e));
                            booksMenu.add(registerBookMenuItem);

                            //---- showBooksMenuItem ----
                            showBooksMenuItem.setText("Show info");
                            showBooksMenuItem.setPreferredSize(new Dimension(320, 32));
                            showBooksMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
                            showBooksMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
                            showBooksMenuItem.setBackground(new Color(0x2f344c));
                            showBooksMenuItem.setBorder(null);
                            showBooksMenuItem.setForeground(new Color(0xe4e4e4));
                            showBooksMenuItem.addActionListener(e -> showBooks(e));
                            booksMenu.add(showBooksMenuItem);
                        }
                        menuBar.add(booksMenu);
                    }
                    menuBarPanel.add(menuBar, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                contentPanel.add(menuBarPanel, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- logOutButton ----
                logOutButton.setText("Log out");
                logOutButton.addActionListener(e -> logOut(e));
                contentPanel.add(logOutButton, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            bgPanel.add(contentPanel, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(bgPanel, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

}
