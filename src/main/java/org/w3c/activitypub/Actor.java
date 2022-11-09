package org.w3c.activitypub;

public interface Actor {

	/**
	 * A URL to comprised of all the messages received by the actor
	 * @return
	 */
	String getInbox();
	
	/**
	 * A URL to comprised of all the messages produced by the actor;
	 * @return
	 */
	String getOutbox();
	
	
}
