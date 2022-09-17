package lesson_1;

import org.springframework.stereotype.Component;

@Component("BuildingPlane")
public class BuildingPlane implements iBuildingPlane{
    @Override
    public void cabinetNumber() {
        System.out.println("You need to go to the office №123");
    }
}
