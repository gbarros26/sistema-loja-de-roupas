/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;

/**
 *
 * @author silas
 */
public class Sale implements Serializable {
    private final static long serialVersionUID = 1L;
    
    @Id
    private Long id;
    
    private Set<SaleItem> items = new HashSet<>();
    
    //private Employee employee;
    //private Customer customer;
    
    private Date moment;
    
    public Sale() {
        this.moment = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<SaleItem> getItems() {
        return items;
    }
    
    public void addItem(SaleItem item) {
        items.add(item);
    }
    
    public void removeItem(SaleItem item) {
        items.remove(item);
    }

    public Date getMoment() {
        return moment;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sale other = (Sale) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", items=" + items + ", moment=" + moment + '}';
    }
       
}
