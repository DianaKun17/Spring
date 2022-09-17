package lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("registry")
public class Registry implements iRegistry{
    private Archive archive;
    private BuildingPlane buildingPlane;
    private Refferal refferal;

    @Autowired(required = false)
    @Qualifier("Refferal")
    public void setRefferal(Refferal refferal){
        this.refferal = refferal;
    }

    @Autowired(required = false)
    @Qualifier("Archive")
    public void setArchive(Archive archive){
        this.archive = archive;
    }

    @Autowired(required = false)
    @Qualifier("BuildingPlane")
    public void setBuildingPlane(BuildingPlane buildingPlane){
        this.buildingPlane = buildingPlane;
    }

    public void doctorsAppointment() {
        refferal.getRefferal();
        archive.medicalHistory();
        buildingPlane.cabinetNumber();
    }
}
