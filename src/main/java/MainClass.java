import com.mongodb.*;

import java.net.UnknownHostException;

public class MainClass {
    public static final DBObject toDBObject (Person person){
        return new BasicDBObject("_id", person.getId())
                .append("name", person.getName())
                .append("address", new BasicDBObject(
                        "street", person.getAddress().getStreet()
                    )
                    .append("city" , person.getAddress().getCity())
                    .append("phone", person.getAddress().getPhone()))
                .append("books", person.getBooks());
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
/*
        Address joAd = new Address("123 Fake St", "Faketon", "5559991234");
        Person jo = new Person("jo", "Jo Bloggs", joAd);
        collection.remove(new BasicDBObject("_id", "jo"));
        collection.insert(toDBObject(jo));
*/
        DBCursor results = collection.find(new BasicDBObject("address.city", "City"));
        for( DBObject result : results){
            System.out.println(result.get("name"));
        }

        DBCursor cursor = collection.find(new BasicDBObject("_id","jo"));
        DBObject theJo = cursor.one();
        theJo.put("name", "Jo In Disquise");
        collection.update(new BasicDBObject(), new BasicDBObject("$set",
                                                new BasicDBObject("country", "UK")), false, true);

        mongoClient.close();
    }
}
