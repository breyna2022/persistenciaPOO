/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.utp.clase15.controllers;

import java.util.ArrayList;
import java.util.List;
import pe.edu.utp.clase15.controllers.exceptions.NonexistentEntityException;
import pe.edu.utp.clase15.dao.Operaciones;
import pe.edu.utp.clase15.entity.Categoria;

/**
 *
 * @author DELL
 */
public class ControllerPersistence implements Operaciones<Categoria>{
    CategoriaJpaController categoriaJpaController = new CategoriaJpaController();

    @Override
    public void create(Categoria t) {
        try {
            categoriaJpaController.create(t);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

    @Override
    public void update(Categoria t) {
        try {
            categoriaJpaController.edit(t);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
    }

    @Override
    public void delete(int id) {
        try {
            categoriaJpaController.destroy(id);
        } catch (NonexistentEntityException e) {
            System.out.println("Error: "+e);
        }
        
    }

    @Override
    public Categoria read(int id) {
        Categoria cat = new Categoria();
        try {
            cat = categoriaJpaController.findCategoria(id);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
       return cat;
    }

    @Override
    public List<Categoria> readAll() {
        List<Categoria> lista = new ArrayList<>();
       try {
            lista = categoriaJpaController.findCategoriaEntities();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
       return lista;
    }
    
    
}
