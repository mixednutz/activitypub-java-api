package org.w3c.activitystreams;


/**
 * Actor types are Object types that are capable of performing activities.
 * 
 * @author W3C
 */
public enum ActorType {

	APPLICATION("Application"),
	GROUP("Group"),
	ORGANIZATION("Organization"),
	PERSON("Person"),
	SERVICE("Service");
	
	private final String name;

	private ActorType(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	public static ActorType fromString(String value) {
		if (value != null) {  
		     for (ActorType feedType : values()) {  
		       if (feedType.name.equals(value)) {  
		         return feedType;  
		       }  
		     }  
		}
		throw new IllegalArgumentException("Invalid FeedType: " + value);
	}
	
}
