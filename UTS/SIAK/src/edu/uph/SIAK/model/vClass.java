package edu.uph.SIAK.model;

public class vClass {
    String nama;

    public vClass() {
    }

    public vClass(String nama) {
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
