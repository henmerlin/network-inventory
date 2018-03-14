/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.network_inventory.model.dto.ClientesVizinhosRequestDTO;
import br.net.gvt.efika.network_inventory.model.dto.ClientesVizinhosResponseDTO;

/**
 *
 * @author G0042204
 */
public interface NetworkInventoryService {

    public ClientesVizinhosResponseDTO consultarVizinhos(ClientesVizinhosRequestDTO request) throws Exception;

    public InventarioRede consultar(EfikaCustomer cust) throws Exception;

}
