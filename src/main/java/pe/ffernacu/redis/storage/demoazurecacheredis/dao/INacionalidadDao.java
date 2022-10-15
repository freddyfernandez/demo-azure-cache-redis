package pe.ffernacu.redis.storage.demoazurecacheredis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ffernacu.redis.storage.demoazurecacheredis.model.Nacionalidad;

public interface INacionalidadDao extends JpaRepository<Nacionalidad,Integer> {
}
