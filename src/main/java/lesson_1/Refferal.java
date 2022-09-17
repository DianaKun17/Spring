package lesson_1;

import org.springframework.stereotype.Component;

@Component("Refferal")
public class Refferal implements iRefferal{
    @Override
    public void getRefferal() {
        System.out.println("Refferal to a therapist");
    }
}
