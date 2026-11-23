package BiteDineSystem;

import javax.swing.*;
import java.awt.*;

public class AssignTable extends JFrame {
    
    //color palette to use para shortcut
    Color cream = Color.decode("#f0ede7");
    Color darkBrown = Color.decode("#423021");
    Color taupe = Color.decode("#9d8a7c");
    Color green = Color.decode("#4f8f3f");
    Color red = Color.decode("#d34638");
    Color gray = Color.decode("#737373");
    
    JPanel contentPanel;
    
    
    public AssignTable() {
        setTitle("Bite & Dine - Table Management System");
        setBackground(darkBrown);
        setSize(1078, 580);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        getContentPane().setBackground(cream);
        setLayout(null);
        
        //for Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setBounds(0, 0, 170, 540);
        sidebar.setBackground(darkBrown);
        sidebar.setLayout(null);
        add(sidebar);
        
        
        //Logo
        JLabel logo = new JLabel ("Bite & Dine");
        logo.setForeground(cream);
        logo.setBounds(15, 20, 145, 30);
        logo.setFont(new Font("Segoe UI", Font.BOLD, 21));
        logo.setBackground(cream);
        sidebar.add(logo);
        
        //subtitle
        JLabel subtitle = new JLabel ("TABLE MANAGEMENT");
        subtitle.setBounds (15, 48, 150, 18);
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 9));
        subtitle.setForeground(taupe);
        sidebar.add(subtitle);
        
        //button
        JButton dashboard = createButton("Dashboard", 75);
        JButton floorPlan  = createButton("Floor Plan", 130);
        JButton assignTable = createButton("Assign Table", 185);
        JButton logout = createButton("Logout", 475);
        
        sidebar.add(dashboard);
        sidebar.add(floorPlan);
        sidebar.add(assignTable);
        sidebar.add(logout);
        
        assignTable.addActionListener(e -> {
            contentPanel.removeAll();
            
            //Assign Table 
            JLabel AStitle = new JLabel("Assign Table");
            AStitle.setBounds(20, 15, 400, 40);
            AStitle.setFont(new Font("Segoe UI", Font.BOLD, 28));
            AStitle.setForeground(darkBrown);
            contentPanel.add(AStitle);
        
            //Assign Table Subtitle
            JLabel ASsubtitle = new JLabel("Assign tables to guests");
            ASsubtitle.setBounds(20, 50, 400, 25);
            ASsubtitle.setFont(new Font("Sogoe UI", Font.PLAIN, 14));
            ASsubtitle.setForeground(gray);
            contentPanel.add(ASsubtitle);
            
            JLabel guestLabel = new JLabel("Select Guests");
            guestLabel.setBounds(20, 100, 200, 25);
            guestLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
            guestLabel.setForeground(darkBrown);
            contentPanel.add(guestLabel);
            
            JComboBox<String> guestDropdown = new JComboBox<>();
            guestDropdown.addItem("Choose a guest");
            guestDropdown.setBounds(20, 130, 850, 40);
            guestDropdown.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            contentPanel.add(guestDropdown);
            
            contentPanel.revalidate();
            contentPanel.repaint();
        });
        
        contentPanel = new JPanel();
        contentPanel.setBounds(170, 0, 908, 540);
        contentPanel.setBackground(cream);
        contentPanel.setLayout(null);
        add(contentPanel);
    
        //Dashoard Title
        JLabel dashboardTitle = new JLabel("Dashboard");
        dashboardTitle.setBounds(20, 15, 400, 40);
        dashboardTitle.setFont(new Font("Segoe UI", Font.BOLD, 28));
        dashboardTitle.setForeground(darkBrown);
        contentPanel.add(dashboardTitle);
        
        //Dashboard Subtitle
        JLabel dashboardSubtitle = new JLabel ("Overview of restaurant table status");
        dashboardSubtitle.setBounds(20, 50, 400, 25);
        dashboardSubtitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        dashboardSubtitle.setForeground(gray);
        contentPanel.add(dashboardSubtitle);
        
        //box box
        addStatusCard("6", "Available Tables", green, 20);
        addStatusCard("3", "Occupied Tables", red, 240);
        addStatusCard("2", "Reserved Tables", gray, 460);
        addStatusCard("1", "Cleaning Tables", taupe, 680);
        
        
        
    }
    
    private void addStatusCard(String number, String title, Color color, int x) {
    
        JPanel card = new JPanel();
        card.setBounds(x, 90, 205, 115);
        card.setBackground(color);
        card.setLayout(null);
        contentPanel.add(card);

        JLabel count = new JLabel(number);
        count.setBounds(0, 25, 205, 40);
        count.setFont(new Font("Segoe UI", Font.BOLD, 28));
        count.setForeground(Color.WHITE);
        count.setHorizontalAlignment(SwingConstants.CENTER);
        card.add(count);
        
        JLabel label = new JLabel(title);
        label.setBounds(0, 70, 205, 25);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        card.add(label);
        
        
    }
    
    private JButton createButton(String text, int y) {
        JButton button = new JButton(text);
        
        button.setBounds(10, y, 150, 42);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        button.setForeground(cream);
        button.setBackground(darkBrown);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(true);
        button.setOpaque(true);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setMargin(new Insets(0, 12, 0, 0));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //pampa highlight if nadaanan ng cursor
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                button.setBackground(taupe);
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
                button.setBackground(darkBrown);
            }
            public void mousePressed(java.awt.event.MouseEvent e) {
                button.setBackground(taupe);
            }  
        });

        return button;
    }

    public static void main(String[] args) {
        AssignTable window = new AssignTable();
        window.setVisible(true);

    }
}