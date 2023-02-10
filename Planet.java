import java.text.DecimalFormat;

public class Planet extends CelestialObject {
    private Star centerStar;
    
    public Planet(){
        this.centerStar= new Star();
    }

    public Planet(String name, double x, double y , double z,Star centerStar){
        this.name=name;
        this.x=x;
        this.y=y;
        this.z=z;
        this.centerStar= new Star(centerStar.getName(), centerStar.getX(), centerStar.getY(), centerStar.getZ(),centerStar.getMagnitude()); 
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

    @Override
    public boolean equals(Object object){
        if (object==null || getClass() != object.getClass())return false;
        if(object==this)return true;
        Planet obj= (Planet)object;
        return obj.getX()==this.getX() && obj.getY()==this.getY() && obj.getZ()==this.getZ() && obj.getName()==this.getName() && obj.centerStar.getName()== this.centerStar.getName() && obj.centerStar.getX()== this.centerStar.getX()&& obj.centerStar.getY()==this.centerStar.getY() && obj.centerStar.getZ()==this.centerStar.getZ();
    }

    @Override
    public int hashCode(){
        return (int)Math.round(this.getName().hashCode()+this.getX()*KM_IN_ONE_AU+this.getY()*KM_IN_ONE_AU+this.getZ()*KM_IN_ONE_AU+this.centerStar.getName().hashCode()+this.centerStar.getX()*KM_IN_ONE_AU+this.centerStar.getY()*KM_IN_ONE_AU+this.centerStar.getZ()*KM_IN_ONE_AU);
    }
}
