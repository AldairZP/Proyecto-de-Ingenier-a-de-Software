package com.registros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registros.models.eventos;

public interface eventoRepository extends JpaRepository<eventos,Long>{

}
