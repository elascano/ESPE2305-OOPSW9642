
package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class Contact {
    int id;
    String fullName;
    String contactName;
    String phoneNumber;
    String email;
    String gender;
    String type;
    Date bornOnDate;
    ArrayList<String> hobbies;
    String comments;
    String favoriteTeam;

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
            return id + "\n" + contactName + "\n" + phoneNumber + "\n" + email + "\n" + gender + "\n" + 
                    type + "\n" + bornOnDate + "\n" + hobbies + "\n" + comments + "\n" + favoriteTeam;
        }
    
}
