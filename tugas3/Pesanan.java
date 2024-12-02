package tugas3;

import java.util.ArrayList;

public class Pesanan {
    private ArrayList<MenuItem> daftarPesanan;

    public Pesanan() {
        daftarPesanan = new ArrayList<MenuItem>();
    }

    public void tambahPesanan(MenuItem item){
        daftarPesanan.add(item);
        System.out.println(item.getNama() + " berhasil ditambahkan ke dalam pesanan");
    }

    public void tampilkanStruk(){
        if (daftarPesanan.isEmpty()){
            System.out.println("Belum ada pesanan");
            return;
        }

        System.out.println("\n=== Struk Pesanan ===");
        double total = 0;
        for (MenuItem item : daftarPesanan) {
            if (item instanceof Diskon) {
                double hargaDiskon = ((Diskon) item).getHargaSetelahDiskon();
                System.out.println(item.getNama() + " - Rp " + hargaDiskon);
                total += hargaDiskon;
            } else {
                System.out.println(item.getNama() + " - Rp " + item.getHarga());
                total += item.getHarga();
            }
        }
        System.out.println("Total: Rp " + total);
    }
}
