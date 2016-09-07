package com.mapubi.sosapp.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author donald
 */
@Entity
@Table(name="admin")
public class Administrator extends SOSUser{

    @Column(name="cni_number", length=20, nullable = false, unique = true)
    private String cniNumber;

    public String getCniNumber() {
        return cniNumber;
    }

    public void setCniNumber(String cniNumber) {
        this.cniNumber = cniNumber;
    }
    
}

