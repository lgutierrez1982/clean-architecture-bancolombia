package cl.com.estudio.juridico.control.causas.app.model.causa.gateways;

import cl.com.estudio.juridico.control.causas.app.model.causa.Causa;

public interface CausaRepository {

    Causa getCausa(Integer id);
}
