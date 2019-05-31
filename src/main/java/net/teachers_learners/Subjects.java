package net.teachers_learners;

public enum Subjects{

    Mathematics("Mathematica"),
    LifeSciences("LifeSciences"),
    Geography("Geography"),
    ConsumerStudies("ConsumerStudies"),
    Accounting("Accounting"),
    Economics("Economics"),
    History("History");

    private final String subject;

       Subjects( String subject ){
         this.subject = subject;
     }
     public String getSubject(){
         return subject;
     }
}
