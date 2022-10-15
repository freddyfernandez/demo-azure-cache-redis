package pe.ffernacu.redis.storage.demoazurecacheredis.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.ffernacu.redis.storage.demoazurecacheredis.dao.INacionalidadDao;
import pe.ffernacu.redis.storage.demoazurecacheredis.model.Nacionalidad;
import pe.ffernacu.redis.storage.demoazurecacheredis.service.INacionalidadServise;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NacionalidadServiceImpl implements INacionalidadServise {
    private INacionalidadDao nacionalidadDao;
    @Cacheable(value="nacionalidad",unless="#result==null")
    public List<Nacionalidad> listarNacionalidad() {
        return nacionalidadDao.findAll();
    }
    @Cacheable(value="nacionalidad",key = "{#id}", unless="#result==null")
    public Optional<Nacionalidad> listarNacionalidadById(Integer id) {
        Optional<Nacionalidad> listaNacionalidadResponse = nacionalidadDao.findById(id);
        return listaNacionalidadResponse;
    }
}
