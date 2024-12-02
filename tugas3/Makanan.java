package tugas3;

public class Makanan extends MenuItem {
    private String jenisMakanan;

    public Makanan(String nama, double harga, String Kategori, String jenisMakanan) {
        super(nama, harga, Kategori);
        this.jenisMakanan = jenisMakanan;
    }

    @Override
    public void tampilMenu(){
        System.out.println(getNama() + " (" + jenisMakanan + ") - Rp " + getHarga());
    }
    
}
