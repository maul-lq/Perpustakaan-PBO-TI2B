package Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private String namaAdmin;
    private Scanner scanner = new Scanner(System.in);

    // Simpan daftar admin
    private static ArrayList<Admin> daftarAdmin = new ArrayList<>();

    public Admin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getNamaAdmin() {
        return this.namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    // CREATE (Menambahkan admin baru)
    public static void tambahAdmin(String namaAdmin) {
        Admin adminBaru = new Admin(namaAdmin);
        daftarAdmin.add(adminBaru);
        System.out.println("Admin " + namaAdmin + " berhasil ditambahkan!");
    }

    // READ (Menampilkan semua admin)
    public static void tampilkanAdmin() {
        if (daftarAdmin.isEmpty()) {
            System.out.println("Belum ada admin yang terdaftar.");
            return;
        }
        System.out.println("Daftar Admin:");
        for (int i = 0; i < daftarAdmin.size(); i++) {
            System.out.println((i + 1) + ". " + daftarAdmin.get(i).getNamaAdmin());
        }
    }

    // UPDATE (Mengupdate nama admin berdasarkan index)
    public static void updateAdmin(int index, String namaBaru) {
        if (index >= 0 && index < daftarAdmin.size()) {
            daftarAdmin.get(index).setNamaAdmin(namaBaru);
            System.out.println("Admin berhasil diperbarui menjadi: " + namaBaru);
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    // DELETE (Menghapus admin berdasarkan index)
    public static void hapusAdmin(int index) {
        if (index >= 0 && index < daftarAdmin.size()) {
            System.out.println("Admin " + daftarAdmin.get(index).getNamaAdmin() + " telah dihapus.");
            daftarAdmin.remove(index);
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Tambah Admin");
            System.out.println("2. Tampilkan Admin");
            System.out.println("3. Update Admin");
            System.out.println("4. Hapus Admin");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama admin: ");
                    String nama = input.nextLine();
                    tambahAdmin(nama);
                    break;
                case 2:
                    tampilkanAdmin();
                    break;
                case 3:
                    tampilkanAdmin();
                    System.out.print("Pilih nomor admin yang ingin diupdate: ");
                    int indexUpdate = input.nextInt() - 1;
                    input.nextLine(); // Membuang newline
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = input.nextLine();
                    updateAdmin(indexUpdate, namaBaru);
                    break;
                case 4:
                    tampilkanAdmin();
                    System.out.print("Pilih nomor admin yang ingin dihapus: ");
                    int indexDelete = input.nextInt() - 1;
                    hapusAdmin(indexDelete);
                    break;
                case 5:
                    System.out.println("Keluar dari sistem...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        input.close();
    }
}
