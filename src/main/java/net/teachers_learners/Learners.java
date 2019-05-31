package net.teachers_learners;

public class Learners {
    String firstName;
    String lastName;
    String emailAddress;

    int tokenBalance = 0;
    //todo: create notes map/list

    public Learners(String firstName, String lastName,String emailAddress){
         this.firstName = firstName;
         this.lastName = lastName;
         this.emailAddress = emailAddress;
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

    public void earnToken(){
        tokenBalance += 3;
    }

    public void earnNotes(Subjects subject){
//        tokenBalance +3;
    }
}
