package HandSon1;

public class DoWhile {
    public static void main(String[] args) {
        String[] KumpulanBuah  = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        int counter = 0;
        do {
            System.out.println("Elemen ke " + (counter + 1) + "Adalah : " + KumpulanBuah[counter]);
            counter++;

        } while (counter < KumpulanBuah.length);
    }
}
