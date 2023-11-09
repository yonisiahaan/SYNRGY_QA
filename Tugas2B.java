// Class Vehicle
class Vehicle {
    int roda;

    void maju() {
        System.out.println("Kendaraan bergerak maju dengan cepat.");
    }

    void belok() {
        System.out.println("Kendaraan berbelok ke kanan.");
    }
}

// Class Car inherits from Vehicle
class Car extends Vehicle {
    int jumlahBan;
    int kapasitasTangki;
    String pindahTransmisi;  // tambahan atribut pindah transmisi

    void isiBahanBakar() {
        System.out.println("Mobil mengisi bahan bakar.");
    }

    void ubahTransmisi(String posisiTransmisi) {
        this.pindahTransmisi = posisiTransmisi;
        System.out.println("Posisi transmisi mobil diubah ke: " + posisiTransmisi);
    }
}

// Sample Child Classes (Honda Jazz, Toyota Fortuner, Suzuki Katana)
class HondaJazz extends Car {
    String model = "Honda Jazz";
    boolean hybrid;

    void putarMusik() {
        System.out.println("Honda Jazz sedang memutar musik.");
    }

//    @Override
//    void belok() {
//        System.out.println("Honda Jazz berbelok kekanan.");
//    }
}

class ToyotaFortuner extends Car {
    String model = "Toyota Fortuner";
    boolean offRoadCapable;

    void aktifkan4WD() {
        System.out.println("Toyota Fortuner mengaktifkan 4WD.");
    }

//    @Override
//    void maju() {
//        System.out.println("Toyota Fortuner bergerak maju dengan cepat.");
//    }
}

class SuzukiKatana extends Car {
    String model = "Suzuki Katana";
    boolean sporty;

    void tambahKecepatan() {
        System.out.println("Suzuki Katana menambah kecepatan.");
    }

    @Override
    void isiBahanBakar() {
        System.out.println("Suzuki Katana mengisi bahan bakar performa tinggi.");
    }
}

// Main Class
public class Tugas2B {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing kelas
        HondaJazz jazz = new HondaJazz();
        ToyotaFortuner fortuner = new ToyotaFortuner();
        SuzukiKatana katana = new SuzukiKatana();

        // Menggunakan metode dan atribut dari masing-masing objek
        jazz.maju();
        jazz.belok();
        jazz.putarMusik();

        fortuner.maju();
        fortuner.belok();
        fortuner.aktifkan4WD();

        katana.maju();
        katana.belok();
        katana.tambahKecepatan();

        // Menambahkan informasi transmisi
        jazz.ubahTransmisi("D");
        System.out.println("Posisi transmisi Honda Jazz: " + jazz.pindahTransmisi);

        fortuner.ubahTransmisi("4");
        System.out.println("Posisi transmisi Toyota Fortuner: " + fortuner.pindahTransmisi);

        katana.ubahTransmisi("S");
        System.out.println("Posisi transmisi Suzuki Katana: " + katana.pindahTransmisi);
    }
}
