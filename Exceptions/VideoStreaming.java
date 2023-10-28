import java.util.Scanner;

class NetworkConnectivityException extends Exception {
  
    public String getMessage() {
        return "Check internet connectivity and try again!";
    }
}

class ContentUnavailableException extends Exception {
   
    public String getMessage() {
        return "Content unavailable in your current location";
    }
}

class SubscriptionException extends Exception {
   
    public String getMessage() {
        return "Not subscribed. Please check your subscription.";
    }
}

class CheckPlay {
    int kbps;
    String location;
    boolean subscription;

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter internet speed (kbps):");
            kbps = sc.nextInt();
            System.out.println("Enter location:");
            location = sc.next();
            System.out.println("Are you subscribed? (true/false):");
            subscription = sc.nextBoolean();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid values.");
           
    }
}

    void dispatch(){
        try {
            if (kbps < 128) {
                throw new NetworkConnectivityException();
            } else if (location.equalsIgnoreCase("Bangalore")) {
                throw new ContentUnavailableException();
            } else if (!subscription) {
                throw new SubscriptionException();
            } else {
                System.out.println("Streaming video... Enjoy!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

public class VideoStreaming {
    public static void main(String[] args) {
        CheckPlay c = new CheckPlay();
        c.input();
        c.dispatch();
    }
}
