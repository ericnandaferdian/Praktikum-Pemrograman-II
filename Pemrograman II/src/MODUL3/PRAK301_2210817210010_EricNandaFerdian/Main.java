package MODUL3.PRAK301_2210817210010_EricNandaFerdian;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dd = new Dadu();
        int masukkan = input.nextInt();

        dd.setInput(masukkan);
        dd.acakNilai();
    }

}
