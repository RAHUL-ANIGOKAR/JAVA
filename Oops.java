

class Student{
    int RollNo;
    String Name;

        Student(int RollNo, String Name) {
            this.RollNo = RollNo;// pointing to the current object
            this.Name = Name;
        }

        void dislay(){
            System.out.println("Student Roll No :"+RollNo);
            System.out.println("Student Name :"+Name);
        }
}


class Oops{
    public static void main(String[] args){
        Student std = new Student(232,"Rahul");
      
        std.dislay();
    }
}