class Animal{
    void sound(){
        System.out.println("Animal make's Sound");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("MEWooo");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("It Barks");
    }
}
public class Runtime {
    public static void main(String[] args){
        Animal a;
        a = new Cat();
        a.sound();

        Animal b;
        b = new Dog();
        b.sound();
         
        // Animal ac = new Animal();
        // ac.sound();

    }
}
