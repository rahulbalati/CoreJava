class Msword  extends Thread{
  Msword(String name){
    super(name);
  }

  public void run(){
    try{
    if(getName().equals("typing")){
        typing();
    }else if(getName().equals("spellcheck")){
        spellcheck();
    }else{
        autosave();
    }
}catch(Exception e){
    System.out.println("check back the program");

}

  }
  void typing(){
    for(int i=1;i<=5;i++){
        try{
            System.out.println("typing under progress");Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
  }
   void spellcheck(){
    for(;;){
        try{
            System.out.println("spell checking  under progress");Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  }
   void autosave(){
    for(;;){
        try{
            System.out.println("autosave under progress");Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  }




}

public class Daemon {
    public static void main(String[] args) {
        Msword m1=new Msword("typing");
        Msword m2=new Msword("autosave");
        Msword m3=new Msword("spellcheck");
        m2.setDaemon(true);
        m3.setDaemon(true);
        m2.setPriority(8);
        m3.setPriority(8);
        m1.start();
        m2.start();
        m3.start();
    }
}
