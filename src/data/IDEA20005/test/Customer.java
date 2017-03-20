package data.IDEA20005.test;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 3/20/2017.
 */
@Entity
public class Customer {
    private int id;
    private String customername;
    private Collection<Order> customerordersById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CUSTOMERNAME", nullable = true, length = 255)
    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (customername != null ? !customername.equals(customer.customername) : customer.customername != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customername != null ? customername.hashCode() : 0);
        return result;
    }


    @ManyToMany
    @JoinTable(name = "CUSTOMERORDER",
            joinColumns = {@JoinColumn(name = "ORDERID", referencedColumnName="ID")},
            inverseJoinColumns = {@JoinColumn(name = "CUSTOMERID", referencedColumnName="ID")} )
    public Collection<Order> getCustomerordersById() {
        return customerordersById;
    }

    public void setCustomerordersById(Collection<Order> customerordersById) {
        this.customerordersById = customerordersById;
    }
}
