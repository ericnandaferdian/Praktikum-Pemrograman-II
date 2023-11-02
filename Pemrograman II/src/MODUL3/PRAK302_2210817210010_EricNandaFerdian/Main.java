package MODUL3.PRAK302_2210817210010_EricNandaFerdian;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

        for (int i = 1; i <= n; i++) {
            String nama = sc.nextLine();
            String jenisKepemimpinan = sc.nextLine();
            String namaPemimpin = sc.nextLine();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = sc.nextInt();
                bulanKemerdekaan = sc.nextInt();
                tahunKemerdekaan = sc.nextInt();
                sc.nextLine();
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }

        for (Negara negara : negaraList) {
            String nama = negara.getNama();
            String jenisKepemimpinan = negara.getJenisKepemimpinan();
            String namaPemimpin = negara.getNamaPemimpin();
            int tanggalKemerdekaan = negara.getTanggalKemerdekaan();
            int bulanKemerdekaan = negara.getBulanKemerdekaan();
            int tahunKemerdekaan = negara.getTahunKemerdekaan();

            if (jenisKepemimpinan.equals("monarki")) {
                jenisKepemimpinan = "Raja";

                System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin + "\n");
            } else if (jenisKepemimpinan.equals("presiden")) {
                jenisKepemimpinan = "Presiden";
                String namaBulan = bulanMap.get(bulanKemerdekaan);
                System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin);
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + namaBulan + " " + tahunKemerdekaan + "\n");
            } else {
                jenisKepemimpinan = "Perdana Menteri";
                String namaBulan = bulanMap.get(bulanKemerdekaan);
                System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin);
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + namaBulan + " " + tahunKemerdekaan + "\n");

            }
        }
    }

}
