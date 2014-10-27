package pe.edu.upc.evolucion.bpm.taskmanager.dac.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
//import org.hibernate.annotations.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "BPMBTM_USERPREFERENCES")
@NamedQueries({
    @NamedQuery(name="UserPreference.findAll", query="select p from UserPreference p")
})
public class UserPreference implements Serializable {
    
    @Id @Getter @Setter @Column(name="USERID")
    private String login;
    @Getter @Setter @Column(name="NICKNAME")
    private String nickName;
    @Getter @Setter @Column(name="LANGUAGE")
    private String language;
    @Getter @Setter @Column(name="AVATAR")
    private byte [] avatar;

    public UserPreference() {
    }
}