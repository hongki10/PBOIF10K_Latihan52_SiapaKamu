/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Siapa Kamu
 */

public class Dosen extends Manusia {
    private String nip, mataKuliah;
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMataKuliah() {
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa() {
        System.out.println("Saya " + this.getNama() + " umur " + this.getUmur() 
                + " tahun sedang mengajar matakuliah " + this.getMataKuliah());
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
