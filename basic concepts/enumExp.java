enum Day{
       MONDAY,TUESDAY,WEDNESDAY
    }
    public class enumExp {
        public static void main(String[] args) {
           Day today=Day.MONDAY;
           switch(today){
            case MONDAY:
            System.out.println("Its monday");
            break;
             case TUESDAY:
            System.out.println("Its tuesday");
            break;
             case WEDNESDAY:
            System.out.println("Its wednesday");
            break;
            default:
            System.out.println("It's not a special day.");
           }
        }
    
    
}
