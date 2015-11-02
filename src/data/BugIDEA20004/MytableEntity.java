package data.BugIDEA20004;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 10/20/2015.
 */
@Entity
@Table(name = "TABLE_NAME", schema = "PUBLIC", catalog = "PUBLIC")
public class MytableEntity {
    private int id;
    private String name;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MytableEntity that = (MytableEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    private Collection<AbbottSiteContacts> my;


    @ManyToMany
    @JoinTable(schema = "PUBLIC", name = "TABLE_NAME",
            joinColumns = @JoinColumn(name = "ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID", referencedColumnName = "ID"))
    public Collection<AbbottSiteContacts> getSiteContacts(){
        return my;
    }
    public void setSiteContacts(Collection<AbbottSiteContacts> my){
        this.my = my;
    }
}
