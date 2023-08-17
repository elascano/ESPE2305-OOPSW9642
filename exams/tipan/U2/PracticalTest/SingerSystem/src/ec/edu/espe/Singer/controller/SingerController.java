
package ec.edu.espe.Singer.controller;

import ec.edu.espe.Singer.model.Singer;
import org.bson.Document;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class SingerController extends BasicController<Singer> {

    public SingerController(Singer object, String collectionName) {
        super(object, collectionName);
    }
     public SingerController() {
        super(new Singer(), "DataSinger");
    }
     
     
     
    public Document buildDocument(Singer singer) {
        Document document = new Document();

        document.append("name", singer.getName()).
                append("Salary", singer.getSalary()).
                append("kindofMusic", singer.getDate()).
                append("Age", singer.getAge()).
                append("revenueYear", singer.getYear() );
        return document;
    }

}
