package com.collabera.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoTestDb {

	public static void main(String[] args) {
		//Creating a Mongo client
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		//Creating Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "mydb", "password".toCharArray());
		System.out.println("Connected to the database successfully!");
		
		//Accessing the database
		MongoDatabase database = mongo.getDatabase("mydb");
		System.out.println("database :: " + database.getName());

		//Creating a collection
		//database.createCollection("sampleCollection");
		//System.out.println("Collection created successfully");

		//Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("Collection selected successfully: " + collection.toString());
	
		Document document = new Document("title", "MongoDB")
				.append("id", 1)
				.append("description", "database")
				.append("likes", 100)
				.append("url", "abc")
				.append("by", "collabera");
		System.out.println(document.get("id"));
		
		collection.insertOne(document);
		System.out.println("Document inserted successfully");

	}

}
