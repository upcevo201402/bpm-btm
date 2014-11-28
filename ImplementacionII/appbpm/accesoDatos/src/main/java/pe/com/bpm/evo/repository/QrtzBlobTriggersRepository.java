/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import pe.com.bpm.evo.entity.QrtzBlobTriggers;
import pe.com.bpm.evo.entity.QrtzBlobTriggersPK;

/**
 *
 * @author Prueba
 */
public interface QrtzBlobTriggersRepository extends CrudRepository<QrtzBlobTriggers, QrtzBlobTriggersPK> {
    
}
