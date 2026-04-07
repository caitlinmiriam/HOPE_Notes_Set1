class Amazon{
    void delivery(){
        System.out.println("Product will be delivered");
    }
}
class StandardDelivery extends Amazon{
    void delivery(){
        System.out.println("Product will be delivered in 5 days");
    }
}
class ExpressDelivery extends Amazon{
    void delivery(){
        System.out.println("Product will be delivered in 2 days");
    }
}
class PrimeDelivery extends Amazon{
    void delivery(){
        System.out.println("Product will be delivered in 24 hours");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Amazon a;
        a= new StandardDelivery();
        a.delivery();
        a= new ExpressDelivery();
        a.delivery();
        a= new PrimeDelivery();
        a.delivery();
    }
}
