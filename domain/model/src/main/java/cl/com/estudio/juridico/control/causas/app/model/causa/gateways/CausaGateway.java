package cl.com.estudio.juridico.control.causas.app.model.causa.gateways;

import cl.com.estudio.juridico.control.causas.app.model.causa.Causa;

import java.util.List;

public interface CausaGateway {

    //Causa getCausa(Integer id);

    Causa create(Causa causa);

    List<Causa> findAll();

    Causa findById(Integer id);

    Causa update(Causa causa);

    void delete(Integer id);

}
