package com.collabera.mongo;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoTestDb {
	
	public MongoDatabase connectToMongo() {
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "mydb", "password".toCharArray());
		System.out.println("Connected to the database successfully!");
		
		MongoDatabase database = mongo.getDatabase("mydb");
		System.out.println("database :: " + database.getName());
		return database;
	}
	
	public void createCollection(MongoDatabase database, String collectionName) {
		database.createCollection(collectionName);
		System.out.println("Collection created successfully");
	}
	
	public MongoCollection<Document> getCollection(MongoDatabase database){
		MongoCollection<Document> collection = null;
		
		try {
			collection = database.getCollection("sampleCollection");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return collection;
	}
	
	public void insertDocument(MongoCollection<Document> collection) {
		Document document = new Document("title", "MongoDB2")
				.append("id", 2)
				.append("description", "database")
				.append("likes", 120)
				.append("url", "http://www.collabera.com/mongodb/")
				.append("by", "collabera");
		System.out.println("Document inserted successfully");
	}
	
	public void retrieveAllDocuments(MongoCollection<Document> collection) {
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;
		Iterator it = iterDoc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
	}
	
	public void updateDocument(MongoCollection<Document> collection) {
		try { 
			collection.updateOne(Filters.eq("id", 1), Updates.set("likes", 150));
			System.out.println("Document updated successfully...");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteDocument(MongoCollection<Document> collection) {
		try {
			collection.deleteOne(Filters.eq("id", 1));
			System.out.println("Document deleted successfully...");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		MongoTestDb mongoApp = new MongoTestDb();
		
		MongoDatabase database = mongoApp.connectToMongo();
		
		//Accessing the database
		
		
		//Retrieving a collection
	
	}

}
