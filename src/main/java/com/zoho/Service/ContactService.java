package com.zoho.Service;

import java.util.List;

import com.zoho.Entities.Contacts;

public interface ContactService {
	public void saveContactInformation(Contacts contact);
	public List<Contacts>getAllContacts();
	public Contacts findContactById(long id);
}
