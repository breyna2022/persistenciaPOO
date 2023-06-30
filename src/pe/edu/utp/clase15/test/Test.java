
package pe.edu.utp.clase15.test;

import com.google.gson.Gson;
import pe.edu.utp.clase15.controllers.ControllerPersistence;
import pe.edu.utp.clase15.entity.Categoria;

/**
 *
 * @author DELL
 */
public class Test {
static ControllerPersistence cp = new ControllerPersistence();
static Gson gson = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Categoria cat = new Categoria(0, "Nuevo");
        //cp.create(cat);
        //Categoria cat = new Categoria(4, "Nuevo3");
        //cp.update(cat);
        //cp.delete(4);
        System.out.println(gson.toJson(cp.read(3)));
        System.out.println(gson.toJson(cp.readAll()));
        
    }
    
}
