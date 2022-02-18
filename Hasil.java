package mobil.tugas.pewarisan;

public class Hasil {

    public static void main(String[] args) {
        Elf elf = new Elf();
        elf.getKapasitas("Hino", 15, 4, 140);
        elf.cetak();

        System.out.println("=======================================================");

        Bus bus = new Bus();
        bus.getKapasitas("mercedes", 50, 8, 100);
        bus.cetak();

    }

}
