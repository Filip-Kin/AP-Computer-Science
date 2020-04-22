/**
 * This class tests the Terrain class.
 *
 * @author Filip Kin
 * @version 2020-02-26
 */

public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain land = new Terrain(140, 240);
        System.out.println("Land has dimensions "+land.getTerrainSize());

        Forest forest = new Forest(400, 400, 180);
        System.out.println("Forest has dimensions "+forest.getTerrainSize()+" and has "+forest.getNumberOfTrees()+" trees");

        Mountain mountain = new Mountain(600, 200, 12);
        System.out.println("Mountain has dimensions "+mountain.getTerrainSize()+" and has "+mountain.getNumberOfMountains()+" mountains");

        // You know when you're programming and you're using the same word over and over again it starts to look weird
        // I'm seeing Mount-ain not Mountain
        WinterMountain winterMountain = new WinterMountain(500, 500, 30, 12.34);
        System.out.println("Winter mountain has dimensions "+winterMountain.getTerrainSize()+" and has "+winterMountain.getNumberOfMountains()+" mountains and a temperature of "+winterMountain.getTemperature()+" degrees fahrenheit");

        Swamp swamp = new Swamp(1920, 1080, 75, true);
        System.out.println("Swamp has dimensions "+swamp.getTerrainSize()+" and has "+swamp.getNumberOfTrees()+" trees and "+(swamp.getShreksSwamp()?"is":"is not")+" Shrek's swamp");

        Island island = new Island(3840, 2160, 1000);
        System.out.println("Island has dimensions "+island.getTerrainSize()+" and is "+island.getDistanceFromMainland()+"m away from mainland");
    }
}
