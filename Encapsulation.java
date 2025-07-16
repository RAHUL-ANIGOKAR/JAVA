class Car{
    private String Color;
    private String Model;

    public void setColor(String Color){
        this.Color = Color;
    }
    public String getColor(){
        return this.Color;
    }
    public void setModel(String Model){
        this.Model = Model;
    }
    public String getModel(){
        return this.Model;
    }
    public void display(){
        System.out.println("COLOR :"+this.Color);
        System.out.println("MODEL :"+this.Model);
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Car mycar = new Car();
        mycar.setColor("RED");
        mycar.setModel("1.6");
        mycar.display();

    }
}
