package org.w3c.activitystreams;

/**
 * A Link is an indirect, qualified reference to a resource identified by a 
 * URL. The fundamental model for links is established by [ RFC5988]. Many 
 * of the properties defined by the Activity Vocabulary allow values that 
 * are either instances of Object or Link. When a Link is used, it 
 * establishes a qualified relation connecting the subject (the containing 
 * object) to the resource identified by the href. Properties of the Link 
 * are properties of the reference as opposed to properties of the resource.
 * 
 * @author W3C
 *
 */
public interface Link extends ObjectOrLink, CollectionPageOrLink<Object>, ImageOrLink {
	
	/**
	 * The target resource pointed to
	 * @return
	 */
	String getHref();
	
	/**
	 * Identifies the MIME media type of the referenced resource.
	 * 
	 * @return
	 */
	String getMediaType();
	
}
