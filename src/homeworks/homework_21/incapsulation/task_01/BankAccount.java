package homeworks.homework_21.incapsulation.task_01;

public class BankAccount {
    private String id;
    private double balance;
    private double sumDeposit;
    private double sumWithdraw;


    public double getSumDeposit() {
        return sumDeposit;
    }

    public BankAccount(String id) {
        this.id = id;
    }

    public void setSumDeposit(double sumDeposit) {
        this.sumDeposit = sumDeposit;
    }

    public double getSumWithdraw() {
        return sumWithdraw;
    }

    public void setSumWithdraw(double sumWithdraw) {
        this.sumWithdraw = sumWithdraw;
    }

    public void balance(double setDeposit, double setWithdraw){
        double balanceResult = balance + setDeposit - setWithdraw;
        System.out.println("BankAccount "+id+": "+balanceResult+"EUR");
    }


}
