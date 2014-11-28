/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.business;

import com.bpmbtm.accesodato.BpmbtmGenerichumanrole;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.bpm.evo.business.base.BaseBusiness;
import pe.com.bpm.evo.business.base.OperacionEnum;
import pe.com.bpm.evo.repository.BpmbtmGenerichumanroleRepository;

/**
 *
 * @author Prueba
 */
@Service("BpmbtmGenerichumanroleBusiness")
public class BpmbtmGenerichumanroleBusiness implements BaseBusiness<BpmbtmGenerichumanrole, Integer> {

    @Autowired
    BpmbtmGenerichumanroleRepository bgr;

    @Override
    public BpmbtmGenerichumanrole ejecutar(OperacionEnum operacionEnum, BpmbtmGenerichumanrole entidad, Integer id) {
        BpmbtmGenerichumanrole bg = null;
        switch (operacionEnum) {
            case REGISTRAR:
                bgr.save(entidad);
                break;

            case EDITAR:
                bgr.save(entidad);
                break;

            case ELIMINAR:
                bgr.delete(id);
                break;

            case OBTENER:
                bg = bgr.findOne(id);
                break;

        }
        return bg;
    }

    @Override
    public Iterable<BpmbtmGenerichumanrole> ListarTodo() {
        return bgr.findAll();
    }

    @Override
    public Iterable<BpmbtmGenerichumanrole> ListarPersonalizado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BpmbtmGenerichumanrole TraerObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
