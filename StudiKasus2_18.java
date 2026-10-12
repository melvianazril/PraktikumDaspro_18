import java.util.Scanner;

public class StudiKasus2_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKROMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("jumlah dokumen: ");
            int jmlDokumen = input.nextInt();
            System.out.print("Peringkat juara: ");
            int juara = input.nextInt();
            }
    }
}