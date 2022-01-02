package com.example.demo.restController;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepRestTemplateService {


    public Object getViaCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://viacep.com.br/ws/{cep}/json", Object.class, cep);
    }
}
