package net.teachers_learners;

import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.Map;

public class Lessons {

     String name;
     String lastName;
     String emailAddress;

    int tokens = 0;;

    Subject subject;
    Learners learners;

    public Lessons( Subject subject){
        this.subject = subject;
    }

    Map<String,Integer>storeLearners= new HashMap< String, Integer >();
        private int addCounter =1;

    public  String addLearners(Learners learners) {
        this.name = learners.firstName;
        this.lastName = learners.lastName;
        this.emailAddress = learners.emailAddress;

        if (learners.earnNotes().length() >= 3 && learners.attended(subject)){

            if (!storeLearners.containsKey(name)) {
                storeLearners.put(name, addCounter);

            } else {
                int addCounter = storeLearners.get(name);
                addCounter++;
                storeLearners.put(name, addCounter);
            }
        }
        return name + "registed";
    }

        public int totalLearners(){
            return storeLearners.size();
        }

//        String accept(){
//
//            if (subject.matches(subject)){
//                return "learners has been registerd";
//
//            }
//            else{
//                return "learner has been canceled";
//            }
//
//        }
    //method check if teacher get subject
    public String startLesson(Teachers teachers){
        if (teachers.){

        }
    }


}
