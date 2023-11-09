public class Tugas1 {
    public static void main(String[] args) {
        // Misalnya, kita parkir selama 8 jam
        int jamParkir = 8;


        double biayaParkir = biayaParkir(jamParkir);

        System.out.println("Biaya parkir yang harus dibayar: $" + biayaParkir);
    }

    public static double biayaParkir(int jamParkir) {
        double biayaAwal = 1.0;
        double biayaPerJam = 0.5;
        double biayaMax = 15.0;

        if (jamParkir <= 5) {
            return biayaAwal;
        } else if (jamParkir <= 24) {
            return biayaAwal + (biayaPerJam * (jamParkir - 5));
        } else {
            return biayaMax + (biayaPerJam * (jamParkir - 24));
        }
    }
}
