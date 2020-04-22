/**
 * This class defines a couple of game terrains.
 *
 * @author Filip Kin
 * @version 2020-02-26
 */

public class Terrain {
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize() {
        return "Land has dimensions " + length + " X " + width;
    }
}

class Mountain extends Terrain {
    private int numberOfMountains;

    public Mountain(int l, int w, int numberOfMountains) {
        super(l, w);
        this.numberOfMountains = numberOfMountains;
    }

    public int getNumberOfMountains() {
        return numberOfMountains;
    }
}

class WinterMountain extends Mountain {
    private double temperature;

    public WinterMountain(int l, int w, int numberOfMountains, double temperature) {
        super(l, w, numberOfMountains);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}

class Forest extends Terrain {
    private int numberOfTrees;

    public Forest(int l, int w, int numberOfTrees) {
        super(l, w);
        this.numberOfTrees = numberOfTrees;
    }

    public int getNumberOfTrees() {
        return numberOfTrees;
    }
}

class Swamp extends Forest {
    private boolean shreksSwamp;

    public Swamp(int l, int w, int numberOfTrees, boolean shreksSwamp) {
        super(l, w, numberOfTrees);
        this.shreksSwamp = shreksSwamp;
    }

    public boolean getShreksSwamp() {
        return shreksSwamp;
    }
}

class Island extends Terrain {
    private int distanceFromMainland;

    public Island(int l, int w, int distanceFromMainland) {
        super(l, w);
        this.distanceFromMainland = distanceFromMainland;
    }

    public int getDistanceFromMainland() {
        return distanceFromMainland;
    }
}
