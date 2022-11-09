package org.w3c.activitystreams;

public interface ObjectOrLink {
	
	/**
	 * When used on a Link, identifies the MIME media type of the referenced resource.
	 * 
	 * When used on an Object, identifies the MIME media type of the value of the content property. If not specified, the content property is assumed to contain text/html content.
	 * @return
	 */
	String getMediaType();

}
