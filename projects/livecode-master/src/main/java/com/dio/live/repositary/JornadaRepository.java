package com.dio.live.repositary;

import com.dio.live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

}

