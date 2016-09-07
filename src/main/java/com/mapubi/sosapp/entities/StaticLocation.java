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
@Table(name="static_description")
public class StaticLocation extends SOSLocation {

    @OneToOne
    @JoinColumn(nullable = false)
    private LocationType type;
    @Column(nullable = false, unique = true, length = 30)
    private String name;
    @Column(nullable = false)
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date modified;
    @Column(nullable = false)
    private int state;
    @OneToOne
    @JoinColumn(nullable = false)
    private Administrator creator;

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Administrator getCreator() {
        return creator;
    }

    public void setCreator(Administrator creator) {
        this.creator = creator;
    }
    
    
    
}
