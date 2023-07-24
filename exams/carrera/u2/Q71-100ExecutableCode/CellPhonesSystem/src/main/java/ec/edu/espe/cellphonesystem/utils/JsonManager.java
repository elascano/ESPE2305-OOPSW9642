package ec.edu.espe.cellphonesystem.utils;

import com.google.gson.Gson;
import ec.edu.espe.cellphonesystem.model.CellPhone;


/**
 *
 * @author caeta
 */
public class JsonManager {
    public String convertToJson(CellPhone cellPhone) {
        Gson gson = new Gson();
        
        String FormatedData = gson.toJson(cellPhone);
        return FormatedData;  
    }
    
}
