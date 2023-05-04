package CollectionsDemo;

//Interfaces specify what a class must do and not how.
// It is the blueprint of the class, interface methods are abstract by default
interface PaymentMethod{
    void pay();
}

class DebitCard implements PaymentMethod{
    public void pay(){
        System.out.println("Paying via debit Card");
    }
}
class CreditCard implements PaymentMethod{
    public void pay(){
        System.out.println("Paying via credit Card");
    }
}

class UPI implements PaymentMethod{
    public void pay(){
        System.out.println("Paying via CollectionsDemo.UPI");
    }
}
public class InterfacePaymentMethodDemo {

    public static void makePayment(PaymentMethod pm){
        pm.pay();
    }

    public static void main(String[] args) {
        PaymentMethod pm = new UPI();
        makePayment(pm);
    }
}