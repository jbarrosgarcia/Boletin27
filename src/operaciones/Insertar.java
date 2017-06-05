/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones;

import java.util.ArrayList;

/**
 * 
 * @author  Jose Barros
 */
public class Insertar {
         
        public  ArrayList <Alumno> table = new ArrayList <>();
        
        public void nuevoAlumno(String nb, String ap, String cu){

            table.add(new Alumno(nb, ap, cu));
            
            int longitud = table.size()-1;
                System.out.println(table.get(longitud).toString());
           
        }
}
