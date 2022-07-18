package br.com.tiacademy.sales.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.sales.core.crud.CrudService;
import br.com.tiacademy.sales.domain.Seller;

@Service
public class SellerService extends CrudService<Seller, Long> {

    @Override
    protected Seller entityUpdate(Seller recovered, Seller entity) {
        recovered.setName(entity.getName());
        return recovered;
    }

}
