package com.cadastrovacina.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastrovacina.crm.model.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {

}
