
package ec.edu.espe.contacs.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Contact {
    int id;
     String fullName;
     String contactName;
     String phoneNumber;
     String gender;
     String email;
     String type;
     Date bornOnDate;
     ArrayList<String> habbies;
     String comments;
     String favoriteTeams;

    public Contact(int id, String fullName, String contacName, String phoneNumber, String comments) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", fullName=" + fullName + ", contactName=" + contactName + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", email=" + email + ", type=" + type + ", bornOnDate=" + bornOnDate + ", habbies=" + habbies + ", comments=" + comments + ", favoriteTeams=" + favoriteTeams + '}';
    }

    public Contact() {
    }

    public Contact(int id, String fullName, String contactName, String phoneNumber, String gender, String email, String type, Date bornOnDate, ArrayList<String> habbies, String comments, String favoriteTeams) {
        this.id = id;
        this.fullName = fullName;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.email = email;
        this.type = type;
        this.bornOnDate = bornOnDate;
        this.habbies = habbies;
        this.comments = comments;
        this.favoriteTeams = favoriteTeams;
    }

     
     
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    public ArrayList<String> getHabbies() {
        return habbies;
    }

    public void setHabbies(ArrayList<String> habbies) {
        this.habbies = habbies;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFavoriteTeams() {
        return favoriteTeams;
    }

    public void setFavoriteTeams(String favoriteTeams) {
        this.favoriteTeams = favoriteTeams;
    }
      
}
