package com.example.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cep2")
public class ViaCepRestTemplateController {

    @Autowired
    ViaCepRestTemplateService service;

    @GetMapping(value = "{cep}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getCep(@PathVariable("cep") String cep) {
        return service.getViaCep(cep);
    }
}
