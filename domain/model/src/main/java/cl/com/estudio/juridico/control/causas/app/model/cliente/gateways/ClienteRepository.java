package cl.com.estudio.juridico.control.causas.app.model.cliente.gateways;

import cl.com.estudio.juridico.control.causas.app.model.cliente.Cliente;

public interface ClienteRepository {

    Cliente getCliente(Integer id);

    String getNombreCompleto(Integer id);
}
