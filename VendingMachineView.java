import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachineView {
    private JFrame mainFrame;
	private JLabel titleLbl, titleLbl2, titleLbl3;
	private JButton featureBtn, maintenanceBtn, displayBtn, purchaseBtn, backBtn, 
    backBtn2, printBtn, restockBtn, replenishBtn, newPriceBtn, totalBtn;

    public VendingMachineView() {
        this.mainFrame = new JFrame("Regular Vending Machine");
        CardLayout cl = new CardLayout();
        

		this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.mainFrame.setSize(450, 700);

        // Test Panel
		this.titleLbl = new JLabel("Regular Vending Machine");
        this.titleLbl.setFont(new Font("Arial", 1, 25));
        this.titleLbl.setBounds(200, 100, 400, 200);

        // Features Panel
        this.titleLbl2 = new JLabel("Vending Machine Features");
        this.titleLbl2.setFont(new Font("Arial", 1, 25));
        this.titleLbl2.setBounds(200, 100, 400, 200);

        // Maintenance Panel
        this.titleLbl3 = new JLabel("Vending Machine Maintenance");
        this.titleLbl3.setFont(new Font("Arial", 1, 25));
        this.titleLbl3.setBounds(200, 100, 400, 200);

        // Test Panel
		this.displayBtn = new JButton("Display");
		this.displayBtn.setPreferredSize(new Dimension(220, 30));
		this.purchaseBtn = new JButton("Purchase an Item");
		this.purchaseBtn.setPreferredSize(new Dimension(220, 30));
        this.backBtn = new JButton("Back");
		this.backBtn.setPreferredSize(new Dimension(220, 30));

        // Features Panel
        this.featureBtn = new JButton("Vending Machine Features");
        this.featureBtn.setPreferredSize(new Dimension(220, 30));
        this.maintenanceBtn = new JButton("Vending Machine Maintenance");
        this.maintenanceBtn.setPreferredSize(new Dimension(220, 30));

        // Maintenance Panel
        this.printBtn = new JButton("Print Summary");
		this.printBtn.setPreferredSize(new Dimension(220, 30));
        this.restockBtn = new JButton("Restock an Item");
		this.restockBtn.setPreferredSize(new Dimension(220, 30));
        this.replenishBtn = new JButton("Replenish Money");
		this.replenishBtn.setPreferredSize(new Dimension(220, 30));
        this.newPriceBtn = new JButton("Set New Price");
		this.newPriceBtn.setPreferredSize(new Dimension(220, 30));
        this.totalBtn = new JButton("Get Total Money");
		this.totalBtn.setPreferredSize(new Dimension(220, 30));
        this.backBtn2 = new JButton("Back");
		this.backBtn2.setPreferredSize(new Dimension(220, 30));


        JPanel panelCl = new JPanel();
        JPanel TestPanel = new JPanel();
		JPanel CustomerPanel = new JPanel();
        JPanel OperatorPanel = new JPanel();

        panelCl.setLayout(cl);

        TestPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        TestPanel.add(titleLbl);
        TestPanel.add(featureBtn);
        TestPanel.add(maintenanceBtn);
        panelCl.setPreferredSize(new Dimension(400, 300));

        CustomerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        CustomerPanel.add(titleLbl2);
		CustomerPanel.add(displayBtn);
		CustomerPanel.add(purchaseBtn);
        CustomerPanel.add(backBtn);

        OperatorPanel.add(titleLbl3);
        OperatorPanel.add(printBtn);
        OperatorPanel.add(restockBtn);
        OperatorPanel.add(replenishBtn);
        OperatorPanel.add(newPriceBtn);
        OperatorPanel.add(totalBtn);
        OperatorPanel.add(backBtn2);
		

        panelCl.add(TestPanel, "1");
        panelCl.add(CustomerPanel, "2");
        panelCl.add(OperatorPanel, "3");
        cl.show(panelCl, "1");
		this.mainFrame.add(panelCl);

        featureBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCl, "2");
            }
        });

        maintenanceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCl, "3");
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCl, "1");
            }
        });

        backBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCl, "1");
            }
        });

        this.mainFrame.pack();
        this.mainFrame.setResizable(false);
		this.mainFrame.setVisible(true);
    }

    

    public void setDisplayBtnListener (ActionListener actionListener) {
        this.displayBtn.addActionListener(actionListener);
    }

    public void setPurchaseBtnListener (ActionListener actionListener) {
        this.purchaseBtn.addActionListener(actionListener);
    }

    public void setPrintBtnListener (ActionListener actionListener) {
        this.printBtn.addActionListener(actionListener);
    }

    public void setRestockBtnListener (ActionListener actionListener) {
        this.restockBtn.addActionListener(actionListener);
    }

    public void setReplenishBtnListener (ActionListener actionListener) {
        this.replenishBtn.addActionListener(actionListener);
    }

    public void setNewPriceBtnListener (ActionListener actionListener) {
        this.newPriceBtn.addActionListener(actionListener);
    }

    public void setTotalBtnListener (ActionListener actionListener) {
        this.totalBtn.addActionListener(actionListener);
    }

}
