package com.example.demo.feign;

import feign.FeignException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ViaCep", url = "viacep.com.br/ws")
public interface ViaCepFeign {

    @RequestMapping(method = RequestMethod.GET, value = "{cep}/json/")
    Object getCep(@PathVariable("cep") String cep) throws FeignException;
}
