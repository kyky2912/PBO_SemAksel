package edu.uph.SIAK.model;


// NilaiStudi
// - Matakuliah : Matakuliah
// - NilaiHuruf : Char ("A,B,C,D,E")
// +getMatakuliah() : Matakuliah
// +getNilaiAngka() : Double

import edu.uph.SIAK.model.matakuliah;

public class nilaistudi {
    matakuliah mataKuliah;
    char nilaiHuruf;
    char nilaiAngka;

    public nilaistudi(matakuliah mataKuliah, char nilaiHuruf, char nilaiAngka) {
        this.mataKuliah = mataKuliah;
        this.nilaiHuruf = nilaiHuruf;
        this.nilaiAngka = nilaiAngka;
    }

    public matakuliah getMatakuliah() {
        return this.mataKuliah;
    }

    public double getNilaiHuruf() {
        return this.nilaiHuruf;
    }

    public double getNilaiAngka() {
        if (this.nilaiAngka == 'A') return 4;
        if (this.nilaiAngka == 'B') return 3;
        if (this.nilaiAngka == 'C') return 2;
        if (this.nilaiAngka == 'D') return 1;
        return 0;
    }

}
