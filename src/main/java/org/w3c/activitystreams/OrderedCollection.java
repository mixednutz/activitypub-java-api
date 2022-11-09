package org.w3c.activitystreams;

public interface OrderedCollection<E extends ObjectOrLink> extends Collection<E> {
	
	/**
	 * A subtype of Collection in which members of the logical collection are assumed to always be strictly ordered.
	 * 
	 * @return
	 */
	java.util.List<E> getOrderedItems();

	java.util.List<E> getItems();

}
