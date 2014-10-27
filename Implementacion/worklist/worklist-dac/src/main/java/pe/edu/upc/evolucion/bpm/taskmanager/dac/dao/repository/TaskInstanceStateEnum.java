package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import lombok.Getter;

/**
 *
 * @author USUARIO
 */
public enum TaskInstanceStateEnum {

    CREATED(1),
    READY(2),
    RESERVED(3),
    INPROGRESS(4),
    SUSPENDED(5),
    COMPLETED(6),
    FAILED(7),
    ERROR(8),
    EXITED(9),
    OBSOLETE(10),
    CLOSED(11),
    ANYSTATE(99);

    @Getter private final Integer value;

    TaskInstanceStateEnum(Integer value) {
        this.value = value;
    }
}
