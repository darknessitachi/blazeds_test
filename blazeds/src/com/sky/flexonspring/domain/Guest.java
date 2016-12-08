package com.sky.flexonspring.domain;

import java.io.Serializable;

public class Guest implements Serializable {
	private static final long serialVersionUID = 2847087180295614974L;
	
	private String guestName;

	public Guest(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
}
