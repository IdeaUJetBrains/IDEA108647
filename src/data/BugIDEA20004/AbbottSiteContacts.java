package data.BugIDEA20004;

import data.Testtable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 10/29/2015.
 */
@Entity
@Table(name = "TABLE_NAME")
public class AbbottSiteContacts {
    @Id
    int id;




    @ManyToMany(mappedBy = "id")
    private Collection<MytableEntity> ab;

    public Collection<MytableEntity> getAb() {
        return ab;
    }

    public void setAb(Collection<MytableEntity> ab) {
        this.ab = ab;
    }
}
