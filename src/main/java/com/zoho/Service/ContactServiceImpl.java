package com.zoho.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.Entities.Contacts;
import com.zoho.Repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository ContactRepo;
	
	@Override
	public void saveContactInformation(Contacts contact) {
		ContactRepo.save(contact);
	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts>Contact = ContactRepo.findAll();
		return Contact;
	}

	@Override
	public Contacts findContactById(long id) {
		Optional<Contacts> findById = ContactRepo.findById(id);
		Contacts Contact = findById.get();
		return Contact;
	}


}
