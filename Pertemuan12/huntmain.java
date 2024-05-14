package Pertemuan12;

public class huntmain {
    public static void main(String[] args) {
        scavengerhunt hunt = new scavengerhunt();
        hunt.addNode("Apa Ibukota Indonesia", "Jakarta");
        hunt.addNode("Tahun Berapa Indonesia Merdeka", "1945");
        hunt.addNode("Siapa Presiden Indonesia Sekarang", "Joko Widodo");
        hunt.jawab();
    }
}
