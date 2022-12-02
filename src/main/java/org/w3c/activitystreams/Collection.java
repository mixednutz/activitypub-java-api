package org.w3c.activitystreams;

public interface Collection<E extends ObjectOrLink> extends Object {
	
	/**
	 * A non-negative integer specifying the total number of objects contained by the logical view of the collection. This number might not reflect the actual number of items serialized within the Collection object instance.
	 * @return
	 */
	Long getTotalItems();
	
//	/**
//	 * In a paged Collection, indicates the page that contains the most recently updated member items.
//	 * 
//	 * @return
//	 */
//	CollectionPageOrLink<Object> getCurrent();
//	
//	/**
//	 * In a paged Collection, indicates the furthest preceeding page of items in the collection.
//	 * 
//	 * @return
//	 */
//	CollectionPageOrLink<Object> getFirst();
//	
//	/**
//	 * In a paged Collection, indicates the furthest proceeding page of the collection.
//	 * 
//	 * @return
//	 */
//	CollectionPageOrLink<Object> getLast();
	
	/**
	 * Identifies the items contained in a collection. The items might be ordered or unordered.
	 * @return
	 */
	java.util.Collection<E> getItems();
	
}
