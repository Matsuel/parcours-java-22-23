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

    //créer une méthode computeMassRepartition qui retourne un Map<String, Int> qui contient le nom de la classe et la masse totale de tous les objets de cette classe dans l'ordre décroissant de masse les noms 
    public Map<String, Integer> computeMassRepartition(){
        Map<String, Integer> massRepartition = new HashMap<String, Integer>();
        for (CelestialObject celestialObject : celestialObjects) {
            String className = celestialObject.getClass().getSimpleName();
            if (massRepartition.containsKey(className)) {
                if (className.equals("Planet")|| className.equals("Star")) {
                    massRepartition.put(className, massRepartition.get(className) + celestialObject.getMass());
                }else{
                    massRepartition.put("Other", massRepartition.get(className) + celestialObject.getMass());
                }
                
            } else {
                if (className.equals("Planet")|| className.equals("Star")) {
                    massRepartition.put(className, celestialObject.getMass());
                }else{
                    massRepartition.put("Other", celestialObject.getMass());
                }
                //massRepartition.put(className, celestialObject.getMass());
            }
        }
        
        return massRepartition;
    }

}
