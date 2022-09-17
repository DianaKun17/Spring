package lesson_1;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean(name = "Refferal")
    public iRefferal refferal() {
        return new Refferal();
    }

    @Bean(name = "Archive")
    public iArchive archive() {
        return new Archive();
    }

    @Bean(name = "BuildingPlane")
    public iBuildingPlane buildingPlane() {
        return new BuildingPlane();
    }

    @Bean(name = "registry")
    public iRegistry registry (iRefferal refferal, iBuildingPlane buildingPlane, iArchive archive) {
        Registry registry = new Registry();
        registry.setArchive((Archive) archive);
        registry.setBuildingPlane((BuildingPlane) buildingPlane);
        registry.setRefferal((Refferal) refferal);
        return registry;
    }

}
