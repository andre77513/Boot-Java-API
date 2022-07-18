package br.com.tiacademy.sales.repository;

import org.springframework.stereotype.Repository;

import br.com.tiacademy.sales.core.crud.CrudRepository;
import br.com.tiacademy.sales.domain.Seller;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Long> {

}
