/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1C1;

/**
 *
 * @author ASUS
 */
public class Mamalia extends Hewan {

    /**
     * @return the pertahananDiri
     */
    protected String getPertahananDiri() {
        return pertahananDiri;
    }

    /**
     * @param pertahananDiri the pertahananDiri to set
     */
    protected void setPertahananDiri(String pertahananDiri) {
        this.pertahananDiri = pertahananDiri;
    }

    /**
     * @return the tipeMakanan
     */
    protected String getTipeMakanan() {
        return tipeMakanan;
    }

    /**
     * @param tipeMakanan the tipeMakanan to set
     */
    protected void setTipeMakanan(String tipeMakanan) {
        this.tipeMakanan = tipeMakanan;
    }
    private String pertahananDiri;
    private String tipeMakanan;
    
    
    public static void main(String[] args) {
        Mamalia kucing = new Mamalia();
        kucing.setBernafas("bisa Bernafas");
        kucing.setTumbuh("Tumbuh");
        kucing.setBerkembangBiak("dapat Berkembang Biak");
        kucing.setJumlahMata(2);
        kucing.setJumlahKaki(4);
        kucing.setAlatPernapasan("Paru-Paru");
        kucing.setTipeMakanan("Karnivora");
        kucing.setPertahananDiri("Gigi Taring serta Cakar");
        System.out.println("Kucing " + kucing.getBernafas() + ", " 
            + kucing.getTumbuh() + ", serta " + kucing.getBerkembangBiak() + ".");
        System.out.println("Kucing memiliki " + kucing.getJumlahMata() 
            + " mata, juga kaki sebanyak " + kucing.getJumlahKaki() 
            + " kaki. FYI Kucing bernapas dengan " + kucing.getAlatPernapasan() 
            + " lhoo...");
        System.out.println("Kucing adalah hewan mamalia " 
            + kucing.getTipeMakanan() + " dan pertahanan dirinya dengan " 
            + kucing.getPertahananDiri() + ".");
    }
}
