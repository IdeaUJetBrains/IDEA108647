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
@Table(schema = "PUBLIC", name = "TESTTABLE")
public class AbbottSiteContacts {
    @Id
    int id;




    @ManyToMany(mappedBy = "id")
    private Collection<Testtable> ab;

    public Collection<Testtable> getAb() {
        return ab;
    }

    public void setAb(Collection<Testtable> ab) {
        this.ab = ab;
    }
}
