/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.repository;

import pe.com.bpm.evo.entity.QrtzSimpleTriggers;
import pe.com.bpm.evo.entity.QrtzSimpleTriggersPK;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Prueba
 */
public interface QrtzSimpleTriggersRepository extends CrudRepository<QrtzSimpleTriggers, QrtzSimpleTriggersPK> {
    
}
