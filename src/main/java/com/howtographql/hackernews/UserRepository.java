package com.howtographql.hackernews;

/**
 * Manages user persistence
 */
public class UserRepository {

    // private final MongoCollection<Document> users;
    //
    // public UserRepository(MongoCollection<Document> users) {
    //     this.users = users;
    // }
    //
    // public User findByEmail(String email) {
    //     Document doc = users.find(eq("email", email)).first();
    //     return user(doc);
    // }
    //
    public User findById(String id) {
      return new User("test", "testmail", "testpassword");
    }
    //
    // public User saveUser(User user) {
    //     Document doc = new Document();
    //     doc.append("name", user.getName());
    //     doc.append("email", user.getEmail());
    //     doc.append("password", user.getPassword());
    //     users.insertOne(doc);
    //     return new User(
    //             doc.get("_id").toString(),
    //             user.getName(),
    //             user.getEmail(),
    //             user.getPassword());
    // }
    //
    // private User user(Document doc) {
    //     return new User(
    //             doc.get("_id").toString(),
    //             doc.getString("name"),
    //             doc.getString("email"),
    //             doc.getString("password"));
    // }
}
