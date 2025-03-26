import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Update Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Tambah Customer");
            System.out.println("6. Tampilkan Customer");
            System.out.println("7. Update Customer");
            System.out.println("8. Hapus Customer");
            System.out.println("9. Tambah Admin");
            System.out.println("10. Tampilkan Admin");
            System.out.println("11. Update Admin");
            System.out.println("12. Hapus Admin");
            System.out.println("13. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> Buku.tambahBuku(scanner);
                case 2 -> Buku.tampilkanBuku();
                case 3 -> Buku.updateBuku(scanner);
                case 4 -> Buku.hapusBuku(scanner);
                case 5 -> Customer.tambahCustomer(scanner);
                case 6 -> Customer.tampilkanCustomer();
                case 7 -> Customer.updateCustomer(scanner);
                case 8 -> Customer.hapusCustomer(scanner);
                case 9 -> Admin.tambahAdmin(scanner);
                case 10 -> Admin.tampilkanAdmin();
                case 11 -> Admin.updateAdmin(scanner);
                case 12 -> Admin.hapusAdmin(scanner);
                case 13 -> { scanner.close(); return; }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}