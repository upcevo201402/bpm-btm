package pe.edu.upc.evolucion.bpm.btm.service.ws;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This class was generated by Apache CXF 3.0.1 2014-09-20T17:44:05.697-05:00
 * Generated source version: 3.0.1
 *
 */
@javax.jws.WebService(
        serviceName = "TaskService",
        portName = "TaskOperationsBindingPort",
        targetNamespace = "http://service.innovaswc.com/ns/bpel4people/ws-humantask/api/201407",
        wsdlLocation = "WEB-INF/wsdl/bpm-btm-humantask.wsdl",
        endpointInterface = "pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations")

public class TaskOperationsBindingPortImpl implements TaskOperations {
    
    @Autowired
    TaskOperations helper;
    
    private static final Logger logger = Logger.getLogger(TaskOperationsBindingPortImpl.class.getName());

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#deleteComment(java.lang.String  taskIdentifier ,)java.lang.String  commentIdentifier )*
     */
    @Override
    public void deleteComment(java.lang.String taskIdentifier, java.lang.String commentIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.deleteComment(taskIdentifier, commentIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getOutcome(java.lang.String  identifier )*
     */
    @Override
    public java.lang.String getOutcome(java.lang.String identifier) throws IllegalOperationFault, IllegalArgumentFault {
        return helper.getOutcome(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getRendering(java.lang.String  identifier ,)javax.xml.namespace.QName  renderingType )*
     */
    @Override
    public java.lang.Object getRendering(java.lang.String identifier, javax.xml.namespace.QName renderingType) throws IllegalArgumentFault {        
        return helper.getRendering(identifier, renderingType);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getSubtasks(java.lang.String  taskIdentifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails> getSubtasks(java.lang.String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getSubtasks(taskIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#remove(java.lang.String  identifier )*
     */
    @Override
    public void remove(java.lang.String identifier) throws IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.remove(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getMyTaskAbstracts(java.lang.String  taskType ,)java.lang.String  genericHumanRole ,)java.lang.String  workQueue ,)java.util.List<java.lang.String>  status ,)java.lang.String  whereClause ,)java.lang.String  orderByClause ,)java.lang.String  createdOnClause ,)java.lang.Integer  maxTasks ,)java.lang.Integer  taskIndexOffset )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract> getMyTaskAbstracts(java.lang.String taskType, java.lang.String genericHumanRole, java.lang.String workQueue, java.util.List<java.lang.String> status, java.lang.String whereClause, java.lang.String orderByClause, java.lang.String createdOnClause, java.lang.Integer maxTasks, java.lang.Integer taskIndexOffset) throws IllegalStateFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getMyTaskAbstracts(taskType, genericHumanRole, workQueue, status, whereClause, orderByClause, createdOnClause, maxTasks, taskIndexOffset);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getRenderingTypes(java.lang.String  identifier )*
     */
    @Override
    public java.util.List<javax.xml.namespace.QName> getRenderingTypes(java.lang.String identifier) throws IllegalArgumentFault {        
        return helper.getRenderingTypes(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#skip(java.lang.String  identifier )*
     */
    @Override
    public void skip(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.skip(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchClaim(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchClaim(java.util.List<java.lang.String> identifier) {        
        return helper.batchClaim(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchSuspendUntil(java.util.List<java.lang.String>  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime  time )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchSuspendUntil(java.util.List<java.lang.String> identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime time) {        
        return helper.batchSuspendUntil(identifier, time);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#delegate(java.lang.String  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity  organizationalEntity )*
     */
    @Override
    public void delegate(java.lang.String identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity) throws IllegalStateFault, RecipientNotAllowed, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.delegate(identifier, organizationalEntity);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getOutput(java.lang.String  identifier ,)java.lang.String  part )*
     */
    @Override
    public java.lang.Object getOutput(java.lang.String identifier, java.lang.String part) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getOutput(identifier, part);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#setOutput(java.lang.String  identifier ,)java.lang.String  part ,)java.lang.Object  taskData )*
     */
    @Override
    public void setOutput(java.lang.String identifier, java.lang.String part, java.lang.Object taskData) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.setOutput(identifier, part, taskData);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchFail(java.util.List<java.lang.String>  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault  fault )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchFail(java.util.List<java.lang.String> identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault fault) {        
        return helper.batchFail(identifier, fault);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchSetPriority(java.util.List<java.lang.String>  identifier ,)int  priority )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchSetPriority(java.util.List<java.lang.String> identifier, int priority) {        
        return helper.batchSetPriority(identifier, priority);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getAttachmentInfos(java.lang.String  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo> getAttachmentInfos(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getAttachmentInfos(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#forward(java.lang.String  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity  organizationalEntity )*
     */
    @Override
    public void forward(java.lang.String identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.forward(identifier, organizationalEntity);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#deleteOutput(java.lang.String  identifier )*
     */
    @Override
    public void deleteOutput(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.deleteOutput(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#setGenericHumanRole(java.lang.String  identifier ,)java.lang.String  genericHumanRole ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity  organizationalEntity )*
     */
    @Override
    public void setGenericHumanRole(java.lang.String identifier, java.lang.String genericHumanRole, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.setGenericHumanRole(identifier, genericHumanRole, organizationalEntity);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#resume(java.lang.String  identifier )*
     */
    @Override
    public void resume(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.resume(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#setTaskStartDeadlineExpression(java.lang.String  identifier ,)java.lang.String  deadlineName ,)java.lang.String  deadlineExpression )*
     */
    @Override
    public void setTaskStartDeadlineExpression(java.lang.String identifier, java.lang.String deadlineName, java.lang.String deadlineExpression) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.setTaskCompletionDeadlineExpression(identifier, deadlineName, deadlineExpression);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getParentTask(java.lang.String  taskIdentifier )*
     */
    @Override
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails getParentTask(java.lang.String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getParentTask(taskIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchNominate(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchNominate(java.util.List<java.lang.String> identifier) {        
        return helper.batchNominate(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#start(java.lang.String  identifier )*
     */
    @Override
    public void start(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.start(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchRelease(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchRelease(java.util.List<java.lang.String> identifier) {        
        return helper.batchRelease(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getTaskOperations(java.lang.String  identifier )*
     */
    @Override
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations getTaskOperations(java.lang.String identifier) throws IllegalOperationFault, IllegalArgumentFault {        
        return helper.getTaskOperations(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchStop(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchStop(java.util.List<java.lang.String> identifier) {        
        return helper.batchStop(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchSkip(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchSkip(java.util.List<java.lang.String> identifier) {        
        return helper.batchSkip(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchSetGenericHumanRole(java.util.List<java.lang.String>  identifier ,)java.lang.String  genericHumanRole ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity  organizationalEntity )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchSetGenericHumanRole(java.util.List<java.lang.String> identifier, java.lang.String genericHumanRole, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity) {        
        return helper.batchSetGenericHumanRole(identifier, genericHumanRole, organizationalEntity);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchRemove(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchRemove(java.util.List<java.lang.String> identifier) {        
        return helper.batchRemove(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getTaskDetails(java.lang.String  identifier )*
     */
    @Override
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails getTaskDetails(java.lang.String identifier) throws IllegalArgumentFault {        
        return helper.getTaskDetails(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchComplete(java.util.List<java.lang.String>  identifier ,)java.lang.Object  taskData )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchComplete(java.util.List<java.lang.String> identifier, java.lang.Object taskData) {        
        return helper.batchComplete(identifier, taskData);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#deleteAttachment(java.lang.String  taskIdentifier ,)java.lang.String  attachmentIdentifier )*
     */
    @Override
    public void deleteAttachment(java.lang.String taskIdentifier, java.lang.String attachmentIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.deleteAttachment(taskIdentifier, attachmentIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#complete(java.lang.String  identifier ,)java.lang.Object  taskData )*
     */
    @Override
    public void complete(java.lang.String identifier, java.lang.Object taskData) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.complete(identifier, taskData);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#instantiateSubtask(java.lang.String  taskIdentifier ,)java.lang.String  name )*
     */
    @Override
    public java.lang.String instantiateSubtask(java.lang.String taskIdentifier, java.lang.String name) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.instantiateSubtask(taskIdentifier, name);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getTaskHistory(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistory  getTaskHistory )*
     */
    @Override
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponse getTaskHistory(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistory getTaskHistory) throws IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getTaskHistory(getTaskHistory);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#release(java.lang.String  identifier )*
     */
    @Override
    public void release(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.release(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getFault(java.lang.String  identifier )*
     */
    @Override
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault getFault(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getFault(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#setTaskCompletionDurationExpression(java.lang.String  identifier ,)java.lang.String  deadlineName ,)java.lang.String  durationExpression )*
     */
    @Override
    public void setTaskCompletionDurationExpression(java.lang.String identifier, java.lang.String deadlineName, java.lang.String durationExpression) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.setTaskCompletionDurationExpression(identifier, deadlineName, durationExpression);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#deleteFault(java.lang.String  identifier )*
     */
    @Override
    public void deleteFault(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.deleteFault(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#addAttachment(java.lang.String  taskIdentifier ,)java.lang.String  name ,)java.lang.String  accessType ,)java.lang.String  contentType ,)java.lang.Object  attachment )*
     */
    @Override
    public java.lang.String addAttachment(java.lang.String taskIdentifier, java.lang.String name, java.lang.String accessType, java.lang.String contentType, java.lang.Object attachment) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.addAttachment(taskIdentifier, name, accessType, contentType, attachment);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getInput(java.lang.String  identifier ,)java.lang.String  part )*
     */
    @Override
    public java.lang.Object getInput(java.lang.String identifier, java.lang.String part) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getInput(identifier, part);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#suspendUntil(java.lang.String  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime  time )*
     */
    @Override
    public void suspendUntil(java.lang.String identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime time) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.suspendUntil(identifier, time);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#hasSubtasks(java.lang.String  taskIdentifier )*
     */
    @Override
    public boolean hasSubtasks(java.lang.String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.hasSubtasks(taskIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getMyTaskDetails(java.lang.String  taskType ,)java.lang.String  genericHumanRole ,)java.lang.String  workQueue ,)java.util.List<java.lang.String>  status ,)java.lang.String  whereClause ,)java.lang.String  orderByClause ,)java.lang.String  createdOnClause ,)java.lang.Integer  maxTasks ,)java.lang.Integer  taskIndexOffset )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails> getMyTaskDetails(java.lang.String taskType, java.lang.String genericHumanRole, java.lang.String workQueue, java.util.List<java.lang.String> status, java.lang.String whereClause, java.lang.String orderByClause, java.lang.String createdOnClause, java.lang.Integer maxTasks, java.lang.Integer taskIndexOffset) throws IllegalStateFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getMyTaskDetails(taskType, genericHumanRole, workQueue, status, whereClause, orderByClause, createdOnClause, maxTasks, taskIndexOffset);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchForward(java.util.List<java.lang.String>  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity  organizationalEntity )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchForward(java.util.List<java.lang.String> identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity) {        
        return helper.batchForward(identifier, organizationalEntity);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#setFault(java.lang.String  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault  fault )*
     */
    @Override
    public void setFault(java.lang.String identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault fault) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.setFault(identifier, fault);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#setTaskStartDurationExpression(java.lang.String  identifier ,)java.lang.String  deadlineName ,)java.lang.String  durationExpression )*
     */
    @Override
    public void setTaskStartDurationExpression(java.lang.String identifier, java.lang.String deadlineName, java.lang.String durationExpression) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.setTaskStartDurationExpression(identifier, deadlineName, durationExpression);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchStart(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchStart(java.util.List<java.lang.String> identifier) {        
        return helper.batchStart(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchSuspend(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchSuspend(java.util.List<java.lang.String> identifier) {        
        return helper.batchSuspend(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getTaskDescription(java.lang.String  identifier ,)java.lang.String  contentType )*
     */
    @Override
    public java.lang.String getTaskDescription(java.lang.String identifier, java.lang.String contentType) throws IllegalArgumentFault {        
        return helper.getTaskDescription(identifier, contentType);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#nominate(java.lang.String  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity  organizationalEntity )*
     */
    @Override
    public void nominate(java.lang.String identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.nominate(identifier, organizationalEntity);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#addComment(java.lang.String  identifier ,)java.lang.String  text )*
     */
    @Override
    public java.lang.String addComment(java.lang.String identifier, java.lang.String text) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.addComment(identifier, text);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#isSubtask(java.lang.String  taskIdentifier )*
     */
    @Override
    public boolean isSubtask(java.lang.String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.isSubtask(taskIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#claim(java.lang.String  identifier )*
     */
    @Override
    public void claim(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.claim(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getComments(java.lang.String  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment> getComments(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getComments(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#query(java.lang.String  selectClause ,)java.lang.String  whereClause ,)java.lang.String  orderByClause ,)java.lang.Integer  maxTasks ,)java.lang.Integer  taskIndexOffset )*
     */
    @Override
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet query(java.lang.String selectClause, java.lang.String whereClause, java.lang.String orderByClause, java.lang.Integer maxTasks, java.lang.Integer taskIndexOffset) throws IllegalStateFault, IllegalArgumentFault {        
        return helper.query(selectClause, whereClause, orderByClause, maxTasks, taskIndexOffset);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchDelegate(java.util.List<java.lang.String>  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity  organizationalEntity )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchDelegate(java.util.List<java.lang.String> identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity organizationalEntity) {        
        return helper.batchDelegate(identifier, organizationalEntity);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getAttachment(java.lang.String  taskIdentifier ,)java.lang.String  attachmentIdentifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment> getAttachment(java.lang.String taskIdentifier, java.lang.String attachmentIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getAttachment(taskIdentifier, attachmentIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#suspend(java.lang.String  identifier )*
     */
    @Override
    public void suspend(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.suspend(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#updateComment(java.lang.String  taskIdentifier ,)java.lang.String  commentIdentifier ,)java.lang.String  text )*
     */
    @Override
    public void updateComment(java.lang.String taskIdentifier, java.lang.String commentIdentifier, java.lang.String text) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.updateComment(taskIdentifier, commentIdentifier, text);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getParentTaskIdentifier(java.lang.String  taskIdentifier )*
     */
    @Override
    public java.lang.String getParentTaskIdentifier(java.lang.String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getParentTaskIdentifier(taskIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchResume(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchResume(java.util.List<java.lang.String> identifier) {        
        return helper.batchResume(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#setTaskCompletionDeadlineExpression(java.lang.String  identifier ,)java.lang.String  deadlineName ,)java.lang.String  deadlineExpression )*
     */
    @Override
    public void setTaskCompletionDeadlineExpression(java.lang.String identifier, java.lang.String deadlineName, java.lang.String deadlineExpression) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.setTaskCompletionDeadlineExpression(identifier, deadlineName, deadlineExpression);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#stop(java.lang.String  identifier )*
     */
    @Override
    public void stop(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.stop(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#fail(java.lang.String  identifier ,)org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault  fault )*
     */
    @Override
    public void fail(java.lang.String identifier, org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault fault) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.fail(identifier, fault);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getTaskInstanceData(java.lang.String  identifier ,)java.lang.String  properties ,)java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes>  renderingPreferences )*
     */
    @Override
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData getTaskInstanceData(java.lang.String identifier, java.lang.String properties, java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes> renderingPreferences) throws IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getTaskInstanceData(identifier, properties, renderingPreferences);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#batchActivate(java.util.List<java.lang.String>  identifier )*
     */
    @Override
    public java.util.List<org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse> batchActivate(java.util.List<java.lang.String> identifier) {        
        return helper.batchActivate(identifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#getSubtaskIdentifiers(java.lang.String  taskIdentifier )*
     */
    @Override
    public java.util.List<java.lang.String> getSubtaskIdentifiers(java.lang.String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        return helper.getSubtaskIdentifiers(taskIdentifier);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#setPriority(java.lang.String  identifier ,)int  priority )*
     */
    @Override
    public void setPriority(java.lang.String identifier, int priority) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.setPriority(identifier, priority);
    }

    /* (non-Javadoc)
     * @see pe.edu.upc.evolucion.bpm.btm.service.ws.TaskOperations#activate(java.lang.String  identifier )*
     */
    @Override
    public void activate(java.lang.String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {        
        helper.activate(identifier);
    }   
}