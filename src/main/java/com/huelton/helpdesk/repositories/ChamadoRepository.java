package com.huelton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huelton.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
