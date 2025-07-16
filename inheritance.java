class Parent{
    void start(){
        System.out.println("inside Parent Class");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("Inside Child Class");
    }
}


public class inheritance {
    public static void main(String[] args){
        Child ch = new Child();
        ch.start();
        ch.display();
    }
}
