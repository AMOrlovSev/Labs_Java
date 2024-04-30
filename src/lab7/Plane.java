package lab7;

public class Plane {

    private String transportName;
    private Boolean isFlying;

    Wing wing = new Wing();

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public Boolean getFlying() {
        return isFlying;
    }

    public void setFlying(Boolean flying) {
        isFlying = flying;
    }

    public Plane() {
    }

    public Plane(String transportName, Boolean isFlying) {
        setTransportName(transportName);
        setFlying(isFlying);
    }

    public void displayInformation() {
        System.out.println("transportName: " + getTransportName());
        System.out.println("isFlying: " + getFlying());
        System.out.println("wingWeight: " + wing.getWingWeight());
    }

    class Wing {
        private int wingWeight;

        public int getWingWeight() {
            return wingWeight;
        }

        public void setWingWeight(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        public Wing(int wingWeight) {
            setWingWeight(wingWeight);
        }

        public Wing() {
        }
    }
}
