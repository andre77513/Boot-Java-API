package br.com.tiacademy.sales.repository;

import org.springframework.stereotype.Repository;

import br.com.tiacademy.sales.core.crud.CrudRepository;
import br.com.tiacademy.sales.domain.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{

}
