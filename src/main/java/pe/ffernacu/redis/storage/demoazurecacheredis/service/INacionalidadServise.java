package pe.ffernacu.redis.storage.demoazurecacheredis.service;

import pe.ffernacu.redis.storage.demoazurecacheredis.model.Nacionalidad;
import java.util.List;
import java.util.Optional;

public interface INacionalidadServise {
    public List<Nacionalidad> listarNacionalidad();
    public Optional<Nacionalidad> listarNacionalidadById(Integer id);
}
