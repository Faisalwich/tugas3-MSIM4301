package tugas3;
import java.util.Scanner;

public class ManajemenRestoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Pesanan pesanan = new Pesanan();

        while (true) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Tambah Item Menu");
            System.out.println("2. Tampilkan Menu");
            System.out.println("3. Buat Pesanan");
            System.out.println("4. Tampilkan Struk");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama item: ");
                    String nama = scanner.nextLine();
                    System.out.print("Harga item: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Kategori item (Makanan/Minuman/Diskon): ");
                    String kategori = scanner.nextLine();

                    if (kategori.equalsIgnoreCase("Makanan")) {
                        System.out.print("Jenis makanan: ");
                        String jenisMakanan = scanner.nextLine();
                        menu.tambahItem(new Makanan(nama, harga, kategori, jenisMakanan));
                    } else if (kategori.equalsIgnoreCase("Minuman")) {
                        System.out.print("Jenis minuman: ");
                        String jenisMinuman = scanner.nextLine();
                        menu.tambahItem(new Minuman(nama, harga, kategori, jenisMinuman));
                    } else if (kategori.equalsIgnoreCase("Diskon")) {
                        System.out.print("Persentase diskon: ");
                        double diskon = scanner.nextDouble();
                        scanner.nextLine();
                        menu.tambahItem(new Diskon(nama, harga, kategori, diskon));
                    }
                    break;

                case 2:
                    menu.tampilkanMenu();
                    break;

                case 3:
                    menu.tampilkanMenu();
                    System.out.print("Masukkan nomor menu: ");
                    int nomor = scanner.nextInt();
                    try {
                        pesanan.tambahPesanan(menu.getItem(nomor - 1));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    pesanan.tampilkanStruk();
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
