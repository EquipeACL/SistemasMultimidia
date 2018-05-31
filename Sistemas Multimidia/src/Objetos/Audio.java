package Objetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Audio {
    
    private String formato;
    private int taxaBits;
    private int canais;
    private int samplingRate;
    private String encoder;

    public Audio(String formato, int taxaBits, int canais, int samplingRate, String encoder) {
        this.formato = formato;
        this.taxaBits = taxaBits;
        this.canais = canais;
        this.samplingRate = samplingRate;
        this.encoder = encoder;
    }
    
    public Audio(){
        
    }

    public String getEncoder() {
        return encoder;
    }

    public void setEncoder(String encoder) {
        this.encoder = encoder;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public int getTaxaBits() {
        return taxaBits;
    }

    public void setTaxaBits(int taxaBits) {
        this.taxaBits = taxaBits;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public int getSamplingRate() {
        return samplingRate;
    }

    public void setSamplingRate(int samplingRate) {
        this.samplingRate = samplingRate;
    }

}
