package br.com.openpdv.modelo.anexo.iv;

import br.com.openpdv.modelo.anexo.Cabecalho;
import java.util.Date;

/**
 * Classe que representa o modelo E1 do anexo IV.
 *
 * @author Pedro H. Lira
 */
public class E1 extends Cabecalho {

    private String fabricacao;
    private char mfAdicional;
    private String tipoEcf;
    private String marcaEcf;
    private String modeloEcf;
    private Date data;
    
    public E1() {
        padrao = "E1";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    public String getMarcaEcf() {
        return marcaEcf;
    }

    public void setMarcaEcf(String marcaEcf) {
        this.marcaEcf = marcaEcf;
    }

    public char getMfAdicional() {
        return mfAdicional;
    }

    public void setMfAdicional(char mfAdicional) {
        this.mfAdicional = mfAdicional;
    }

    public String getModeloEcf() {
        return modeloEcf;
    }

    public void setModeloEcf(String modeloEcf) {
        this.modeloEcf = modeloEcf;
    }

    public String getTipoEcf() {
        return tipoEcf;
    }

    public void setTipoEcf(String tipoEcf) {
        this.tipoEcf = tipoEcf;
    }
}