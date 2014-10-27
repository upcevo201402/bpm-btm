package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import lombok.Getter;

/**
 *
 * @author USUARIO
 */
public enum TaskOperationEnum {
    CREATE(1),
    CLAIM(2),
    START(3),
    STOP(4),
    RELEASE(5),
    SUSPEND(6),
    SUSPENDUNTIL(7),
    RESUME(8),
    COMPLETE(9),
    REMOVE(10),
    FAIL(11),
    SETPRIORITY(12),
    ADDATTACHMENT(13),
    DELETEATTACHMENT(14),
    ADDCOMMENT(15),
    UPDATECOMMENT(16),
    DELETECOMMENT(17),
    SKIP(18),
    FORWARD(19),
    DELEGATE(20),
    SETOUTPUT(21),
    DELETEOUTPUT(22),
    SETFAULT(23),
    DELETEFAULT(24),
    ACTIVATE(25),
    NOMINATE(26),
    SETGENERICHUMANROLE(27),
    EXPIRE(28),
    ESCALATE(29),
    CANCEL(30),
    ANYSTATE(99);

    @Getter private final Integer value;

    TaskOperationEnum (Integer value) {
        this.value = value;
    }    
}
