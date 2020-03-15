import com.mongodb.*;
import com.mongodb.client.*;

import java.net.UnknownHostException;

public class MainClass {

    public static void main(String[] args) {


        MongoClient client = MongoClients.create("mongodb+srv://omar:thepassword@cluster0315-zy228.azure.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase analyticsDB = client.getDatabase("sample_analytics");
        MongoIterable<String> collectionNames = analyticsDB.listCollectionNames();
        MongoCursor<String> cursor = collectionNames.iterator();

        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }

        client.close();
    }
}
