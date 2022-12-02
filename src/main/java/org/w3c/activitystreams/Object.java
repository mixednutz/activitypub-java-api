package org.w3c.activitystreams;

/**
 * Describes an object of any kind. The Object type serves as the base type for
 * most of the other kinds of objects defined in the Activity Vocabulary,
 * including other Core types such as Activity, IntransitiveActivity, Collection
 * and OrderedCollection.
 * 
 * @author W3C
 *
 */
public interface Object extends ObjectOrLink {
	
	/**
	 * A simple, human-readable, plain-text name for the object. HTML markup must not be included. The name may be expressed using multiple language-tagged values.
	 * @return
	 */
	String getName();
	
	/**
	 * Identifies one or more links to representations of the object
	 * @return
	 */
	String getUrl();
	
	/**
	 * Identifies the MIME media type of the value of the content property. If not specified, the content property is assumed to contain text/html content.
	 * @return
	 */
	String getMediaType();
	
	/**
	 * The content or textual representation of the Object encoded as a JSON string. By default, the value of content is HTML. The mediaType property can be used in the object to indicate a different content type.
	 * 
	 * The content may be expressed using multiple language-tagged values.
	 * 
	 * @return
	 */
	String getContent();

}
