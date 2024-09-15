package HandSon1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] KumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        int counter = 0;
        while (counter < KumpulanBuah.length) {
            System.out.println("Elemen ke " + (counter + 1) + "Adalah : " + KumpulanBuah[counter]);
            counter++;
        }
    }
}
