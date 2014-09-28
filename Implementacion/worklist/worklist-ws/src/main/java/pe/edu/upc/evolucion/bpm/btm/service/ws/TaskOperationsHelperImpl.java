package pe.edu.upc.evolucion.bpm.btm.service.ws;

import java.util.List;
import javax.xml.namespace.QName;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistory;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetTaskHistoryResponse;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.TBatchResponse;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachment;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TAttachmentInfo;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TComment;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TFault;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskAbstract;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskOperations;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTime;
import org.springframework.stereotype.Component;

/**
 *
 * @author USUARIO
 */
@Component
public class TaskOperationsHelperImpl implements TaskOperations {

    @Override
    public void deleteComment(String taskIdentifier, String commentIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOutcome(String identifier) throws IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getRendering(String identifier, QName renderingType) throws IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TTaskDetails> getSubtasks(String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String identifier) throws IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TTaskAbstract> getMyTaskAbstracts(String taskType, String genericHumanRole, String workQueue, List<String> status, String whereClause, String orderByClause, String createdOnClause, Integer maxTasks, Integer taskIndexOffset) throws IllegalStateFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QName> getRenderingTypes(String identifier) throws IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void skip(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchClaim(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchSuspendUntil(List<String> identifier, TTime time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delegate(String identifier, TOrganizationalEntity organizationalEntity) throws IllegalStateFault, RecipientNotAllowed, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getOutput(String identifier, String part) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOutput(String identifier, String part, Object taskData) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchFail(List<String> identifier, TFault fault) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchSetPriority(List<String> identifier, int priority) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TAttachmentInfo> getAttachmentInfos(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forward(String identifier, TOrganizationalEntity organizationalEntity) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteOutput(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGenericHumanRole(String identifier, String genericHumanRole, TOrganizationalEntity organizationalEntity) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resume(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTaskStartDeadlineExpression(String identifier, String deadlineName, String deadlineExpression) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TTaskDetails getParentTask(String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchNominate(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchRelease(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TTaskOperations getTaskOperations(String identifier) throws IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchStop(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchSkip(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchSetGenericHumanRole(List<String> identifier, String genericHumanRole, TOrganizationalEntity organizationalEntity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchRemove(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TTaskDetails getTaskDetails(String identifier) throws IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchComplete(List<String> identifier, Object taskData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAttachment(String taskIdentifier, String attachmentIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void complete(String identifier, Object taskData) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String instantiateSubtask(String taskIdentifier, String name) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GetTaskHistoryResponse getTaskHistory(GetTaskHistory getTaskHistory) throws IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void release(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TFault getFault(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTaskCompletionDurationExpression(String identifier, String deadlineName, String durationExpression) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFault(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String addAttachment(String taskIdentifier, String name, String accessType, String contentType, Object attachment) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getInput(String identifier, String part) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suspendUntil(String identifier, TTime time) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasSubtasks(String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TTaskDetails> getMyTaskDetails(String taskType, String genericHumanRole, String workQueue, List<String> status, String whereClause, String orderByClause, String createdOnClause, Integer maxTasks, Integer taskIndexOffset) throws IllegalStateFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchForward(List<String> identifier, TOrganizationalEntity organizationalEntity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFault(String identifier, TFault fault) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTaskStartDurationExpression(String identifier, String deadlineName, String durationExpression) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchStart(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchSuspend(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTaskDescription(String identifier, String contentType) throws IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nominate(String identifier, TOrganizationalEntity organizationalEntity) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String addComment(String identifier, String text) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isSubtask(String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void claim(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TComment> getComments(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TTaskQueryResultSet query(String selectClause, String whereClause, String orderByClause, Integer maxTasks, Integer taskIndexOffset) throws IllegalStateFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchDelegate(List<String> identifier, TOrganizationalEntity organizationalEntity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TAttachment> getAttachment(String taskIdentifier, String attachmentIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suspend(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateComment(String taskIdentifier, String commentIdentifier, String text) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getParentTaskIdentifier(String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchResume(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTaskCompletionDeadlineExpression(String identifier, String deadlineName, String deadlineExpression) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fail(String identifier, TFault fault) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TTaskInstanceData getTaskInstanceData(String identifier, String properties, List<TRenderingTypes> renderingPreferences) throws IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TBatchResponse> batchActivate(List<String> identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getSubtaskIdentifiers(String taskIdentifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPriority(String identifier, int priority) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void activate(String identifier) throws IllegalStateFault, IllegalAccessFault, IllegalOperationFault, IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
