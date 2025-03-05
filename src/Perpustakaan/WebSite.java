package Perpustakaan;
import java.util.Scanner;

public class WebSite {
    private String judulBuku;
    private String idAkun;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Judul Buku di Website: ");
        this.judulBuku = scanner.nextLine();

        System.out.print("Masukkan ID Akun: ");
        this.idAkun = scanner.nextLine();

        System.out.println("Data buku \"" + this.judulBuku + "\" telah dimasukkan ke dalam sistem.");
    }

    public void updateData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku yang ingin diperbarui di Website: ");
        this.judulBuku = scanner.nextLine();
        System.out.println("Data buku \"" + this.judulBuku + "\" telah diperbarui.");
    }
}
