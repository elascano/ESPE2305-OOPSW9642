
package ec.edu.espe.Singer.model;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class SingerManager {
    private static final String JSON_FILE_PATH = "singers.json";
    private List<Singer> singerList;

    public SingerManager() {
        singerList = loadSingerListFromJsonFile();
    }

    public void addSinger(Singer singer) {
        singerList.add(singer);
        saveSingerListToJsonFile();
    }

    public List<Singer> getSingerList() {
        return singerList;
    }

    public void deleteAllSingers() {
        singerList.clear();
        saveSingerListToJsonFile();
    }

    private List<Singer> loadSingerListFromJsonFile() {
        try (FileReader reader = new FileReader(JSON_FILE_PATH)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<Singer>>() {}.getType());
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void saveSingerListToJsonFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(JSON_FILE_PATH)) {
            gson.toJson(singerList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
