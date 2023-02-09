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

    public boolean equals(Star object){
        if (object==null)return false;
        if (object.getX()==this.getX() && object.getY()==this.getY() && object.getZ()==this.getZ() && object.name==this.name && object.getMagnitude()==this.getMagnitude()){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        DecimalFormat val= new DecimalFormat("0.000");
        return this.getName()+" shines at the "+ val.format(this.getMagnitude())+" magnitude";
    }

    public int hashCode(){
        if (this.getMagnitude()==0.0)
            return (int) super.hashCode()/2;
        else if (this.getMagnitude()<0.0)
            return (int) super.hashCode()-(int) (this.getMagnitude()*KM_IN_ONE_AU);
        else if (this.getMagnitude()>0.0){
            return (int) super.hashCode()+(int) (this.getMagnitude()*KM_IN_ONE_AU);
        }
        return (int) super.hashCode()+(int) (this.getMagnitude()*KM_IN_ONE_AU);
    }
}
