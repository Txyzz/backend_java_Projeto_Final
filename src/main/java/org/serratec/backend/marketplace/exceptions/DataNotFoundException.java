package org.serratec.backend.marketplace.exceptions;

public class DataNotFoundException extends Exception {
	private Integer id;

	public DataNotFoundException(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

}
