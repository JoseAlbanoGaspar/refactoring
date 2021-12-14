package pt.up.fe.ldts.example6;

public class Location {
    public String latitude;
    public String longitude;
    public String name;

    public Location(String locationLatitude, String locationLongitude, String locationName){
        this.latitude = locationLatitude;
        this.longitude = locationLongitude;
        this.name = locationName;
    }
    public String getLatitude(){
        return latitude;
    }
    public String getLongitude(){
        return longitude;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return " in location " + this.latitude + "," + this.longitude + " (" + this.name + ")";
    }

}
