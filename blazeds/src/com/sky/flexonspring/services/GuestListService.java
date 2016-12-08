package com.sky.flexonspring.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sky.flexonspring.domain.Guest;

public class GuestListService implements Serializable, IGuestListService {

	private static final long serialVersionUID = 3552207441192189726L;

	public List<Guest> getGuestList() {
		List<Guest> guestList = new ArrayList<Guest>();
		guestList.add(new Guest("Guest One"));
		guestList.add(new Guest("Guest Two"));
		guestList.add(new Guest("Guest Three"));
		guestList.add(new Guest("Guest Four"));
		return guestList;
	}
}
