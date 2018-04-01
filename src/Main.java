import builder.Kue;
import builder.KueBuilder;

public class Main {

    public static void main(String[] args) {
        KueBuilder builder = new KueBuilder();

        /**
         * menampilkan semua kue basah
         */
        Kue kueBasah = builder.kueBasah();
        System.out.println("Kue basah :");
        kueBasah.tampilkanKue();
        System.out.println("Total harga :" + kueBasah.getHarga());

        /**
         * menampilkan semua kue kering
         */
        Kue kueKering = builder.kueKering();
        System.out.println("Kue kering :");
        kueKering.tampilkanKue();
        System.out.println("Total harga :" + kueKering.getHarga());
    }

}
