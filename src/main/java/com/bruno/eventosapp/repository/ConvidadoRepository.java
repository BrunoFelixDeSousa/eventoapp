package com.bruno.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.bruno.eventosapp.models.Convidado;
import com.bruno.eventosapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
