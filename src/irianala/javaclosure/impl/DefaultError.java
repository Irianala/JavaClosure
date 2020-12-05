package irianala.javaclosure.impl;

import irianala.javaclosure.protocol.ErrorEvent;

public class DefaultError implements ErrorEvent {
	private String description;
	
	public DefaultError(String description) {
		this.description = description;
	}
	
	public void setDescription(String arg) {
		this.description = arg;
	}
	
	public String getDescription() {
		return this.description;
	}
}
