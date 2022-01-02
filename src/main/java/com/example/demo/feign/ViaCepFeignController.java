package com.example.demo.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cep")
public class ViaCepFeignController {

    @Autowired
    ViaCepFeign viaCepFeign;

    @GetMapping(value = "/{cep}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getCep(@PathVariable("cep") String cep) {
        return viaCepFeign.getCep(cep);
    }
}
