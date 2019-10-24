/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan61.bangunruang;

/**
 *
 * @author 
 * Nama                 : Rayan
 * Kelas                : PBO ULG
 * NIM                  : 10115557
 * Deskripsi Program    : Program ini menghitung bangun ruang
 */
public class PBOULG10115557Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();

        b.setR(7);
        System.out.println("Volume Bola : " + Math.ceil(b.hitungVolume()));

        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + Math.ceil(t.hitungVolume()));

        k.setR(14);
        k.setH(9);
        System.out.println("Volume Kerucut : " + Math.ceil(k.hitungVolume()));
    }
}
