/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1C3;

/**
 *
 * @author ASUS
 */
public class Hewan extends MakhlukHidup {

    /**
     * @return the jumlahMata
     */
    protected int getJumlahMata() {
        return jumlahMata;
    }

    /**
     * @param jumlahMata the jumlahMata to set
     */
    protected void setJumlahMata(int jumlahMata) {
        this.jumlahMata = jumlahMata;
    }

    /**
     * @return the jumlahKaki
     */
    protected int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    protected void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the alatPernapasan
     */
    protected String getAlatPernapasan() {
        return alatPernapasan;
    }

    /**
     * @param alatPernapasan the alatPernapasan to set
     */
    protected void setAlatPernapasan(String alatPernapasan) {
        this.alatPernapasan = alatPernapasan;
    }
    private int jumlahMata;
    private int jumlahKaki;
    private String alatPernapasan;
}
