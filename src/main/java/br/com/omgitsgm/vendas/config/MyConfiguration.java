package br.com.omgitsgm.vendas.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import br.com.omgitsgm.vendas.annotations.Development;

@Development
public class MyConfiguration {
    
    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("RODANDO A CONFIGURACAO DE DESENVOLVIMENTO.");
        };
    }
}
