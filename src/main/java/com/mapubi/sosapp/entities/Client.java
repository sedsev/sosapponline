package com.mapubi.sosapp.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author donald
 */
@Entity
@Table(name="client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 60, nullable = false, unique = true)
    private String name;
    @Column(length = 160, nullable = false, unique = true)
    private String email;
    @Column(length = 20, nullable = false, unique = true)
    private String phoneNumber;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date modified;
    @Column(nullable = false)
    private int state;
    @OneToMany
    @JoinColumn(name="sos_user_id")
    private List<Account> accounts;
    @OneToOne
    @JoinColumn(nullable = false)
    private Administrator creator;

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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smacomit.sosapp.job.Client[ id=" + id + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Administrator getCreator() {
        return creator;
    }

    public void setCreator(Administrator creator) {
        this.creator = creator;
    }
    
}

