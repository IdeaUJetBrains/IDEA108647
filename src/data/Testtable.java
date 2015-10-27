package data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Olga Pavlova on 10/27/2015.
 */
@Entity
public class Testtable {

    private int id;
    private String firstnameunique;
    private String lastnamenotnull;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRSTNAMEUNIQUE", nullable = true, length = 255)
    public String getFirstnameunique() {
        return firstnameunique;
    }

    public void setFirstnameunique(String firstnameunique) {
        this.firstnameunique = firstnameunique;
    }

    @Basic
    @Column(name = "LASTNAMENOTNULL", nullable = false, length = 255)
    public String getLastnamenotnull() {
        return lastnamenotnull;
    }

    public void setLastnamenotnull(String lastnamenotnull) {
        this.lastnamenotnull = lastnamenotnull;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Testtable testtable = (Testtable) o;

        if (id != testtable.id) return false;
        if (firstnameunique != null ? !firstnameunique.equals(testtable.firstnameunique) : testtable.firstnameunique != null)
            return false;
        if (lastnamenotnull != null ? !lastnamenotnull.equals(testtable.lastnamenotnull) : testtable.lastnamenotnull != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstnameunique != null ? firstnameunique.hashCode() : 0);
        result = 31 * result + (lastnamenotnull != null ? lastnamenotnull.hashCode() : 0);
        return result;
    }
}
