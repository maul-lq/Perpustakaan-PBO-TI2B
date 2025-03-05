package Perpustakaan;
import java.util.Scanner;

public class Admin {
    private String pembuatanDataPeminjaman;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Data Peminjaman Baru: ");
        this.pembuatanDataPeminjaman = scanner.nextLine();

        System.out.println("Admin telah memasukkan data peminjaman: " + this.pembuatanDataPeminjaman);
    }

    public void updateData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Data Peminjaman yang ingin diperbarui: ");
        this.pembuatanDataPeminjaman = scanner.nextLine();
        System.out.println("Admin telah memperbarui data peminjaman: " + this.pembuatanDataPeminjaman);
    }
}
