package com.huelton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huelton.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}