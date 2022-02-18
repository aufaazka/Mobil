package mobil.tugas.pewarisan;

public class Elf extends Mobil {

    private String merk = "Hino";
    String nama = "Elf";
    int jumlahPenumpang, jumlahRoda, maxKecepatan;
    Mobil elf = new Mobil();

    public void spesifikasi() {

        elf.setMesin(300);
    }

    public String getWarna(String warna) {
        return warna;
    }

    public String getMerk() {
        return merk;
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
        System.out.println("Elf menggunakan bahan bakar " + super.bbm);
        System.out.println("Elf berkapasitas " + jumlahPenumpang + "penumpang");
        System.out.println("Elf memiliki warna " + getWarna("silver"));
        System.out.println("Elf memiliki kecepatan maksimal " + maxKecepatan + "KM/JAM");
        System.out.println("Elf memiliki " + jumlahRoda + "Roda");

    }

}
