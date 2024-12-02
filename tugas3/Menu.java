package tugas3;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> daftarMenu;

    public Menu() {
        this.daftarMenu = new ArrayList<>();
        // Menambahkan menu default
        tambahMenuDefault();
    }

    // Metode untuk menambahkan menu default
    private void tambahMenuDefault() {
        daftarMenu.add(new Makanan("Nasi Goreng", 20000, "Makanan", "Goreng"));
        daftarMenu.add(new Makanan("Mie Goreng", 18000, "Makanan", "Goreng"));
        daftarMenu.add(new Minuman("Teh Manis", 5000, "Minuman", "Dingin"));
        daftarMenu.add(new Minuman("Kopi Hitam", 10000, "Minuman", "Panas"));
        daftarMenu.add(new Diskon("Diskon 10%", 0, "Diskon", 10));
    }

    public void tambahItem(MenuItem item) {
        daftarMenu.add(item);
    }

    public void tampilkanMenu() {
        if (daftarMenu.isEmpty()) {
            System.out.println("Menu saat ini kosong.");
            return;
        }

        System.out.println("\n=== Daftar Menu ===");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMenu.get(i).tampilMenu();
        }
    }

    public MenuItem getItem(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= daftarMenu.size()) {
            throw new IndexOutOfBoundsException("Item menu tidak ditemukan.");
        }
        return daftarMenu.get(index);
    }
}
