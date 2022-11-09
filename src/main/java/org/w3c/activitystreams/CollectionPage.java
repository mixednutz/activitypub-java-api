package org.w3c.activitystreams;

public interface CollectionPage<E extends ObjectOrLink> extends Collection<E>, CollectionPageOrLink<E> {

	LinkOrCollection<E> getPartOf();
	
	CollectionPageOrLink<E> getNext();
	
	CollectionPageOrLink<E> getPrev();
	
}
