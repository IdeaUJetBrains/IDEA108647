package data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Olga Pavlova on 10/28/2015.
 */
@Entity
public class CompositeEntity {
    @EmbeddedId
    PK id;
    @Id
    int id1;



    @Embeddable
    public static class PK implements Serializable {
        @Column(name="ID")
        int departmentId;
        long projectId;
    }
}
