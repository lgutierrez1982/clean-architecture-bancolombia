package cl.com.estudio.juridico.control.causas.app.usecase.causa;

import cl.com.estudio.juridico.control.causas.app.model.causa.Causa;
import cl.com.estudio.juridico.control.causas.app.model.causa.gateways.CausaRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CausaUseCase {

    private final CausaRepository causaGateway;

    public Causa getCausa(Integer id){
        return causaGateway.getCausa(id);
    }
}
