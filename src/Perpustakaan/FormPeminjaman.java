package Perpustakaan;

import java.util.Scanner;

public class FormPeminjaman {
    private String jadwalPeminjamanBuku;
    private String pengajuanPeminjamanBuku;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jadwal Peminjaman Buku: ");
        this.jadwalPeminjamanBuku = scanner.nextLine();

        System.out.print("Masukkan Status Pengajuan Peminjaman Buku: ");
        this.pengajuanPeminjamanBuku = scanner.nextLine();

        System.out.println("Pengajuan peminjaman buku dengan jadwal: " + this.jadwalPeminjamanBuku + " telah diajukan.");
    }
}
