/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1C2;

/**
 *
 * @author ASUS
 */
public class Tumbuhan extends MakhlukHidup {

    /**
     * @return the tipeAkar
     */
    protected String getTipeAkar() {
        return tipeAkar;
    }

    /**
     * @param tipeAkar the tipeAkar to set
     */
    protected void setTipeAkar(String tipeAkar) {
        this.tipeAkar = tipeAkar;
    }

    /**
     * @return the tipeBatang
     */
    protected String getTipeBatang() {
        return tipeBatang;
    }

    /**
     * @param tipeBatang the tipeBatang to set
     */
    protected void setTipeBatang(String tipeBatang) {
        this.tipeBatang = tipeBatang;
    }

    /**
     * @return the jumlahBiji
     */
    protected int getJumlahBiji() {
        return jumlahBiji;
    }

    /**
     * @param jumlahBiji the jumlahBiji to set
     */
    protected void setJumlahBiji(int jumlahBiji) {
        this.jumlahBiji = jumlahBiji;
    }
    private String tipeAkar;
    private String tipeBatang;
    private int jumlahBiji;
    
}
