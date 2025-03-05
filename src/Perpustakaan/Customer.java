package Perpustakaan;
import java.util.Scanner;

public class Customer {
    private String userName;
    private String password;
    private String peminjamanBuku;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        this.userName = scanner.nextLine();

        System.out.print("Masukkan Password: ");
        this.password = scanner.nextLine();

        System.out.print("Masukkan Buku yang ingin dipinjam: ");
        this.peminjamanBuku = scanner.nextLine();

        System.out.println(this.userName + " telah meminjam buku: " + this.peminjamanBuku);
    }

    public void updateData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan buku yang ingin diupdate: ");
        this.peminjamanBuku = scanner.nextLine();
        System.out.println("Buku peminjaman telah diperbarui menjadi: " + this.peminjamanBuku);
    }
}
