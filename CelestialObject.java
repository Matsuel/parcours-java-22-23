public class CelestialObject {
    public double x,y,z = 0.0;
    public String name;

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

    //*getter pour x,y,z et pour name
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
}

