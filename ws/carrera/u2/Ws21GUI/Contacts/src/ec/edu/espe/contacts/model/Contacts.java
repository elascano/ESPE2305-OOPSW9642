package ec.edu.espe.contacts.model;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Contacts {
    int id;
    String name;
    String contactName;
    String phoneNumber;
    String email;
    String gender;
    String type;
    Date bornonDate;
    ArrayList<String> hobbies;
    String comments;
    String favoriteTeam;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBornonDate() {
        return bornonDate;
    }

    public void setBornonDate(Date bornonDate) {
        this.bornonDate = bornonDate;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }

    public Contacts(int id, String name, String contactName, String phoneNumber, String email, String gender, String type, Date bornonDate, ArrayList<String> hobbies, String comments, String favoriteTeam) {
        this.id = id;
        this.name = name;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.type = type;
        this.bornonDate = bornonDate;
        this.hobbies = hobbies;
        this.comments = comments;
        this.favoriteTeam = favoriteTeam;
    }
    
}
