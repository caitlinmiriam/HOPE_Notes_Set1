public class Animal {
    void eat(String s){
        System.out.println(s+" is eating");
    }
}
public class Cat extends Animal {
    void sound(){
        System.out.println("Cat meows.");
    }
}
public class Kitten extends Cat{
    void plays(String s){
        System.out.println(s+" is playing");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Kitten k=new Kitten();
        k.eat("Cat");
        k.sound();
        k.plays("Cat");
    }
}
