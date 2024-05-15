package washingmachine;
class MyWashingMachine implements WashingMachine {

    @Override
    public void washing() {
        System.out.println("Washing machine is washing your clothes for 10 mins. Washing completed.");
    }

    @Override
    public void draining() {
        washing(); // Ensure washing is completed before draining
        System.out.println("Draining process started. Draining will take 6 mins. Draining completed.");
    }
}