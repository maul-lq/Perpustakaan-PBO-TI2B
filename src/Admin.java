import java.util.ArrayList;
import java.util.Scanner;

class Admin {
    private String idAdmin;
    private String namaAdmin;
    private static ArrayList<Admin> daftarAdmin = new ArrayList<>();

    public Admin(String idAdmin, String namaAdmin) {
        this.idAdmin = idAdmin;
        this.namaAdmin = namaAdmin;
    }

    public static void tambahAdmin(Scanner scanner) {
        System.out.print("Masukkan ID admin: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan nama admin: ");
        String nama = scanner.nextLine();
        Admin.daftarAdmin.add(new Admin(id, nama));
        System.out.println("Admin berhasil ditambahkan.");
    }

    public static void tampilkanAdmin() {
        if (Admin.daftarAdmin.isEmpty()) {
            System.out.println("Tidak ada admin dalam daftar.");
        } else {
            for (Admin admin : Admin.daftarAdmin) {
                System.out.println(admin);
            }
        }
    }

    public static void updateAdmin(Scanner scanner) {
        System.out.print("Masukkan ID admin yang ingin diperbarui: ");
        String id = scanner.nextLine();
        for (Admin admin : Admin.daftarAdmin) {
            if (admin.idAdmin.equals(id)) {
                System.out.print("Masukkan nama baru: ");
                admin.namaAdmin = scanner.nextLine();
                System.out.println("Admin berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Admin tidak ditemukan.");
    }

    public static void hapusAdmin(Scanner scanner) {
        System.out.print("Masukkan ID admin yang ingin dihapus: ");
        String id = scanner.nextLine();
        Admin.daftarAdmin.removeIf(admin -> admin.idAdmin.equals(id));
        System.out.println("Admin berhasil dihapus.");
    }

    @Override
    public String toString() {
        return "ID: " + this.idAdmin + ", Nama: " + this.namaAdmin;
    }
}