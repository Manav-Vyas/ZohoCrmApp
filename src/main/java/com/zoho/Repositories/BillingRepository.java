package com.zoho.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.Entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
