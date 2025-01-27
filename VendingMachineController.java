import javax.swing.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class VendingMachineController {
    private Scanner sc = new Scanner(System.in);
    private VendingMachineView vendingMachineView;
    private VendingMachine vendingMachine;
    private VendingMachine startingStock;
    private Customer customer = new Customer();
    private Operator operator = new Operator();
    private int option = 0;
    private String name;
    private int stock;
    private double newPrice;

    public VendingMachineController(VendingMachineView vendingMachineView, VendingMachine vendingMachine, VendingMachine startingStock) {
        this.vendingMachineView = vendingMachineView;
        this.vendingMachine = vendingMachine;
        this.startingStock = startingStock;
    

        this.vendingMachineView.setDisplayBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option = 1;
                customer.customerMenu(vendingMachine, option);
            }
        });

        this.vendingMachineView.setPurchaseBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option = 2;
                customer.customerMenu(vendingMachine, option);
            }
        });

        this.vendingMachineView.setPrintBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator.displaySummary(vendingMachine, startingStock);
            }
        });

        this.vendingMachineView.setRestockBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("-----Which item do you want to restock?-----");
                name = sc.next();
                System.out.println("-----Add how much?-----");
                stock = sc.nextInt(); 
                operator.restock(vendingMachine, name, stock);
            }
        });

        this.vendingMachineView.setReplenishBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator.getReplenishedMoney(vendingMachine);
            }
        });

        this.vendingMachineView.setNewPriceBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("-----Which item do you want to change price?-----");
                name = sc.next();
                System.out.println("-----New price?-----");
                newPrice = sc.nextDouble(); 
                operator.changePrice(vendingMachine, name, newPrice);
            }
        });

        this.vendingMachineView.setTotalBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator.collectCash(vendingMachine);
            }
        });
    }

}
