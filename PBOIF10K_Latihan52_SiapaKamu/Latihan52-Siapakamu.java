/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Siapa Kamu
 */

 public class Latihan52SiapaKamu {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119918");
        mahasiswa.setNama("Andreas Suryadi");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO2");
        
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}