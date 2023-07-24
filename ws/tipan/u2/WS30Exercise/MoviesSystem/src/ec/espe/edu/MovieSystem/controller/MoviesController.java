
package ec.espe.edu.MovieSystem.controller;

import ec.espe.edu.MovieSystem.model.Movies;
import org.bson.Document;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class MoviesController extends BasicController<Movies> {

    public MoviesController(Movies object, String collectionName) {
        super(object, collectionName);
    }
     public MoviesController() {
        super(new Movies(), "TicketsSold");
    }
     
     
     
    public Document buildDocument(Movies movies ){
        Document document = new Document();

        document.append("name", movies.getName()).
                append("price", movies.getPrice()).
                append("income", movies.getDate()).
                append("ticketSold",movies.getTicketSold()).
                append("revenue",movies.getrevenue()); 
        return document;
    }

}


