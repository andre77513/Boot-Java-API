package br.com.tiacademy.sales.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.sales.core.crud.CrudController;
import br.com.tiacademy.sales.domain.Seller;

@RestController
@RequestMapping("/vendedor")
public class SellerController extends CrudController<Seller, Long> {

}
