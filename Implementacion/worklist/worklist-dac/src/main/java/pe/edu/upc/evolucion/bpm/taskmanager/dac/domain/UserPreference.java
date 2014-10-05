package pe.edu.upc.evolucion.bpm.taskmanager.dac.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name="BPMBTM_USERPREFERENCES")
@NamedQueries({
    @NamedQuery(name="UserPreference.findAll", query="from UserPreference p")
})
public class UserPreference implements Serializable {
    @Id
    @Column(name="USERID")
    private String login;
    @Column(name="NICKNAME")
    private String nickName;
    @Column(name="LANGUAGE")
    private byte [] avatar;

    public UserPreference() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }
}