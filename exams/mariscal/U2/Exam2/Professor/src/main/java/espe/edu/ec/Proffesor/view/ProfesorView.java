/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package espe.edu.ec.Proffesor.view;

import espe.edu.ec.Proffesor.model.Profesor;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class ProfesorView {
    
      public void mostrarProfesores(ArrayList<Profesor> profesores) {
          
  
        for (Profesor profesor : profesores) {
            System.out.println("ID: " + profesor.getId());
            System.out.println("Nombre: " + profesor.getNombre());
            System.out.println("Salario: " + profesor.getSalario());
            System.out.println();
        }
    }
     
}
