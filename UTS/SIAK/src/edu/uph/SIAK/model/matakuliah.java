package edu.uph.SIAK.model;

// Matakuliah
// - KodeMatakuliah : String
// - NamaMatakuliah : String
// - SkS : int
// +getSKS():int
// +getKodeMatakuliah() : String
// +getNamaMatakuliah() : String
public class matakuliah {
    
    String KodeMatakuliah;
    String NamaMatakuliah;
    int SKS;
    
    public matakuliah(String KodeMatakuliah, String NamaMatakuliah, int SKS) {
        this.KodeMatakuliah = KodeMatakuliah;
        this.NamaMatakuliah = NamaMatakuliah;
        this.SKS = SKS;
    }

    public matakuliah(String string) {
    }

    public int getSKS() {
        return this.SKS;
    }

    public String getKodeMatakuliah() {
        return this.KodeMatakuliah;
    }

    public String getNamaMatakuliah() {
        return this.NamaMatakuliah;
    }

    
}
