/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.dto;

import java.io.Serializable;

public class NetworkInventorySigresMetalicoDTO implements Serializable {

    private String nrc;

    private String nomeDslam;

    private String modeloDslam;

    private String ipDslam;

    private String nomeRedeDslam;

    private String terminal;

    private String fabricanteDslam;

    private Integer slot;

    private Integer rin;

    private Integer cVlan;

    public NetworkInventorySigresMetalicoDTO() {
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getNomeDslam() {
        return nomeDslam;
    }

    public void setNomeDslam(String nomeDslam) {
        this.nomeDslam = nomeDslam;
    }

    public String getNomeRedeDslam() {
        return nomeRedeDslam;
    }

    public void setNomeRedeDslam(String nomeRedeDslam) {
        this.nomeRedeDslam = nomeRedeDslam;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getFabricanteDslam() {
        return fabricanteDslam;
    }

    public void setFabricanteDslam(String fabricanteDslam) {
        this.fabricanteDslam = fabricanteDslam;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getRin() {
        return rin;
    }

    public void setRin(Integer rin) {
        this.rin = rin;
    }

    public Integer getcVlan() {
        return cVlan;
    }

    public void setcVlan(Integer cVlan) {
        this.cVlan = cVlan;
    }

    public String getModeloDslam() {
        return modeloDslam;
    }

    public void setModeloDslam(String modeloDslam) {
        this.modeloDslam = modeloDslam;
    }

    public String getIpDslam() {
        return ipDslam;
    }

    public void setIpDslam(String ipDslam) {
        this.ipDslam = ipDslam;
    }

}
