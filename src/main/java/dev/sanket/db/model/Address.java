package dev.sanket.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address
{
    @Id
    @GeneratedValue
    @Column(name = "addressId")
    private int addressId;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private int pincode;

    public int getAddressId()
    {
        return addressId;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public int getPincode()
    {
        return pincode;
    }

    public void setPincode(int pincode)
    {
        this.pincode = pincode;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        builder.append("[");
        builder.append("state: ").append(state).append(", ");
        builder.append("pincode: ").append(pincode);
        builder.append("]");
        return builder.toString();
    }
}
