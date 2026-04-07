class Amazon{
    void search(String product){
        System.out.println("Product: "+product);
    }
    void search(String product, int price){
        System.out.println("Product: "+product+" Price: "+price);
    }
    void search(String product, String category){
        System.out.println("Product: "+product+" Category: "+category);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Amazon a=new Amazon();
        a.search("Laptop");
        a.search("Laptop", 1000000);
        a.search("Laptop", "Electronics");
    }
}
