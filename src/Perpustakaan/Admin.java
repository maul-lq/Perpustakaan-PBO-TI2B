package Perpustakaan;

import java.util.Scanner;

public class Admin {
    private String namaAdmin;
    private Scanner scanner = new Scanner(System.in);
    public String pembuatanDataPeminjaman;

    public Admin(String namaAdmin, String pembuatanDataPeminjaman) {
        this.namaAdmin = namaAdmin;
        this.pembuatanDataPeminjaman = pembuatanDataPeminjaman;
    }

    public String getNamaAdmin() {
        return this.namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public void updateDataAdmin() {
        String in;
        in = this.scanner.nextLine();
        this.setNamaAdmin(in);
        // this.updateData();
        System.out.println("Data Admin telah diupdate: " + this.getNamaAdmin());
        System.out.println("Data Admin telah diupdate: " + this.getNamaAdmin());
    }
}