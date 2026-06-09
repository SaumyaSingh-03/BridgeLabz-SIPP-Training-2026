package programmingelements;

public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;

        double volumeKm =
                (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        double volumeMiles =
                volumeKm / Math.pow(1.6, 3);

        System.out.println("Volume in km cube = " +
                volumeKm);
        System.out.println("Volume in miles cube = " +
                volumeMiles);
    }
}
