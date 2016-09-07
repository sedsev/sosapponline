package com.mapubi.sosapp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author donald
 */
@Entity
@Table(name="sos_event")
public class SOSEvent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(nullable = false)
    private SOSUser author;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date created;
    private String title;
    private String description;
    @OneToOne
    @JoinColumn(nullable = false)
    private SOSLocation location;

    public SOSUser getAuthor() {
        return author;
    }

    public void setAuthor(SOSUser author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SOSLocation getLocation() {
        return location;
    }

    public void setLocation(SOSLocation location) {
        this.location = location;
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
        if (!(object instanceof SOSEvent)) {
            return false;
        }
        SOSEvent other = (SOSEvent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smacomit.sosapp.job.SOSEvent[ id=" + id + " ]";
    }
    
}
