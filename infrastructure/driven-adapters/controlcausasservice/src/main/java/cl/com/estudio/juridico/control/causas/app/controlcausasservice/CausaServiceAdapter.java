package cl.com.estudio.juridico.control.causas.app.controlcausasservice;

import cl.com.estudio.juridico.control.causas.app.model.causa.Causa;
import cl.com.estudio.juridico.control.causas.app.model.causa.gateways.CausaRepository;
import org.springframework.stereotype.Service;

@Service
public class CausaServiceAdapter implements CausaRepository {

    @Override
    public Causa getCausa(Integer id) {
        return Causa.builder()
                .id(1)
                .build();
    }
}
