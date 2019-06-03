package net.teachers_learners;
import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.Map;

public class Lessons {

     String name;
     String lastName;
     String emailAddress;
     Subject subject;
     Learners learners;
     Integer teachers;

    int tokens = 0;;


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

    //method check if teacher get subject
    public String startTeacher(Teachers teachers){
        if (addLearners(learners) == "registered" && totalLearners()>=5 ){
            tokens =+3;
            storeLearners.get(subject);
            return name +"successful";

        }
        else{
            return name + "cancelled";
        }
    }
    public String startLesson(){

      if (addLearners(learners) == "registered" && totalLearners()>=5 ){
          for(int i=0; i<storeLearners.size(); i++){

              teachers+=storeLearners.get(i);
          }
//          for (storeLearners.get(learners)){
              learners.earnNotes();
              learners.earnToken();
          }
      return startLesson();
    }

}
