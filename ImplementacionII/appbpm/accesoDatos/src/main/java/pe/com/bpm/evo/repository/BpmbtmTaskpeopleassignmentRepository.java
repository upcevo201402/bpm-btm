/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.bpm.evo.entity.BpmbtmTaskpeopleassignment;
import pe.com.bpm.evo.entity.BpmbtmTaskpeopleassignmentPK;

/**
 *
 * @author Prueba
 */
@Repository("BpmbtmTaskpeopleassignmentRepository")
public interface BpmbtmTaskpeopleassignmentRepository extends CrudRepository<BpmbtmTaskpeopleassignment, BpmbtmTaskpeopleassignmentPK> {
    
}
