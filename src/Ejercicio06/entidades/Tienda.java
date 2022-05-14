/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06.entidades;

import java.util.Objects;

/**
 *
 * @author facuq
 */
public class Tienda {
    
    public String Objeto;
  
    public Tienda() {
    }

    public Tienda(String Objeto) {
        this.Objeto = Objeto;
    }

    public String getObjeto() {
        return Objeto;
    }

    public void setObjeto(String Objeto) {
        this.Objeto = Objeto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.Objeto);
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
        final Tienda other = (Tienda) obj;
        if (!Objects.equals(this.Objeto, other.Objeto)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Tienda{" + "Objeto=" + Objeto + '}';
    }
    
    
}
