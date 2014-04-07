package com.minsub.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;




public class Sender {

	public static void main(String[] args) {
		try {
			// Getting a ConnectionFactory
			Context messaging = new InitialContext();
			ConnectionFactory connectionFactory = (ConnectionFactory)messaging.lookup("ConnectionFactory");
			
			// Getting a Destination
			Queue stockQueue;
			stockQueue = (Queue)messaging.lookup("StockSource");
			
			// Creating a Connection
			Connection connection = connectionFactory.createConnection();
			
			// Creating a Session
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			// Creating a Message Producer
			MessageProducer sender = session.createProducer(stockQueue);
			
			// Creating a Message COnsumer
			MessageConsumer receiver = session.createConsumer(stockQueue);
			
			connection.start();
			
			String stockData = "Hello World"; /* Stock information as a string */
			TextMessage message;

			/* Set the message's text to be the stockData string */
			message = session.createTextMessage();
			message.setText(stockData);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
