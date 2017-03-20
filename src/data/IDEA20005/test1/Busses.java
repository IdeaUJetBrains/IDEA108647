package data.IDEA20005.test1;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 3/20/2017.
 */
@Entity
public class Busses {
    private int id;
    private String buss;
    private Integer busstableDriverid;
    private Drivers driversByBusstableDriverid;
    private Collection<Drivers> driversById;

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

    @Basic
    @Column(name = "BUSSTABLE_DRIVERID", nullable = true)
    public Integer getBusstableDriverid() {
        return busstableDriverid;
    }

    public void setBusstableDriverid(Integer busstableDriverid) {
        this.busstableDriverid = busstableDriverid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Busses busses = (Busses) o;

        if (id != busses.id) return false;
        if (buss != null ? !buss.equals(busses.buss) : busses.buss != null) return false;
        if (busstableDriverid != null ? !busstableDriverid.equals(busses.busstableDriverid) : busses.busstableDriverid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss != null ? buss.hashCode() : 0);
        result = 31 * result + (busstableDriverid != null ? busstableDriverid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "BUSSTABLE_DRIVERID", referencedColumnName = "ID")
    public Drivers getDriversByBusstableDriverid() {
        return driversByBusstableDriverid;
    }

    public void setDriversByBusstableDriverid(Drivers driversByBusstableDriverid) {
        this.driversByBusstableDriverid = driversByBusstableDriverid;
    }

    @OneToMany(mappedBy = "bussesByDrivertableBussid")
    public Collection<Drivers> getDriversById() {
        return driversById;
    }

    public void setDriversById(Collection<Drivers> driversById) {
        this.driversById = driversById;
    }
}
