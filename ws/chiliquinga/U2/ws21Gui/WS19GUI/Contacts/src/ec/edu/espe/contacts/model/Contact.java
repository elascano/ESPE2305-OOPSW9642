package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yeshualinux
 */
public class Contact {
    private int id;
    private String fullName;
    private String contactName;
    private String phoneNumber;//int
    private String email;
    private String gender;
    private String type;
    private Date bornOnDate;
    private ArrayList<String> hobbies;
    private String comments;
    private String favoriteTeam;

    public Contact(int id, String fullName, String contactName, String phoneNumber, String email, String gender, String type, Date bornOnDate, ArrayList<String> hobbies, String comments, String favoriteTeam) {
        this.id = id;
        this.fullName = fullName;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.type = type;
        this.bornOnDate = bornOnDate;
        this.hobbies = hobbies;
        this.comments = comments;
        this.favoriteTeam = favoriteTeam;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + getId() + ", fullName=" + getFullName() + ", contactName=" + getContactName() + ", phoneNumber=" + getPhoneNumber() + ", email=" + getEmail() + ", gender=" + getGender() + ", type=" + getType() + ", bornOnDate=" + getBornOnDate() + ", hobbies=" + getHobbies() + ", comments=" + getComments() + ", favoriteTeam=" + getFavoriteTeam() + '}';
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

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
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
    
}
