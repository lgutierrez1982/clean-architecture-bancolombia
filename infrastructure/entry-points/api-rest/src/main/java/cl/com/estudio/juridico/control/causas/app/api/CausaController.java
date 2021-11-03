package cl.com.estudio.juridico.control.causas.app.api;

import cl.com.estudio.juridico.control.causas.app.model.causa.Causa;
import cl.com.estudio.juridico.control.causas.app.usecase.causa.CausaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/causa", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class CausaController {

    private final CausaUseCase causaUseCase;

    @GetMapping(path = "/{id}")
    public Causa getCausa(@PathVariable Integer id) {
        return causaUseCase.getCausa(id);
    }
}
