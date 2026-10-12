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

            if (juara >= 1 && juara <= 3) {
                if (jmlDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurangDokumen = 4 -jmlDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak lengkap");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara1/2/3).");
            }

            } else if (jenisKegiatan.equalsIgnoreCase("PKM")){
                System.out.print("Jumlah dokumen: ");
                int jmlDokumen = input.nextInt();
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
                int statusPkm = input.nextInt();

                if (statusPkm == 1) {
                    if (jmlDokumen == 4) {
                        System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                    } else {
                        int kurangDokumen = 4- jmlDokumen;
                        System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan");
                    }
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }

            } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
                System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
            } else {
                System.out.println("Status: Jenis kegiatan tidak valid.");
            }

    }
}