package com.bruno.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.bruno.eventosapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findByCodigo(long codigo);
}
