package com.mapubi.sosapp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author donald
 */
@Entity
@Table(name="service_description")
public class ServiceDescription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(nullable = false)
    private ServiceDescriptionType type;
    @OneToMany
    private List<DescriptionElement> elements;

    public ServiceDescriptionType getType() {
        return type;
    }

    public void setType(ServiceDescriptionType type) {
        this.type = type;
    }

    public List<DescriptionElement> getElements() {
        return elements;
    }

    public void setElements(List<DescriptionElement> elements) {
        this.elements = elements;
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
        if (!(object instanceof ServiceDescription)) {
            return false;
        }
        ServiceDescription other = (ServiceDescription) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smacomit.sosapp.job.ServiceDescription[ id=" + id + " ]";
    }
    
}

