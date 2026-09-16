abstract class Bank {
    
    abstract void rateOfInterest();

    void bankName() {
        System.out.println("Bank provides banking services");
    }
}

class SBI extends Bank {

    void rateOfInterest() {
        System.out.println("SBI Interest Rate = 7%");
    }
}

class HDFC extends Bank {

    void rateOfInterest() {
        System.out.println("HDFC Interest Rate = 7.5%");
    }
}

public class demo {
    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();

        s.bankName();
        s.rateOfInterest();

        h.rateOfInterest();
    }
}
