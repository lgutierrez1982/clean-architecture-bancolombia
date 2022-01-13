package cl.com.estudio.juridico.control.causas.app.controlcausasservice;

import cl.com.estudio.juridico.control.causas.app.model.causa.Causa;
import cl.com.estudio.juridico.control.causas.app.model.causa.gateways.CausaGateway;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CausaServiceAdapter implements CausaGateway {

    @Override
    public Causa create(Causa causa) {
        return null;
    }

    @Override
    public List<Causa> findAll() {
        return new ArrayList<Causa>();
    }

    @Override
    public Causa findById(Integer id) {
        return Causa.builder()
                .id(1)
                .build();
    }

    @Override
    public Causa update(Causa causa) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
