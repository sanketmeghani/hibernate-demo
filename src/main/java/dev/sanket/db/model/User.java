package dev.sanket.db.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "User")
public class User
{
    @Id
    @GeneratedValue
    int userId;
    String name;

    @OneToMany
    @LazyCollection(value =LazyCollectionOption.FALSE)
    List<Address> addressList = new ArrayList<Address>();

    @OneToMany
    @LazyCollection(value =LazyCollectionOption.FALSE)
    List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public User()
    {
    }
    
    public User(String name)
    {
        this.name = name;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Address> getAddressList()
    {
        return addressList;
    }

    public void setAddressList(List<Address> addressList)
    {
        this.addressList = addressList;
    }

    public List<Vehicle> getVehicles()
    {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }
}
