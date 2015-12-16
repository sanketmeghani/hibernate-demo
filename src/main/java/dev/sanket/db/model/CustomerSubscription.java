package dev.sanket.db.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import dev.sanket.db.DBLayer;

@Entity
@Table(name = "CUSTOMER_SUBSCRIPTIONS")
public class CustomerSubscription implements Serializable
{
    private static final long serialVersionUID = 8632234075693110977L;

    @EmbeddedId
    private CustomerSubscriptionKey subscriptionKey;

    @Column(name = "newsletter")
    private String newsletter;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "site")
    private String site;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "creation_date")
    private Date createdAt;

    @Column(name = "last_updated_by")
    private String updatedBy;

    @Column(name = "last_updated")
    private Date updatedAt;

    public static CustomerSubscription byEmailAndNotificationType(String email, String notificationType)
    {
        String query = "FROM " + CustomerSubscription.class.getName() + " WHERE email = '" + email + "' AND notification_type = '" +notificationType+ "'";
        CustomerSubscription subscription = (CustomerSubscription) DBLayer.fetch(query);
        
        return subscription;
    }

    public CustomerSubscriptionKey getSubscriptionKey()
    {
        return subscriptionKey;
    }

    public void setSubscriptionKey(CustomerSubscriptionKey subscriptionKey)
    {
        this.subscriptionKey = subscriptionKey;
    }

    public String getNewsletter()
    {
        return newsletter;
    }

    public void setNewsletter(String newsletter)
    {
        this.newsletter = newsletter;
    }

    public String getMobileNo()
    {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo)
    {
        this.mobileNo = mobileNo;
    }

    public String getSite()
    {
        return site;
    }

    public void setSite(String site)
    {
        this.site = site;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy()
    {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }
}
