/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.bpm.evo.business.base;

import java.io.Serializable;

/**
 *
 * @author Victor
 * @param <E>
 * @param <PK>
 */
public interface BaseBusiness<E, PK extends Serializable>  {
    
    E ejecutar(OperacionEnum operacionEnum, E entidad, PK id);
    
    Iterable<E> ListarTodo();
    
    Iterable<E> ListarPersonalizado();
    
    E TraerObjeto();
    
    
    
    
}
