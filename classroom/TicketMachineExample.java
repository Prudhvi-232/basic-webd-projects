import java.util.Scanner;

interface TicketMachine {
    double getBalance();
    double getPrice();
    double getTotal();
    void insertMoney(double amount);
    void printTicket();
}

class SimpleTicketMachine implements TicketMachine {
    private double balance;
    private double price;

    public SimpleTicketMachine(double initialPrice) {
        this.balance = 0.0;
        this.price = initialPrice;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getTotal() {
        return balance + price;
    }

    @Override
    public void insertMoney(double amount) {
        balance += amount;
        System.out.println("Inserted: $" + amount);
        System.out.println("Current balance: $" + balance);
    }

    @Override
    public void printTicket() {
        if (balance >= price) {
            System.out.println("Ticket printed! Enjoy the event!");
            balance -= price;
            System.out.println("Change returned: $" + balance);
            balance = 0;
        } else {
            System.out.println("Error: Insufficient funds. Please insert more money.");
        }
    }
}

public class TicketMachineExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TicketMachine ticketMachine = new SimpleTicketMachine(20.0);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println(" TICKET MACHINE");
            System.out.println("Choose any option from the following:");
            System.out.println("1. Get Balance");
            System.out.println("2. Get Price of Ticket");
            System.out.println("3. Get Total Amount");
            System.out.println("4. Insert Money");
            System.out.println("5. Print a Ticket");
            System.out.println("6. Exit from ticket Machine");
            System.out.println("------------------------------------------------------------");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + ticketMachine.getBalance());
                    break;
                case 2:
                    System.out.println("Ticket Price: $" + ticketMachine.getPrice());
                    break;
                case 3:
                    System.out.println("Total Amount: $" + ticketMachine.getTotal());
                    break;
                case 4:
                    System.out.println("Enter the amount to insert:");
                    double amount = scanner.nextDouble();
                    ticketMachine.insertMoney(amount);
                    break;
                case 5:
                    ticketMachine.printTicket();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
        System.out.println("Exiting the ticket machine application.");
        scanner.close();
    }
}
