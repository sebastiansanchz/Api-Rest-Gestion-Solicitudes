package co.edu.unicauca.distribuidos.core.services.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//permite mapper que mediante un objeto nuestra clase entity a DTO

//@configuration indica que una clase tiene métodos que crean beans con @Bean,

@Configuration
public class mapper {
    
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    } 
}
