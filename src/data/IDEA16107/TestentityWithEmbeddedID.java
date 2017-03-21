package data.IDEA16107;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Olga Pavlova on 3/21/2017.
 */
@Entity
@Table(name = "TESTENTITY")
public class TestentityWithEmbeddedID {

    @EmbeddedId
    TestentityPK id;

    public TestentityPK getId() {
        return id;
    }
    public void setId(TestentityPK id) {
        this.id = id;
    }


    @Embeddable
    public static class TestentityPK implements Serializable {
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

            TestentityPK that = (TestentityPK) o;

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

}
