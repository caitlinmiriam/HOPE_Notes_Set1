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
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat("Cat");
        c.sound();
        Dog d=new Dog();
        d.eat("Dog");
        d.sound();
    }
}
