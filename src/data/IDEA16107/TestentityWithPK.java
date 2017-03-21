package data.IDEA16107;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 3/21/2017.
 */
@Entity
@Table(name = "TESTENTITY", schema = "PUBLIC", catalog = "PUBLIC")
@IdClass(PK.class)
public class TestentityWithPK {
    private String name;
    private int id2;
    private int id1;

    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "ID2", nullable = false)
    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    @Id
    @Column(name = "ID1", nullable = false)
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

        TestentityWithPK that = (TestentityWithPK) o;

        if (id2 != that.id2) return false;
        if (id1 != that.id1) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + id2;
        result = 31 * result + id1;
        return result;
    }
}
