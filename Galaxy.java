import java.util.List;
import java.util.ArrayList;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        celestialObjects = new ArrayList<CelestialObject>();
    }

    public List<CelestialObject> getCelestialObjects(){
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject){
        celestialObjects.add(celestialObject);
    }

    
}
