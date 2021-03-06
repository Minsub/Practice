package com.minsub.jms;

import javax.jms.DeliveryMode;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

public class Sender {

	public static void main(String[] args) {
		try {	
			// get the initial context
			InitialContext ctx;
			ctx = new InitialContext();
		
			// lookup the queue object
			Queue queue = (Queue) ctx.lookup("queue/queue0");
			                                                                   
			// lookup the queue connection factory
			QueueConnectionFactory connFactory = (QueueConnectionFactory) ctx.lookup("queue/connectionFactory");
			                                                                   
			// create a queue connection
			QueueConnection queueConn = connFactory.createQueueConnection();
			                                                                   
			// create a queue session
			QueueSession queueSession = queueConn.createQueueSession(false,
			    Session.DUPS_OK_ACKNOWLEDGE);
			                                                                   
			// create a queue sender
			QueueSender queueSender = queueSession.createSender(queue);
			queueSender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			                                                                   
			// create a simple message to say "Hello"
			TextMessage message = queueSession.createTextMessage("Hello");
			                                                                   
			// send the message
			queueSender.send(message);
			                                                                   
			// print what we did
			System.out.println("sent: " + message.getText());
			                                                                   
			// close the queue connection
			queueConn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
