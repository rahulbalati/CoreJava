class bf{                      //gf can just read message can't make any changes to it
   static private String message;
   bf(String m){
    message=m;
   }
   bf(){
   }
    String getMessage(){
        return message;
    }
   
}
class gf extends bf{
   
}

class Encappsulation001{
   public static void main(String[] args) {
   bf b=new bf("i love you");


    gf g=new gf();
   
   System.out.println( g.getMessage());

    
   }

}