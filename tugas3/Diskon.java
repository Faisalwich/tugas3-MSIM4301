package tugas3;

public class Diskon extends MenuItem {
    private double diskon;

    public Diskon(String nama, double harga, String Kategori, double diskon) {
        super(nama, harga, Kategori);
        this.diskon = diskon;
    }

    public double getHargaSetelahDiskon(){
        return getHarga() * (1 - diskon / 100);
    }

    @Override
    public void tampilMenu(){
        System.out.println(getNama() + " - Diskon " + diskon + "% (Harga Awal: Rp " + getHarga() + ")");
    }
}
