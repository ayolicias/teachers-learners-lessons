package net.teachers_learners;

import java.util.HashMap;
import java.util.Map;

public class Lessons {

    public String name;
    public  String subject;
    int tokens = 0;

    Learners learners;

    public Lessons( String subject){
        Subjects.valueOf(subject).getSubject();
    }

    Map<String,Integer>storeLearners= new HashMap< String, Integer >();
        private int addCounter =1;

    public Lessons( ) {

    }


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

        public String totalLearners(){
            this.name = learners.firstName;
            return String.valueOf((storeLearners.size()));
        }

        String accept(){

            if (subject.matches(subject)){
                return "learners has been registerd";

            }
            else{
                return "learner has been canceled";
            }

        }
       public String startLesson(Teachers teachers){

           if (subject.matches(subject)){
//          if (storeLearners >= 5){
               return "teachers has been succesful";

           }
           else{
               return "teacher has been cancelled";
           }

       }

       public String startLessons(String start){
//            String start;

//        if (start >= 5 ){
//
//
//        }
           return start;
       }





//
//        Map<String, Integer>storedSubjects= new HashMap<>();
//            int token = 0;
//                public String startLessons(){
//                    this.subject = learners.firstName;
//                    if (!storedSubjects.containsKey(subject)){
//                        storedSubjects.put(subject,token);
//
//
//                    }
//
//
//
//                 return null;
//            }




}
