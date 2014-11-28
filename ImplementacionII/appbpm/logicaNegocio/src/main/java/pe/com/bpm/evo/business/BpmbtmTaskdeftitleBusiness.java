/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.business;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.bpm.evo.business.base.BaseBusiness;
import pe.com.bpm.evo.business.base.OperacionEnum;
import pe.com.bpm.evo.entity.BpmbtmTaskdeftitle;
import pe.com.bpm.evo.entity.BpmbtmTaskdeftitlePK;
import pe.com.bpm.evo.repository.BpmbtmTaskdeftitleRepository;

/**
 *
 * @author Prueba
 */
public class BpmbtmTaskdeftitleBusiness implements BaseBusiness<BpmbtmTaskdeftitle, BpmbtmTaskdeftitlePK> {

    @Autowired
    BpmbtmTaskdeftitleRepository btr;

    @Override
    public BpmbtmTaskdeftitle ejecutar(OperacionEnum operacionEnum, BpmbtmTaskdeftitle entidad, BpmbtmTaskdeftitlePK id) {
        BpmbtmTaskdeftitle bt = null;
        switch (operacionEnum) {
            case REGISTRAR:
                btr.save(entidad);
                break;

            case EDITAR:
                btr.save(entidad);
                break;

            case ELIMINAR:
                btr.delete(id);
                break;

            case OBTENER:
                bt = btr.findOne(id);
                break;
        }
        return bt;
    }

    @Override
    public Iterable<BpmbtmTaskdeftitle> ListarTodo() {
        return btr.findAll();
    }

    @Override
    public Iterable<BpmbtmTaskdeftitle> ListarPersonalizado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BpmbtmTaskdeftitle TraerObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
