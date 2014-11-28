/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.repository;

import pe.com.bpm.evo.entity.QrtzLocks;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import pe.com.bpm.evo.entity.QrtzLocksPK;

/**
 *
 * @author Prueba
 */
public interface QrtzLocksRepository extends CrudRepository<QrtzLocks, QrtzLocksPK > {
    
}
