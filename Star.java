import java.text.DecimalFormat;
import java.util.Objects;

public class Star extends CelestialObject{
    private double magnitude=0.0;
    private int mass;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

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

    public Star(String name, double x, double y, double z, double magnitude,int mass) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.magnitude=magnitude;
        this.mass=mass;
    }

    public boolean equals(final Star object){
        if (object==null)return false;
        if ((this instanceof Star) && (object instanceof Star)){
            return object.getX()==this.getX() && object.getY()==this.getY() && object.getZ()==this.getZ() && object.getName()==this.getName() && object.getMagnitude()==this.getMagnitude();
        }
        return false;
        // if (object.getX()==this.getX() && object.getY()==this.getY() && object.getZ()==this.getZ() && object.name==this.name && object.getMagnitude()==this.getMagnitude()){
        //     return true;
        // }else{
        //     return false;
        // }
    }

    public String toString(){
        DecimalFormat val= new DecimalFormat("0.000");
        return this.getName()+" shines at the "+ val.format(this.getMagnitude())+" magnitude";
    }

    @Override 
    public int hashCode(){
        return (int)(Objects.hash(this.getName(), this.getX(), this.getY(), this.getZ(), this.getMagnitude(),KM_IN_ONE_AU));
    }
}
