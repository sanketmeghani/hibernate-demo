package dev.sanket.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle
{
    @Id
    @GeneratedValue
    private int idVehcle;
    private String manufacturer;
    public int getIdVehcle()
    {
        return idVehcle;
    }
    public void setIdVehcle(int idVehcle)
    {
        this.idVehcle = idVehcle;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
}
