package cl.com.estudio.juridico.control.causas.app.usecase.cliente;

import cl.com.estudio.juridico.control.causas.app.model.cliente.Cliente;
import cl.com.estudio.juridico.control.causas.app.model.cliente.gateways.ClienteRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class ClienteUseCase {

    private final ClienteRepository clienteGateway;

    public Cliente getCliente(Integer id){

        return clienteGateway.getCliente(id);
    }
}
