package net.teachers_learners;
import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.Map;

public class Learners implements Teachers_learners {
    String firstName;
    String lastName;
    String emailAddress;

    String subjectNotes = "";
    int tokenBalance = 0;
    Learners learners;

    public Learners(String firstName, String lastName, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;

    }
    //todo: create notes map/list

    Map<String, Integer> notes = new HashMap<String, Integer>();
        int token = 0;
        public String earnNotes(){
            if (!notes.containsKey(subjectNotes)){
                notes.put(subjectNotes,tokenBalance);
            }
            return earnNotes();
        }

    public String earnToken() {
        if (addLearners(learners) == "registered" && totalLearners()>=5 ){
            token =+3;
            notes.get(subjectNotes);
        }

        return learners + "attended";
    }

    public String askNotes(){
            if (addLearners(learners) == "registed" && totalLearners() >=5){
                token =+3;
                notes.get(subjectNotes);

            }
        return askNotes();
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

    @Override
    public String addLearners( Learners learners ) {

        return null;
    }

    @Override
    public int totalLearners( ) {
        return 0;
    }

    @Override
    public String startTeacher( Teachers teachers ) {
        return null;
    }

    @Override
    public String startLesson( ) {
        return null;
    }
}
