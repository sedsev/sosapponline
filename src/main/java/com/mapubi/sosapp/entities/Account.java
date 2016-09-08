package com.mapubi.sosapp.entities;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author donald
 */
@Entity
@Table(name="account")
public class Account implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date modified;
    @Column(nullable = false)
    private int state;
    @OneToOne
    @JoinColumn(nullable = false)
    private AccountType type;
    @ManyToMany
    private List<SOSEventType> eventTypes;
    @OneToOne
    @JoinColumn(nullable = false)
    private SOSLocation location;
    @OneToOne
    private ServiceDescription service;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public List<SOSEventType> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<SOSEventType> eventTypes) {
        this.eventTypes = eventTypes;
    }

    public SOSLocation getLocation() {
        return location;
    }

    public void setLocation(SOSLocation location) {
        this.location = location;
    }

    public ServiceDescription getService() {
        return service;
    }

    public void setService(ServiceDescription service) {
        this.service = service;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smacomit.sosapp.job.Account[ id=" + id + " ]";
    }
    
}

