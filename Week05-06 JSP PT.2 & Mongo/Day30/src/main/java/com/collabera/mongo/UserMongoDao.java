package com.collabera.mongo;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.collabera.models.Employee;
import com.collabera.models.User;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class UserMongoDao {
	private MongoClient mongoClient = null;
	private MongoDatabase database = null;
	private MongoCollection<User> collection = null;
	
	public void connectToMongo() {
		CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
		CodecRegistry pojoCodecRegistery = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
	
		mongoClient = new MongoClient("localhost", 27017);
		database = mongoClient.getDatabase("mydb").withCodecRegistry(pojoCodecRegistery);
		collection = database.getCollection("users", User.class);
	}
	
	public User findByUserName(String name) {
		User user = collection.find(Filters.eq("username", name)).first();
		return user;
	}
}
