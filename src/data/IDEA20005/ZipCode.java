package data.IDEA20005;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ZipCode implements Serializable{
    private int zip;
    private String name;

    public ZipCode() {
    }

    public ZipCode(String name, int zip) {
        this.name = name;
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + zip;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ZipCode other = (ZipCode) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (zip != other.zip)
            return false;
        return true;
    }



}

