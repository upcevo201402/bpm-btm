/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.repository;

import com.bpmbtm.accesodato.BpmbtmGenerichumanrole;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Prueba
 */
@Repository("BpmbtmGenerichumanroleRepository")
public interface BpmbtmGenerichumanroleRepository extends CrudRepository<BpmbtmGenerichumanrole, Integer> {
    
}
