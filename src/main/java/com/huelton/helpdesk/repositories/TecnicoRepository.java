package com.huelton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huelton.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
