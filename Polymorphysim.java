class Calculator{
   
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, int b){
       return  a + b;
    }
}



public class Polymorphysim {
    public static void main(String[] args){
    Calculator cal = new Calculator();
    System.out.println("SUM A: "+cal.add(10,5));
    System.out.println("SUM B: "+cal.add(25.6, 50));
}
}
