import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    private String idCustomer;
    private String nama;
    private String email;
    private static ArrayList<Customer> daftarCustomer = new ArrayList<>();

    public Customer(String idCustomer, String nama, String email) {
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.email = email;
    }

    public static void tambahCustomer(Scanner scanner) {
        System.out.print("Masukkan ID customer: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan nama customer: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan email: ");
        String email = scanner.nextLine();
        daftarCustomer.add(new Customer(id, nama, email));
        System.out.println("Customer berhasil ditambahkan.");
    }

    public static void tampilkanCustomer() {
        if (daftarCustomer.isEmpty()) {
            System.out.println("Tidak ada customer dalam daftar.");
        } else {
            for (Customer customer : daftarCustomer) {
                System.out.println(customer);
            }
        }
    }

    public static void updateCustomer(Scanner scanner) {
        System.out.print("Masukkan ID customer yang ingin diperbarui: ");
        String id = scanner.nextLine();
        for (Customer customer : daftarCustomer) {
            if (customer.idCustomer.equals(id)) {
                System.out.print("Masukkan nama baru: ");
                customer.nama = scanner.nextLine();
                System.out.print("Masukkan email baru: ");
                customer.email = scanner.nextLine();
                System.out.println("Customer berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Customer tidak ditemukan.");
    }

    public static void hapusCustomer(Scanner scanner) {
        System.out.print("Masukkan ID customer yang ingin dihapus: ");
        String id = scanner.nextLine();
        daftarCustomer.removeIf(customer -> customer.idCustomer.equals(id));
        System.out.println("Customer berhasil dihapus.");
    }

    @Override
    public String toString() {
        return "ID: " + idCustomer + ", Nama: " + nama + ", Email: " + email;
    }
}