package cl.com.estudio.juridico.control.causas.app.controlcausasservice;

import cl.com.estudio.juridico.control.causas.app.model.cliente.Cliente;
import cl.com.estudio.juridico.control.causas.app.model.cliente.gateways.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceAdapter implements ClienteRepository {

    @Override
    public Cliente getCliente(Integer id) {
        return Cliente.builder()
                .id(1)
                .rut("15.456.865-4")
                .nombre("Luis")
                .apellido("Gutierrez")
                .build();
    }

    @Override
    public String getNombreCompleto(Integer id) {
        Cliente cliente = Cliente.builder()
                .id(1)
                .rut("15.456.865-4")
                .nombre("Luis")
                .apellido("Gutierrez")
                .build();

        return cliente.getNombre().concat(cliente.getApellido());
    }
}
