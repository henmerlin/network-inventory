/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.service;

import br.net.gvt.efika.customer.model.dto.GenericRequest;
import br.net.gvt.efika.network_inventory.model.dto.NetworkInventorySigresMetalicoDTO;
import br.net.gvt.efika.network_inventory.model.dto.OltDetailSigresFibraDTO;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;

public class OfflineNetworkInventorySigresServiceImpl implements OfflineNetworkInventorySigresService {

    @Override
    public NetworkInventorySigresMetalicoDTO getDslamDetail(GenericRequest request) throws Exception {
        return (NetworkInventorySigresMetalicoDTO) new FactoryHttpDAOAbstract<>(NetworkInventorySigresMetalicoDTO.class)
                .createWithoutProxy()
                .post(Urls.NETWORK_INVENTORY_SIGRES_DSLAM_DETAIL.getUrl(), request);
    }

    @Override
    public OltDetailSigresFibraDTO getOltDetail(GenericRequest request) throws Exception {
        return (OltDetailSigresFibraDTO) new FactoryHttpDAOAbstract<>(OltDetailSigresFibraDTO.class)
                .createWithoutProxy()
                .post(Urls.NETWORK_INVENTORY_SIGRES_OLT_DETAIL.getUrl(), request);
    }

}
