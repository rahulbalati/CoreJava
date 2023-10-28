import java.util.Scanner;

class Students{
    String name;
    int id;
    static String clg="bkit";          //can be accessed directly
    Students(String name,int id){      //setting name,id using constructor
        this.name=name;
        this.id=id;
    }
    public String toString(){          //overriding public toString Method
        return "student id: "+id+" Student name: "+name+" clg name: "+clg;
    }


}

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
            System.out.println("enter student id");
            int id=sc.nextInt();
            System.out.println("enter name");
            String name=sc.next(); 
            Students s=new Students(name,id); 
            System.out.println(s);

        
      
       
        

    }
}
