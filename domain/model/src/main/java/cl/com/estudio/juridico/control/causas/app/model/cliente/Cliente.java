package cl.com.estudio.juridico.control.causas.app.model.cliente;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Cliente {

    private Integer id;
    private String rut;
    private String nombre;
    private String apellido;
}
