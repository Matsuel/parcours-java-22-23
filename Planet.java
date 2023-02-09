import java.text.DecimalFormat;

public class Planet extends CelestialObject {
    private Star centerStar;
    
    public Planet(){
        centerStar= new Star();
    }

    public Planet(String name, double x, double y , double z,Star centerStar){
        this.name=name;
        this.x=x;
        this.y=y;
        this.z=z;
        this.centerStar= new Star(name, centerStar.getX(), centerStar.getY(), centerStar.getZ(),centerStar.getMagnitude()); 
    }

    public Star getCenterStar(){
        return this.centerStar;
    }

    public void setCenterStar(Star star){
        this.centerStar= star;
    }

    public String toString(){
        DecimalFormat format = new DecimalFormat("0.000");
        return this.getName()+" circles around "+centerStar.getName()+" at the "+format.format(this.getDistanceBetween(this, this.centerStar))+" AU";
    }
}
