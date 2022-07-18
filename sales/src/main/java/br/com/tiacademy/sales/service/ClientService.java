package br.com.tiacademy.sales.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.sales.core.crud.CrudService;
import br.com.tiacademy.sales.domain.Client;

@Service
public class ClientService extends CrudService<Client, Long> {

    @Override
    protected Client entityUpdate(Client recovered, Client entity) {
        recovered.setName(entity.getName());
        return recovered;
    }

}
