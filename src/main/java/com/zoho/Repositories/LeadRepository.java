package com.zoho.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.Entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
