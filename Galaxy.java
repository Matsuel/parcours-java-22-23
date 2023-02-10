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
        for (CelestialObject object: this.celestialObjects){
            if (object instanceof Star){
                if (rep.containsKey("Star")){
                    rep.put("Star", rep.get("Star")+object.getMass());
                }else{
                    rep.put("Star", object.getMass());
                }
            }else if (object instanceof Planet){
                if (rep.containsKey("Planet")){
                    rep.put("Planet", rep.get("Planet")+object.getMass());
                }else{
                    rep.put("Planet", object.getMass());
                }
            }else{
                if (rep.containsKey("Other")){
                    rep.put("Other", rep.get("Other")+object.getMass());
                }else{
                    rep.put("Other", object.getMass());
                }
            }
        }
        return rep;
    }


}
