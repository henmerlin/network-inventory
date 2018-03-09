/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.dto;

import java.io.Serializable;

/**
 *
 * @author G0042204
 */
public class OltDetailSigresFibraDTO implements Serializable {

    private String nomeOlt;

    private String localidade;

    private String siglaAt;

    private String ipOlt;

    private String vendor;

    private String model;

    public OltDetailSigresFibraDTO() {
    }

    public String getNomeOlt() {
        return nomeOlt;
    }

    public void setNomeOlt(String nomeOlt) {
        this.nomeOlt = nomeOlt;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getSiglaAt() {
        return siglaAt;
    }

    public void setSiglaAt(String siglaAt) {
        this.siglaAt = siglaAt;
    }

    public String getIpOlt() {
        return ipOlt;
    }

    public void setIpOlt(String ipOlt) {
        this.ipOlt = ipOlt;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
