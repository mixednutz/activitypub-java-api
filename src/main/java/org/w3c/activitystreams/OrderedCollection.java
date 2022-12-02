package org.w3c.activitystreams;

public interface OrderedCollection<E extends ObjectOrLink> extends Collection<E> {
	
	java.util.List<E> getItems();

}
