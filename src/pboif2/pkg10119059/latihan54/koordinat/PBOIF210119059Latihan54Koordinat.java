/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Koordinat
 */
package pboif2.pkg10119059.latihan54.koordinat;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan54Koordinat {

    public static void main(String[] args) {
        WarnaKoordinat koor = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : " +koor.getNamaWarna());
        System.out.println("Kordinat Sumbu x : " +koor.getX() + ", y : " +koor.getY());
    }
    
}
