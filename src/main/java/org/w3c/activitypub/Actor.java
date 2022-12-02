package org.w3c.activitypub;

import java.net.URI;

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
	URI getOutbox();
	
	
}
