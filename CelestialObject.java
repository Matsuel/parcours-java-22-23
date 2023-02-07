public class CelestialObject {
    public double x,y,z = 0.0;
    public String name;

    public CelestialObject() {
        this.name = "Soleil";
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
