/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1C3;

/**
 *
 * @author ASUS
 */
public class Reptil extends Hewan {

    /**
     * @return the tipeKulit
     */
    protected String getTipeKulit() {
        return tipeKulit;
    }

    /**
     * @param tipeKulit the tipeKulit to set
     */
    protected void setTipeKulit(String tipeKulit) {
        this.tipeKulit = tipeKulit;
    }

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
    private String tipeKulit;
    private String pertahananDiri;
    
    
    public static void main(String[] args) {
        Reptil komodo = new Reptil();
        komodo.setBernafas("bisa Bernafas");
        komodo.setTumbuh("Tumbuh");
        komodo.setBerkembangBiak("Berkembang Biak");
        komodo.setJumlahMata(2);
        komodo.setJumlahKaki(4);
        komodo.setAlatPernapasan("Paru-Paru");
        komodo.setTipeKulit("Bersisik");
        komodo.setPertahananDiri("Gigitan Beracun serta Kamuflase");
        System.out.println("Komodo " + komodo.getBernafas() + ", " 
            + komodo.getTumbuh() + ", dan " + komodo.getBerkembangBiak() + ".");
        System.out.println("Komodo memiliki " + komodo.getJumlahMata()
            + " mata, juga kaki sebanyak " + komodo.getJumlahKaki()
            + " kaki. FYI Komodo bernapas dengan " + komodo.getAlatPernapasan()
            + " lhoo...");
        System.out.println("Komodo adalah hewan reptil yang kulitnya " 
            + komodo.getTipeKulit() + " dan pertahanan dirinya dengan " 
            + komodo.getPertahananDiri() + ".");
    }
}
