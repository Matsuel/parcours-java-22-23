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
            Integer mass=0;
            if (object instanceof Star){
                mass=object.getMass();
                if (mass==0){
                    rep.put("Star", 0);
                }else if (rep.containsKey("Star")){
                    rep.put("Star", rep.get("Star")+mass);
                }else{
                    rep.put("Star", mass);
                }
            }else if (object instanceof Planet){
                mass=object.getMass();
                if (mass==0){
                    rep.put("Star", 0);
                }else if (rep.containsKey("Planet")){
                    rep.put("Planet", rep.get("Planet")+mass);
                }else{
                    rep.put("Planet", mass);
                }
            }else{
                mass=object.getMass();
                if (mass==0){
                    rep.put("Star", 0);
                }else if (rep.containsKey("Other")){
                    rep.put("Other", rep.get("Other")+mass);
                }else{
                    rep.put("Other", mass);
                }
            }
            System.out.println(rep);
        }
        return rep;
    }


}
