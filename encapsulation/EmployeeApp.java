import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    int E_id;
    String E_name;
  Department dept;
    Employee(int id,String name,Department dept ){
     E_id=id;
    E_name =name;
     this.dept=dept;
  

    }
     public String toString() {
        return "Employee ID: " + E_id + "\nEmployee Name: " + E_name + "\nDepartment: " + dept.toString();
    }
}
class Department{
    int D_id;
    String Dname;
    String Designation;
    Department(int id,String name,String desig){
        D_id=id;
        Dname=name;
        Designation=desig;

    }
    public String toString() {
        return "Department ID: " + D_id + "\nDepartment Name: " + Dname + "\nDesignation: " + Designation;
    }


}
public class EmployeeApp {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  
    ArrayList<Employee> al=new ArrayList<>();
    for(int i=0;i<3;i++){
        System.out.println("enter id");
        int id=sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("enter deptid");
        int deptId=sc.nextInt();
        System.out.println("enter dname");
        String dname=sc.next();
        System.out.println("enter desination");
        String design=sc.next();
        Department d=new Department(deptId, dname, design);
        Employee e=new Employee(id, name, d);
        al.add(e);

    }
   for(Employee amp:al){
    System.out.println(amp);

   }

   
    
   }

}
