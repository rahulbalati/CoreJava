class college1 {
    private String deptname;
    private String collegeName;

    college1(){
       deptname="cse"; 
       collegeName="bkit";
    }
   
    college1(String deptname,String collegeName){
     this.deptname=deptname;
     this.collegeName=collegeName;
    }
    
   
    public String getName(){
        return deptname+" "+collegeName;
    }
    
}
class college{
    public static void main(String[] args) {
        college1 c=new college1();
        college1 c1=new college1("mech", "vtu");
        
       
        System.out.println( c.getName());
        System.out.println( c1.getName());
       
        
       
        
    }
}
