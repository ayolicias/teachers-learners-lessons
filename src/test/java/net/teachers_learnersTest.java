package net;
import static org.junit.jupiter.api.Assertions.assertEquals;

import net.teachers_learners.Learners;
import net.teachers_learners.Lessons;
import net.teachers_learners.Subjects;
import net.teachers_learners.Teachers;
import org.junit.Test;

public class teachers_learnersTest {

    private Subjects subjects;

    @Test
    public void TeacherShouldGetSubject(){
//        Learners Leanerss = new Learners(firstName,lastName,  );
        Teachers teachers = new Teachers();

        assertEquals(Subjects.valueOf(toString()),"Mathematics");

    }

    }

