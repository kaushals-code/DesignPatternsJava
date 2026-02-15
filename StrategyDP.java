// ================ STRATEGY DESIGN PATTERN ================ //

interface PaymentStrategy {
    public void doPayment ();
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void doPayment () {
        System.out.println("The Payment has been successful from the CreditCard.");
    }
}

class UpiPayment implements PaymentStrategy {
    @Override
    public void doPayment () {
        System.out.println("The Payment has be successful through UPI.");
    }
}

class PaymentProcess {
    private final PaymentStrategy paymentStrategy;

    public void makePayment() {
        paymentStrategy.doPayment();
    }

    public PaymentProcess(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
}

class StrategyDP {
    public static void main(String[] args) {
        PaymentProcess pp = new PaymentProcess(new UpiPayment());

        pp.makePayment();

    }
}


// interface PaymentStrategy {
//     public void doPayment();
// }

// class UpiPayment implements PaymentStrategy {
//     public void doPayment() {
//         System.out.println("Payment by UPI is successful");
//     }
// }

// class CreditCardPayment implements PaymentStrategy {
//     public void doPayment () {
//         System.out.println("Payment by Credit Card is successful");
//     }
// }

// class PaymentProcess {
//     private PaymentStrategy paymentStrategy;
    
//     public void doPayment() {
//         paymentStrategy.doPayment();
//     }

//     public PaymentProcess(PaymentStrategy strategy) {
//         this.paymentStrategy = strategy;
//     }

// }

// class DesignPattern {
//     public static void main(String[] args) {

//         PaymentProcess pp = new PaymentProcess(new CreditCardPayment());
//         pp.doPayment();

//     }
// }

