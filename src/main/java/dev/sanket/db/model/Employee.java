package dev.sanket.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import dev.sanket.db.DBLayer;

@Entity
@Table(name = "Employee")
public class Employee
{
    @Id
    @GeneratedValue
    @Column(name = "employeeId")
    private int employeeId;

    @Column(name = "name")
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addressId")
    @Fetch(value = FetchMode.JOIN)
    private Address address;

    public static Employee byId(int id)
    {
        Object object = DBLayer.fetch("FROM " + Employee.class.getName() + " AS e INNER JOIN FETCH e.address WHERE e.id = " + id);

        return (Employee) object;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        builder.append("Employee[");
        builder.append("id: " + employeeId + ", ");
        builder.append("name: " + name + ", ");
        builder.append("address: " + address + "");
        builder.append("]");

        return builder.toString();
    }
}
