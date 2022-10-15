package pe.ffernacu.redis.storage.demoazurecacheredis.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ffernacu.redis.storage.demoazurecacheredis.model.Nacionalidad;
import pe.ffernacu.redis.storage.demoazurecacheredis.service.INacionalidadServise;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/nacionalidad")
public class NacionalidadController {
    private final INacionalidadServise nacionalidadServise;
    @GetMapping
    public ResponseEntity<?> listarNacionalidad() {
        List<Nacionalidad> nacionalidades = nacionalidadServise.listarNacionalidad();
        return new ResponseEntity<>(nacionalidades, nacionalidades.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<?> listarNacionalidadById(@PathVariable Integer id) {
        Optional<Nacionalidad> nacionalidades = nacionalidadServise.listarNacionalidadById(id);
        return new ResponseEntity<>(nacionalidades, nacionalidades.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}
