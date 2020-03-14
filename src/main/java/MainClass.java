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

        DB database = mongoClient.getDB("javaDB");
        DBCollection collection = database.getCollection("employees");

        Person personObj = new Person();
        DBObject person1 = toDBObject(personObj);

        DBObject person = new BasicDBObject("_id", "jo1")
                                    .append("name", "Jo Bloggs")
                                    .append("address", new BasicDBObject("street", "123 Fake Street")
                                                                        .append("City", "Faketon")
                                                                        .append( "state" , "MA")
                                                                        .append("zip", 12345));
        collection.insert(person);
        collection.insert(person1);


        mongoClient.close();
    }
}
