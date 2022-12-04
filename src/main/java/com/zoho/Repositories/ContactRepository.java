package com.zoho.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.Entities.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
