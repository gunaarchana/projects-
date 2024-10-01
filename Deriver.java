interface Bank {
    void calculateInterest(); 
}
class SBI implements Bank {
    double r, amt, interest;
    public void calculateInterest() {
        r = 0.07;  // Interest rate for SBI (7%)
        amt = 10000;  // Principal amount
        interest = amt * r;  // Calculate interest
        System.out.println("SBI interest = " + interest);
    }
}
class Axis implements Bank {
    double r, amt, interest;  
    public void calculateInterest() {
        r = 0.12;
        amt = 10000;  
        interest = amt * r;
        System.out.println("Axis interest = " + interest);
    }
}

public class Deriver {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank axis = new Axis();
        sbi.calculateInterest();
        axis.calculateInterest();
    }
}