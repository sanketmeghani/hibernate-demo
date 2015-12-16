package dev.sanket.db.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class CustomerSubscriptionKey implements Serializable
{
    private static final long serialVersionUID = 6350267718457510253L;

    @Column(name = "email")
    private String email;

    @Column(name = "notification_type")
    private String notificationType;

    public CustomerSubscriptionKey()
    {
    }

    public CustomerSubscriptionKey(String email, String notificationType)
    {
        this.email = email;
        this.notificationType = notificationType;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNotificationType()
    {
        return notificationType;
    }

    public void setNotificationType(String notificationType)
    {
        this.notificationType = notificationType;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null || !(other instanceof CustomerSubscriptionKey))
        {
            return false;
        }

        CustomerSubscriptionKey otherKey = (CustomerSubscriptionKey) other;

        return (this == otherKey) || (email.equals(otherKey.getEmail()) && notificationType.equals(otherKey.getNotificationType()));
    }
}
