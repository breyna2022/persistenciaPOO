/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.utp.clase15.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author DELL
 */
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    @Id
    private int idcategoria;
    @Basic
    private String nombre;

    public Categoria() {
    }

    public Categoria(int idcategoria, String nombre) {
        this.idcategoria = idcategoria;
        this.nombre = nombre;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
