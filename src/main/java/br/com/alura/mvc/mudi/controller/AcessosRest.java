package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.interceptor.InterceptorDeAcessos;
import br.com.alura.mvc.mudi.interceptor.InterceptorDeAcessos.Acesso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("acessos")
@RestController
public class AcessosRest {

    @GetMapping
    public List<Acesso> getAcessos(){
        return InterceptorDeAcessos.acessos;
    }
}
