package net.teachers_learners;

public class Teachers {
    String teacherName;
    String lastName;
    String emailAddress;

    public Teachers(String teacherName, String lastName, String emailAddress){
        this.teacherName = teacherName;
        this.lastName =lastName;
        this.emailAddress = emailAddress;
    }

    String getTeacherName(){
        return teacherName;
    }
    String getLastName(){
        return lastName;
    }
    String getEmailAddress(){
        return emailAddress;
    }
}
