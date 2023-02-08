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
        new CelestialObject();
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
        return this.getName()+" shines at the "+ val.format(this.getMagnitude())+" magnitude";
    }

    public int hashCode(){
        return (int)(this.getName().hashCode()+this.getX()*KM_IN_ONE_AU+this.getY()*KM_IN_ONE_AU+this.getZ()*KM_IN_ONE_AU+this.magnitude*KM_IN_ONE_AU);
    }
}
