/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.clientapp.model;

import ec.edu.espe.clientapp.controller.Button;
import ec.edu.espe.clientapp.controller.Menu;

/**
 *
 * @author NarvaezLeonardo
 */
public abstract class GUIFactory {

    private static int sys;
    public static GUIFactory getFactory(){
//    int sys == readFromConfigFile("OS_TYPE");
    if(sys==0)
        return (new WinFactory());
    else
        return(new LinuxFactory());
    }
    public abstract Button createButton();
    public abstract Menu createMenu();
}
