public class Location {
private String Place;
private int coordinateX;
private int coordinateY;
private boolean gas;


    public Location(String Place, int coordinateX, int coordinateY, boolean gas)
{
    this.Place=Place;
    this.coordinateX=coordinateX;
    this.coordinateY=coordinateY;
    this.gas=gas;
}

    public String getPlace() {
        return Place;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public boolean isGas() {
        return gas;
    }

}
