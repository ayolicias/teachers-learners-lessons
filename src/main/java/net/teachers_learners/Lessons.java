package net.teachers_learners;

import java.util.HashMap;
import java.util.Map;

public class Lessons {

    public String name;
    public  String subject;

    Learners learners;

    public Lessons( String subject){
        Subjects.valueOf(subject).getSubject();
    }

    Map<String,Integer>storeLearners= new HashMap< String, Integer >();
        private int addCounter =1;


        public  String addLearners(){
            this.name = learners.firstName;

            if (!storeLearners.containsKey(name)){
                storeLearners.put(name,addCounter);
            }

            else{
                int addCounter= storeLearners.get(name);
                addCounter ++;
                storeLearners.put(name,addCounter);
            }
            return addLearners();
        }

        public String howManyLearners(){
            this.name = learners.firstName;
            return String.valueOf((storeLearners.size()));
        }

        String Accept(){

            if (subject.matches(subject)){
                System.out.println("learners has been registerd");

            }
            else{
                System.out.println("learner has been canceled");
            }

            return Accept();
        }


}
