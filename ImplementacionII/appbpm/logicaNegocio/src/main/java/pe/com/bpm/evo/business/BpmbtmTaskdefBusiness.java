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
import pe.com.bpm.evo.entity.BpmbtmTaskdef;
import pe.com.bpm.evo.repository.BpmbtmTaskdefRepository;

/**
 *
 * @author Prueba
 */
public class BpmbtmTaskdefBusiness implements BaseBusiness<BpmbtmTaskdef, Integer> {

    @Autowired
    BpmbtmTaskdefRepository btr;

    @Override
    public BpmbtmTaskdef ejecutar(OperacionEnum operacionEnum, BpmbtmTaskdef entidad, Integer id) {
        BpmbtmTaskdef bt = null;
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
    public Iterable<BpmbtmTaskdef> ListarTodo() {
        return btr.findAll();
    }

    @Override
    public Iterable<BpmbtmTaskdef> ListarPersonalizado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BpmbtmTaskdef TraerObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
