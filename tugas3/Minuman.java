package tugas3;

public class Minuman extends MenuItem {
    private String jenisMinuman;

    public Minuman(String nama, double harga, String Kategori, String jenisMinuman) {
        super(nama, harga, Kategori);
        this.jenisMinuman = jenisMinuman;
    }
    
    @Override
    public void tampilMenu(){
        System.out.println(getNama() + " (" + jenisMinuman + ") - " + getHarga());
    }
}
