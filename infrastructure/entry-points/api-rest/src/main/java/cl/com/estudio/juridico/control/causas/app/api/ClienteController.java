package cl.com.estudio.juridico.control.causas.app.api;
import cl.com.estudio.juridico.control.causas.app.model.cliente.Cliente;
import cl.com.estudio.juridico.control.causas.app.usecase.cliente.ClienteUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/cliente", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ClienteController {

    private final ClienteUseCase clienteUseCase;


    @GetMapping(path = "/{id}")
    public Cliente getCliente(@PathVariable Integer id) {
        return clienteUseCase.getCliente(id);
    }
}
