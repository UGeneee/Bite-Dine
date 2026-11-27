package hci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDriven extends JFrame {

    JLabel lblFirst = new JLabel("First Name:", SwingConstants.CENTER);
    JLabel lblLast = new JLabel("Last Name:", SwingConstants.CENTER);
    JLabel lblMiddle = new JLabel("Middle Name:", SwingConstants.CENTER);
    JLabel lblMobile = new JLabel("Mobile Number:", SwingConstants.CENTER);
    JLabel lblEmail = new JLabel("Email Address:", SwingConstants.CENTER);

    JTextField txtFirst = new JTextField(20);
    JTextField txtLast = new JTextField(20);
    JTextField txtMiddle = new JTextField(20);
    JTextField txtMobile = new JTextField(20);
    JTextField txtEmail = new JTextField(20);

    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear All");

    JPanel panel = new JPanel();
    JPanel buttonPanel = new JPanel();

    JFrame outputFrame;
    JTextArea outputArea;
    JButton btnOkay;

    public EventDriven() {
        super("INPUT");
        setSize(300, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font bold = new Font("Arial", Font.BOLD, 13);
        lblFirst.setFont(bold);
        lblLast.setFont(bold);
        lblMiddle.setFont(bold);
        lblMobile.setFont(bold);
        lblEmail.setFont(bold);

        panel.setLayout(new GridLayout(10, 1, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        panel.add(lblFirst);
        panel.add(txtFirst);
        panel.add(lblLast);
        panel.add(txtLast);
        panel.add(lblMiddle);
        panel.add(txtMiddle);
        panel.add(lblMobile);
        panel.add(txtMobile);
        panel.add(lblEmail);
        panel.add(txtEmail);

        buttonPanel.add(btnSubmit);
        buttonPanel.add(btnClear);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        btnSubmit.addActionListener(new btnSubmit());
        btnClear.addActionListener(new btnClearAll());

        setVisible(true);
    }

    class btnSubmit implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            outputFrame = new JFrame("OUTPUT");
            outputFrame.setSize(320, 280);
            outputFrame.setLocation(getX() + getWidth() + 10, getY() + 60);
            outputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            outputArea = new JTextArea();
            outputArea.setEditable(false);
            outputArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
            outputArea.setMargin(new Insets(15, 15, 15, 15));
            outputArea.setText(
                    String.format("%-14s%s%n", "First Name:", txtFirst.getText())
                    + String.format("%-14s%s%n", "Last Name:", txtLast.getText())
                    + String.format("%-14s%s%n", "Middle Name:", txtMiddle.getText())
                    + String.format("%-14s%s%n", "Mobile No.:", txtMobile.getText())
                    + String.format("%-14s%s%n", "Email Add:", txtEmail.getText()));

            btnOkay = new JButton("Okay");
            btnOkay.addActionListener(new btnOkay());
            JPanel okPanel = new JPanel();
            okPanel.add(btnOkay);

            outputFrame.add(new JScrollPane(outputArea), BorderLayout.CENTER);
            outputFrame.add(okPanel, BorderLayout.SOUTH);
            outputFrame.setVisible(true);

            btnSubmit.setEnabled(false);
        }
    }

    class btnClearAll implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            clearFields();
            if (outputFrame != null) {
                outputFrame.dispose();
            }
            btnSubmit.setEnabled(true);
        }
    }

    class btnOkay implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            outputFrame.dispose();
            clearFields();
            btnSubmit.setEnabled(true);
        }
    }

    private void clearFields() {
        txtFirst.setText("");
        txtLast.setText("");
        txtMiddle.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
    }

    public static void main(String[] args) {
        new EventDriven();
    }
}
