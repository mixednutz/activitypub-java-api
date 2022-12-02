package org.w3c.activitystreams;

import java.net.URI;

public interface CollectionPage<E extends ObjectOrLink> extends Collection<E>, CollectionPageOrLink<Object> {

	URI getPartOf();
	
//	CollectionPageOrLink<Object> getNext();
//	
//	CollectionPageOrLink<Object> getPrev();
	
}
