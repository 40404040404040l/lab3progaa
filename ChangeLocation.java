public class ChangeLocation implements Locating {

    public void goTo(ELocations place) {
        if (place.getFloor() > 1) {
            System.out.println(" go up to " + place + ".");
        }
        else if (place.getFloor() < 1){
            System.out.println(" go down to " + place + ".");
        }
        else {
            System.out.println(" stay on " + place + ".");
        }
    }
}
