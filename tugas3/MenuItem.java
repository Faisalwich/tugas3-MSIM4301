package tugas3;
public abstract class MenuItem {

    private String nama;
    private double harga;
    private String Kategori;

    public MenuItem(String nama, double harga, String Kategori) {
        this.nama = nama;
        this.harga = harga;
        this.Kategori = Kategori;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public String getKategori(){
        return Kategori;
    }

    public abstract void tampilMenu();
}