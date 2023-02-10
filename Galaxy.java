import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


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

    public Map<String, Integer> computeMassRepartition(){
        Map <String, Integer> rep= new HashMap<String, Integer>();
        rep.put("Star", 0);
        rep.put("Planet", 0);
        rep.put("Other", 0);
        for (CelestialObject object: this.celestialObjects){
            if (object instanceof Star){
                rep.put("Star", rep.get("Star")+object.getMass());
            }else if (object instanceof Planet){
                rep.put("Planet", rep.get("Planet")+object.getMass());
            }else{
                rep.put("Other", rep.get("Other")+object.getMass());
            }
            System.out.println(rep);
        }
        return rep;
    }


}
