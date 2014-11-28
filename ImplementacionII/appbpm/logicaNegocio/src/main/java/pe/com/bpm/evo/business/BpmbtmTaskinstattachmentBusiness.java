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
import pe.com.bpm.evo.entity.BpmbtmTaskinstattachment;
import pe.com.bpm.evo.repository.BpmbtmTaskinstattachmentRepository;

/**
 *
 * @author Prueba
 */
public class BpmbtmTaskinstattachmentBusiness implements BaseBusiness<BpmbtmTaskinstattachment, Integer> {

    @Autowired
    BpmbtmTaskinstattachmentRepository btr;

    @Override
    public BpmbtmTaskinstattachment ejecutar(OperacionEnum operacionEnum, BpmbtmTaskinstattachment entidad, Integer id) {
        BpmbtmTaskinstattachment bt = null;
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
    public Iterable<BpmbtmTaskinstattachment> ListarTodo() {
        return btr.findAll();
    }

    @Override
    public Iterable<BpmbtmTaskinstattachment> ListarPersonalizado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BpmbtmTaskinstattachment TraerObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
