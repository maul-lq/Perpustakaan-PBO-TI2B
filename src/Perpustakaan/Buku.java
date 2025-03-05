package Perpustakaan;

import java.util.Scanner;

public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String penulis;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kode Buku: ");
        this.kodeBuku = scanner.nextLine();

        System.out.print("Masukkan Judul Buku: ");
        this.judulBuku = scanner.nextLine();

        System.out.print("Masukkan Nama Penulis: ");
        this.penulis = scanner.nextLine();

        System.out.println("Buku telah ditambahkan: " + this.judulBuku + " oleh " + this.penulis);
    }

    public void updateData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku yang ingin diupdate: ");
        this.judulBuku = scanner.nextLine();
        System.out.println("Judul buku telah diperbarui menjadi: " + this.judulBuku);
    }

    public void dilakukanPeminjaman() {
        System.out.println("Buku \"" + this.judulBuku + "\" sedang dipinjam.");
    }

    public void dibaca() {
        System.out.println("Buku \"" + this.judulBuku + "\" sedang dibaca.");
    }
}
