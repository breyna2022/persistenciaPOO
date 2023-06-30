/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.utp.clase15.dao;

import java.util.List;

/**
 *
 * @author DELL
 * @param <T>
 */
public interface Operaciones<T> {
    void create(T t);
    void update(T t);
    void delete(int id);
    T read(int id);
    List<T> readAll();
}
