class demo{
    String Name;
    String Education;

    demo(String Name ,String Education){
        this.Name = Name;
        this.Education = Education;

    }

    public void start(){
            System.out.println("NAME : "+Name);
            System.out.println("Education :"+Education);
        }
}

public class test {
    public static void main (String[] args){
        demo edu = new demo("RAHUL","B.E");
        edu.start();
       
    }
}
