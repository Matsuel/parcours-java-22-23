import java.text.DecimalFormat;

public class Star extends CelestialObject{
    private double magnitude=0.0;

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude){
        this.magnitude=magnitude;
    }

    public Star(){
        this.magnitude=0.0f;
        CelestialObject Star= new CelestialObject();
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.magnitude=magnitude;
    }

    public String toString(){
        DecimalFormat val= new DecimalFormat("0.000");
        return this.getName()+" is shines at the "+ val.format(this.getMagnitude())+" magnitude";
    }

    public int hashCode(){
        return (int)Math.round((this.getName().hashCode()+this.getX()*this.getMagnitude()+this.getY()*this.getMagnitude()+this.getZ()*this.getMagnitude())*KM_IN_ONE_AU);
    }
}
