import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuView {
    private JFrame mainMenu;
    private JLabel titleLabel;
    private JButton createBtn, createBtn2, testBtn, exitBtn;
    private JTextArea status;

    public MainMenuView () {
        this.mainMenu = new JFrame("Vending Machine Factory");

        this.mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainMenu.setLayout(null);
		this.mainMenu.setSize(400, 400);
        this.mainMenu.setResizable(false);

        this.titleLabel = new JLabel("Vending Machine Factory");
        this.titleLabel.setFont(new Font("Arial", 1, 25));
        this.titleLabel.setBounds(200, 100, 300, 100);
        
        this.createBtn = new JButton("Regular Vending Machine");
        this.createBtn.setPreferredSize(new Dimension(200, 50));
        this.createBtn2 = new JButton("Special Vending Machine");
        this.createBtn2.setPreferredSize(new Dimension(200, 50));
        this.testBtn = new JButton("Test Vending Machine");
        this.testBtn.setPreferredSize(new Dimension(200, 50));
        this.exitBtn = new JButton("Exit Program");
        this.exitBtn.setPreferredSize(new Dimension(200, 50));

        this.status = new JTextArea("", 1, 18);
        this.status.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.status.setEditable(false);


        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        mainPanel.setBackground(Color.gray);
        mainPanel.setBounds(0, 0, 400, 400);
        mainPanel.add(titleLabel);
        mainPanel.add(createBtn);
        mainPanel.add(createBtn2);
        mainPanel.add(testBtn);
        mainPanel.add(exitBtn);
        mainPanel.add(status);
        this.mainMenu.add(mainPanel);
        

        this.mainMenu.setVisible(true);

    }

    public void setCreateBtnListener(ActionListener actionListener) {
        this.createBtn.addActionListener(actionListener);
    }

    public void setCreateBtn2Listener(ActionListener actionListener) {
        this.createBtn2.addActionListener(actionListener);
    }

    public void setTestBtnListener(ActionListener actionListener) {
        this.testBtn.addActionListener(actionListener);
    }

    public void setExitBtnListener(ActionListener actionListener) {
        this.exitBtn.addActionListener(actionListener);
    }

    public void setStatus(String text) {
        this.status.setText(text);
    }
}
