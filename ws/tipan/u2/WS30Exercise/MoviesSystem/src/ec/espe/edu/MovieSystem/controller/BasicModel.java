
package ec.espe.edu.MovieSystem.controller;


import org.bson.Document;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */


public abstract class BasicModel {

    public abstract void create(Document document)  ;
    public abstract Document read(String id, String fieldName);
    public abstract Document read(Document document);
    

    
}
