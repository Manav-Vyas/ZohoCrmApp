package com.zoho.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.Entities.Billing;
import com.zoho.Repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void generateInvoice(Billing billing) {
		billingRepo.save(billing);
	}

}
