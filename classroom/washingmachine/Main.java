package washingmachine;
public class Main {
    public static void main(String[] args) {
        WashingMachine myWashingMachine = new MyWashingMachine();

        myWashingMachine.washing();
        myWashingMachine.draining();

        System.out.println("Your clothes are cleaned in 16 mins. Thanks!");
    }
}