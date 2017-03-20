package data.IDEA20005.test;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 3/20/2017.
 */
@Entity
public class Order {
    private int id;
    private String ordername;
    private Collection<Customer> customerordersById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORDERNAME", nullable = true, length = 255)
    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (ordername != null ? !ordername.equals(order.ordername) : order.ordername != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ordername != null ? ordername.hashCode() : 0);
        return result;
    }

    @ManyToMany(mappedBy = "customerordersById")
    public Collection<Customer> getCustomerordersById() {
        return customerordersById;
    }

    public void setCustomerordersById(Collection<Customer> customerordersById) {
        this.customerordersById = customerordersById;
    }
}
