import com.mongodb.*;

import java.net.UnknownHostException;

public class MainClass {
    public static final DBObject toDBObject (Person person){
        return new BasicDBObject("_id", person.getId())
                .append("name", person.getName())
                .append("street", person.getAddress().getStreet())
                .append("city" , person.getAddress().getCity())
                .append("phone", person.getAddress().getPhone());
    }

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
