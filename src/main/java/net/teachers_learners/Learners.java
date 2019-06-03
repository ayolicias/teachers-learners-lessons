package net.teachers_learners;
import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.Map;

public class Learners {
    String firstName;
    String lastName;
    String emailAddress;

    String subjectNotes = "";
    int tokenBalance = 0;

    public Learners(String firstName, String lastName, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;

    }
    //todo: create notes map/list

    Map<String, Integer> notes = new HashMap<String, Integer>();
//        private int totalNotes;
        public String earnNotes(){
            if (!notes.containsKey(subjectNotes)){
                notes.put(subjectNotes,tokenBalance);
            }
            return earnNotes();
        }

    public void earnToken() {
    }
    public boolean attended(Subject subject)
    { return notes.containsKey(subjectNotes);
    }
    String getFirstName( ){

        return firstName;
    }

    String getLastName(){

        return lastName;
    }

    String getEmailAddress(){

        return emailAddress;
    }
}
