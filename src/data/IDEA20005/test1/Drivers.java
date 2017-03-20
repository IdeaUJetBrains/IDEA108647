package data.IDEA20005.test1;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 3/20/2017.
 */
@Entity
public class Drivers {
    private int id;
    private String driver;
    private Integer drivertableBussid;
    private Collection<Busses> bussesById;
    private Busses bussesByDrivertableBussid;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DRIVER", nullable = true, length = 255)
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Basic
    @Column(name = "DRIVERTABLE_BUSSID", nullable = true)
    public Integer getDrivertableBussid() {
        return drivertableBussid;
    }

    public void setDrivertableBussid(Integer drivertableBussid) {
        this.drivertableBussid = drivertableBussid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drivers drivers = (Drivers) o;

        if (id != drivers.id) return false;
        if (driver != null ? !driver.equals(drivers.driver) : drivers.driver != null) return false;
        if (drivertableBussid != null ? !drivertableBussid.equals(drivers.drivertableBussid) : drivers.drivertableBussid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (drivertableBussid != null ? drivertableBussid.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "driversByBusstableDriverid")
    public Collection<Busses> getBussesById() {
        return bussesById;
    }

    public void setBussesById(Collection<Busses> bussesById) {
        this.bussesById = bussesById;
    }

    @ManyToOne
    @JoinColumn(name = "DRIVERTABLE_BUSSID", referencedColumnName = "ID")
    public Busses getBussesByDrivertableBussid() {
        return bussesByDrivertableBussid;
    }

    public void setBussesByDrivertableBussid(Busses bussesByDrivertableBussid) {
        this.bussesByDrivertableBussid = bussesByDrivertableBussid;
    }
}
