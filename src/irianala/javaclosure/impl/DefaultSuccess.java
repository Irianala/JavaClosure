package irianala.javaclosure.impl;

import irianala.javaclosure.protocol.SuccessEvent;

public class DefaultSuccess implements SuccessEvent {
	private String description;
	
	public DefaultSuccess(String description) {
		this.description = description;
	}
	
	public void setDescription(String arg) {
		this.description = arg;
	}
	
	public String getDescription() {
		return this.description;
	}
}
