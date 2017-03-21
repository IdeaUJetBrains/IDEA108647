import data.IDEA20005.ZipCode;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Address {

    @EmbeddedId
    ZipCode zipCode;
    String other;

    public ZipCode getId() {
        return zipCode;
    }

    public void setId(ZipCode id) {
        this.zipCode = id;
    }
}
