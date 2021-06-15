package edu.uph.SIAK.model;

public class matakuliah {
   
    String nama;

    public matakuliah() {
    }

    public matakuliah(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    @Override
    public String toString() {
        return nama;
    }

}
