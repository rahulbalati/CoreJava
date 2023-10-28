class Msword extends Thread{
    Msword(String name){
        super(name);
    }
    public void run(){
        if(getName().equals("typing")){
            typing();
        }else if(getName().equals("spellcheck")){
            spellcheck();
        }else{
            autosave();
        }
}
        void typing(){
            for(int i=1;i<=5;i++){
                try{
                    System.out.println("typing under progress");
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

        }
        void spellcheck(){
            for(int i=1;i<=5;i++){
                try{
                    System.out.println("spell check is under progress");
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println(e.getMessage());

                }
            }
        }
        void autosave(){
            for(int i=1;i<=5;i++){
                try{
                    System.out.println("auto save under progress");
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println(e.getMessage());

                }
            }
        }
    
}


public class multithread1 {
    public static void main(String[] args) {
        Msword ms1=new Msword("typing");
        Msword ms2=new Msword("spellcheck");
        Msword ms3=new Msword("autosave");
        ms1.start();
        ms2.start();
        ms3.start();

    }
}
