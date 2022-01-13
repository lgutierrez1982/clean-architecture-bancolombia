package cl.com.estudio.juridico.control.causas.app.usecase.causa;

import cl.com.estudio.juridico.control.causas.app.model.causa.Causa;
import cl.com.estudio.juridico.control.causas.app.model.causa.gateways.CausaGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CausaFindByIdUseCase {

    private final CausaGateway causaGateway;

    public Causa causaFindById(Integer id){
        return causaGateway.findById(id);
    }
}
