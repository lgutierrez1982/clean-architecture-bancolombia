package cl.com.estudio.juridico.control.causas.app.config;

import cl.com.estudio.juridico.control.causas.app.model.causa.gateways.CausaRepository;
import cl.com.estudio.juridico.control.causas.app.model.cliente.gateways.ClienteRepository;
import cl.com.estudio.juridico.control.causas.app.usecase.causa.CausaUseCase;
import cl.com.estudio.juridico.control.causas.app.usecase.cliente.ClienteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "cl.com.estudio.juridico.control.causas.app.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

        //en la linea 13 con @ComponentScan ya crea beans dentro de la ruta causas.app.usecase
        //de no existe el @ComponentScan se deben declara como se hace a conitnuacion
        /*
        @Bean
        public ClienteUseCase clienteUseCase(ClienteRepository clienteGateway){
                return new ClienteUseCase(clienteGateway);
        }

        @Bean
        public CausaUseCase causaUseCase(CausaRepository causaGateway){
                return new CausaUseCase(causaGateway);
        }*/
}
