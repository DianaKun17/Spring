package lesson_1;

import org.springframework.stereotype.Component;

@Component("Archive")
public class Archive implements iArchive{
    @Override
    public void medicalHistory(){
        System.out.println("Here is you medical card");
    }
}
