/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.service;

import br.net.gvt.efika.customer.model.dto.CustomerRequest;
import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.network_inventory.model.dto.ClientesVizinhosRequestDTO;
import br.net.gvt.efika.network_inventory.model.dto.ClientesVizinhosResponseDTO;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;

public class OfflineNetworkInventoryServiceImpl implements OfflineNetworkInventoryService {

    @Override
    public ClientesVizinhosResponseDTO consultarVizinhos(ClientesVizinhosRequestDTO request) throws Exception {
        return (ClientesVizinhosResponseDTO) new FactoryHttpDAOAbstract<>(ClientesVizinhosResponseDTO.class)
                .createWithoutProxy()
                .post(Urls.NETWORK_INVENTORY_VIZINHOS.getUrl(), request);
    }

    @Override
    public InventarioRede consultar(CustomerRequest req) throws Exception {
        return (InventarioRede) new FactoryHttpDAOAbstract<>(InventarioRede.class).createWithoutProxy().post(Urls.NETWORK_INVENTORY.getUrl(), req);
    }

}
