public class CelestialObject {
    public double x,y,z = 0.0;
    public String name;
    public static double KM_IN_ONE_AU= 150000000;

    //Constructeur par défaut
    public CelestialObject() {
        this.name = "Soleil";
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    //Constructeur qui prend en paramètre le nom de l'objet et ses coordonnées x,y,z
    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Getter pour x,y,z et pour name
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public String getName(){
        return name;
    }

    //Setter pour x,y,z et name
    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }
    public void setZ(double z){
        this.z=z;
    }
    public void setName(String name){
        this.name=name;
    }

    //Méthode getDistanceBetween qui renvoie la distance entre 2 objets passés en paramètres
    public static double getDistanceBetween(CelestialObject c1, CelestialObject c2){
        return Math.sqrt(Math.pow(c2.getX()-c1.getX(),2)+Math.pow(c2.getY()-c1.getY(),2)+Math.pow(c2.getZ()-c1.getZ(),2));
    }
    public static double getDistanceBetweenInKm(CelestialObject c1, CelestialObject c2){
        return getDistanceBetween(c1,c2)*150000000;
    }

    public String toString(){
        return this.getName()+" is positionned at ("+this.getX()+", "+ this.getY()+", "+ this.getZ()+")";
    }

    public boolean equals(CelestialObject object){
        if (object==null)return false;
        if (object.getX()==this.getX() && object.getY()==this.getY() && object.getZ()==this.getZ() && object.name==this.name){
            return true;
        }else{
            return false;
        }
    }

    public int hashCode(){
        return (int)Math.round(this.getName().hashCode()+this.getX()+this.getY()+this.getZ());
    }

}