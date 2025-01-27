import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController {
    private MainMenuView mainMenuView;
    private int option = 0;
    private int testOption = 0;
    private VendingMachine machine = null;
    private VendingMachine startingStock = null;
    private SpecialVendingMachine machine2 = null;
    private SpecialVendingMachine startingStock2 = null;
    
    public MainMenuController(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;

        this.mainMenuView.setCreateBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuView.setStatus("  Regular Vending Machine Selected");
                option = 1;
                testOption = 0;
            }
        });

        this.mainMenuView.setCreateBtn2Listener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuView.setStatus("  Special Vending Machine Selected");
                option = 2;
                testOption = 0;
            }
        });

        this.mainMenuView.setTestBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testOption = 1;
                if(option == 0) {
                    mainMenuView.setStatus("     No Vending Machine Selected");
                }
                else if(option == 1) {
                    mainMenuView.setStatus("  Regular Vending Machine Created");
                    machine = new VendingMachine();
                    startingStock = new VendingMachine();
                    VendingMachineView vendingMachineView = new VendingMachineView();
                    VendingMachineController vendingMachineController = new VendingMachineController(vendingMachineView, machine, startingStock);
                }
                else if(option == 2) {
                    mainMenuView.setStatus("  Special Vending Machine Created");
                    machine2 = new SpecialVendingMachine(); 
                    startingStock2 = new SpecialVendingMachine();
                    SpecialVendingMachineView specialVendingMachineView = new SpecialVendingMachineView();
                    SpecialVendingMachineController specialVendingMachineController = new SpecialVendingMachineController(specialVendingMachineView, machine2, startingStock2);
                }
                
            }
        });

        this.mainMenuView.setExitBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public int getOption() {
        return option;
    }

    public int getTest() {
        return testOption;
    }

}
