package net.teachers_learners;

import javax.security.auth.Subject;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Learners {
    String firstName;
    String lastName;
    String emailAddress;
    int subjectNotes = 0;


    int tokenBalance = 0;

    //todo: create notes map/list

    Map<String, Integer> notes = new HashMap<String, Integer>();
        private int totalNotes;


        public String earnNotes(){
            if (!notes.containsKey(subjectNotes)){
                notes.put(String.valueOf(subjectNotes),totalNotes);
            }
            return earnNotes();
        }

    public Learners(String firstName, String lastName, String emailAddress, int totalNotes){
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailAddress = emailAddress;
            this.totalNotes = totalNotes;
            this.subjectNotes = subjectNotes;
    }

    String getFirstName( String subject ){

        return firstName;
    }

    String getLastName(){

        return lastName;
    }

    String getEmailAddress(){

        return emailAddress;
    }

//    String getSubject(){
////        ArrayList subjectsList;
//        for (int i = 0; i < stor.size(); i++){
//            ArrayList += sujectList.get(i);
//    }
//
//        return Subject;
//    }

//    public void earnToken(){
//        tokenBalance += 3;
//    }

//    public void earnNotes(Subjects subject){
////        tokenBalance +3;
//    }

    public boolean attended(Subject subject) {
        return attended(subject).size();
    }
}
