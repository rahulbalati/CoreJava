public class ImmutableStrings {
    public static void main(String[] args) {
        String s1="JAVA";  //created without new keyword so stored in constant pool (both con & non-con are stored in heap segment}
        String s2=new String("JAVA");
        String s3="PYTHON";
        String s4=s1+s3; //+ operator creates new string 
        
        String s5=s1+s3;

        if(s4==s5){
            System.out.println("referneces are equal");
        }else{
            System.out.println("not");
        }
        if(s1.equals(s2)){
            System.out.println("values are equal");
        }else{
            System.out.println("not");
        }
}
}