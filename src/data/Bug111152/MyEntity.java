package data.Bug111152;


import javax.persistence.*;
import java.security.Principal;

/**
 * Created by Olga Pavlova on 11/2/2015.
 */
@Entity
public class MyEntity implements Principal {
    @Id
    int id;

    private String username;

    @Override
    @Transient
    public String getName() {
        return this.username;
    }

    @Basic
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username=username;
    }
}
