package mobil.tugas.pewarisan;

public class Bus extends Elf {

    private String merk = "Mercedes";
    String nama = "Bus", warna="putih";
    int jumlahPenumpang = 50, jumlahRoda = 8, maxKecepatan = 100;
    Mobil bus = new Mobil();

    public void spesifikasi() {
        bus.setMesin(300);
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public String getWarna(String warna) {
        return warna;
    }

    public void getKapasitas(String merk, int jumlahPenumpang, int jumlahRoda, int maxKecepatan) {
        this.merk = merk;
        this.jumlahPenumpang = jumlahPenumpang;
        this.jumlahRoda = jumlahRoda;
        this.maxKecepatan = maxKecepatan;

    }

    public void cetak() {
        System.out.println("Nama kendaraan " + nama);
        System.out.println("Merk kendaraan " + merk);
        System.out.println("Jenis kendaraan " + super.jenisKendaraan);
        System.out.println("Bus menggunakan bahan bakar " + super.bbm);
        System.out.println("Bus berkapasitas " + jumlahPenumpang + "penumpang");
        System.out.println("Bus memiliki warna " + warna);
        System.out.println("Bus memiliki kecepatan maksimal " + maxKecepatan + "KM/JAM");
        System.out.println("Bus memiliki " + jumlahRoda + "Roda");

    }

}
