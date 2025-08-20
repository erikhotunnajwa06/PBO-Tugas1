/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1C2;

/**
 *
 * @author ASUS
 */
public class Dikotil extends Tumbuhan {

    /**
     * @return the tipeDaun
     */
    protected String getTipeDaun() {
        return tipeDaun;
    }

    /**
     * @param tipeDaun the tipeDaun to set
     */
    protected void setTipeDaun(String tipeDaun) {
        this.tipeDaun = tipeDaun;
    }

    /**
     * @return the Reproduksi
     */
    protected String getReproduksi() {
        return Reproduksi;
    }

    /**
     * @param Reproduksi the Reproduksi to set
     */
    protected void setReproduksi(String Reproduksi) {
        this.Reproduksi = Reproduksi;
    }
    private String tipeDaun;
    private String Reproduksi;
    
    
    public static void main(String[] args) {
        Dikotil mangga = new Dikotil();
        mangga.setTumbuh("bisa Tumbuh");
        mangga.setBerkembangBiak("dapat Berkembang Biak.");
        mangga.setTipeAkar("Tunggang");
        mangga.setTipeBatang("Bercabang");
        mangga.setJumlahBiji(2);
        mangga.setTipeDaun("Menyirip");
        mangga.setReproduksi("Generatif.");
        System.out.println("Mangga " + mangga.getTumbuh() + " dan " 
            + mangga.getBerkembangBiak());
        System.out.println("Mangga memiliki akar " + mangga.getTipeAkar()
            + ", juga batang yang " + mangga.getTipeBatang()
            + ", dan memiliki biji " + mangga.getJumlahBiji()
            + " lhoo...");
        System.out.println("Pohon Mangga berdaun " 
            + mangga.getTipeDaun() + " dan reproduksinya secara " 
            + mangga.getReproduksi());
    }
}
