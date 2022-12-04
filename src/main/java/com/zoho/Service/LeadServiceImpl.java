package com.zoho.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.Entities.Lead;
import com.zoho.Repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository LeadRepo;
	
	@Override
	public void saveLeadInformation(Lead lead) {
		LeadRepo.save(lead);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead>leads = LeadRepo.findAll();
		return leads;
	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = LeadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteOneLead(long id) {
		LeadRepo.deleteById(id);
	}

}
