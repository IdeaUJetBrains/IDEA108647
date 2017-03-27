package data.BugIDEA20004.dataJoinTable;


import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
@Entity
@Table(name = "BUSSES")
public class Busses {
    private int id;
    private String buss;
    private int id1;
    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BUSS", nullable = true, length = 255)
    public String getBuss() {
        return buss;
    }

    public void setBuss(String buss) {
        this.buss = buss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Busses busses = (Busses) o;

        if (id != busses.id) return false;
        if (buss != null ? !buss.equals(busses.buss) : busses.buss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss != null ? buss.hashCode() : 0);
        return result;
    }

    private Collection<Drivers> driverIds;
    @ManyToMany
    @JoinTable(name = "BUSSDRIVERS",
            joinColumns = {@JoinColumn(name = "DRIVERID", referencedColumnName="ID")},
            inverseJoinColumns = {@JoinColumn(name = "BUSSID", referencedColumnName="ID")} )
    public Collection<Drivers> getDriverIds() { return driverIds; }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public void setDriverIds(Collection<Drivers> driverIds) {
        this.driverIds = driverIds;
    }
    //public void setDriverIds(Collection<Test> driverIds) { this.driverIds = driverIds; }

}
