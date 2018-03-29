/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.dto;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class ClientesVizinhosResponseDTO {

    private List<EfikaCustomer> vizinhos;

    public ClientesVizinhosResponseDTO() {
    }

    public List<EfikaCustomer> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<EfikaCustomer> vizinhos) {
        this.vizinhos = vizinhos;
    }
}
