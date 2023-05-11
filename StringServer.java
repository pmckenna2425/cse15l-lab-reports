import java.io.IOException;
import java.net.URI;
import java.util.*; 

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    List<String> messages = new ArrayList<>(); 

    public String handleRequest(URI url) {
        String query = url.getQuery(); 
        if (url.getPath().equals("/add-message")) {
            if (query.startsWith("s=")) { 
                String toAdd = query.split("=")[1];
                this.messages.add(toAdd);
            }
            String toPrint = "";
            for (String message : messages) {
                toPrint += message + "\n";
            }
            return toPrint;
        } /*else if (url.getPath().equals("/increment")) {
            num += 1;
            return String.format("Number incremented!");
        } */ 
        else {
            String toReturn = "";
            for (String message : messages) {
                toReturn += message + "\n";
            }
            return toReturn;
        }
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}