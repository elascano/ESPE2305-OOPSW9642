/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package espe.edu.ec.Proffesor.controler.Controller;

import espe.edu.ec.Proffesor.model.ProfesorModel;
import espe.edu.ec.Proffesor.model.Profesor;
import espe.edu.ec.Proffesor.view.ProfesorView;
import java.awt.List;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class ProfesorController {
   private ProfesorModel model;
    private ProfesorView view;

    public ProfesorController(ProfesorModel model, ProfesorView view) {
        this.model = model;
        this.view = view;
    }

    public void actualizarSalario(int id, double nuevoSalario) {
        // Actualizar el salario del profesor en el modelo
        model.actualizarSalario(id, nuevoSalario);

        // Mostrar la información actualizada de los profesores en la vista;

        // Mostrar la información actualizada de los profesores en la vista
        var profesores = model.obtenerProfesores();
        view.mostrarProfesores(profesores);
    }

}
