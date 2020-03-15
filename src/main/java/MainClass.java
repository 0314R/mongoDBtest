import com.mongodb.*;

import java.net.UnknownHostException;

public class MainClass {

    public static void main(String[] args) {
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient();
            System.out.println("test");
        } catch (UnknownHostException e){
            System.out.println("THREW EXCEPTION UNKNOWN HOST");
        }

        

        mongoClient.close();
    }
}
