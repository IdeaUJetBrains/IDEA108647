package data.IDEA16107;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Olga Pavlova on 3/21/2017.
 */
public class PK implements Serializable {
    private int id2;
    private int id1;

    @Column(name = "ID2", nullable = false)
    @Id
    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    @Column(name = "ID1", nullable = false)
    @Id
    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PK that = (PK) o;

        if (id2 != that.id2) return false;
        if (id1 != that.id1) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id2;
        result = 31 * result + id1;
        return result;
    }
}
