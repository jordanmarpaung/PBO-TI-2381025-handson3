package HandSon1;

public class ForEach {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array dengan benar
        String[] kumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};

        // Menggunakan loop for-each untuk mencetak setiap elemen array
        for (String buah : kumpulanBuah) {
            System.out.println(buah);
        }
    }
}
