package com.zoho.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoho.Entities.Contacts;
import com.zoho.Service.ContactService;

@Controller
public class ContactsController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listcontacts")
	public String listContacts(Model model) {
		List<Contacts> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
}
