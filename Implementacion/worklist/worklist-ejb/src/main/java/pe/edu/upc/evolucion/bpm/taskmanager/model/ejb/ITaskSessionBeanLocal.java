/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.util.List;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.IFaultData;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.ITask;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.ITaskContext;

/**
 *
 * @author User
 */
public interface ITaskSessionBeanLocal {
    /**
     * La tarea es reclamada para ser ejecutada por el usuario indicado en el 
     * contexto de ejecución de la tarea.
     * 
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como reclamada
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskManagerException
     */
    public ITask claim(ITaskContext ctx, String taskId) throws TaskManagerException;
    /**
     * Las tareas especificadas en la lista son reclamadas para ser ejecutadas
     * por el usuario indicado en el contexto de ejecución de la tarea.
     * 
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskManagerException
     */
    public void batchClaim(ITaskContext ctx, List<String> taskId) throws TaskManagerException;
    /**
     * La tarea es liberada para que otros participantes que pertenecen al grupo
     * de los que pueden ejecutar la tarea puedan reclamarla.
     * 
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return  Se devuelve la tarea actualizada luego de marcarla como liberada
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskManagerException
     */
    public ITask release(ITaskContext ctx, String taskId) throws TaskManagerException;
    /**
     * La tarea se declara como finalizada pues todo lo requerido para su completamiento
     * ha sido realizado.
     * 
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como completada
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskManagerException
     */
    public ITask complete(ITaskContext ctx, String taskId) throws TaskManagerException;    
    /**
     * 
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como iniciada
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskManagerException
     */
    public ITask start(ITaskContext ctx, String taskId) throws TaskManagerException;
    /**
     * 
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como iniciada
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskManagerException
     */
    public ITask resume(ITaskContext ctx, String taskId) throws TaskManagerException;
    /**
     * 
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como detenida
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskManagerException
     */
    public ITask stop(ITaskContext ctx, String taskId) throws TaskManagerException;
    /**
     * 
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @param fault Información sobre la falla en la ejecución de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como fallada
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskManagerException
     */
    public ITask fail(ITaskContext ctx, String taskId, IFaultData fault) throws TaskManagerException;            
}
