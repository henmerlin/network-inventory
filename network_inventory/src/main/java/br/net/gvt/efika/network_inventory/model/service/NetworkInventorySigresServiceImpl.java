/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.service;

import br.net.gvt.efika.network_inventory.model.dto.NetworkInventorySigresMetalicoDTO;
import br.net.gvt.efika.network_inventory.model.dto.OltDetailSigresFibraDTO;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;
import br.net.gvt.efika.util.dao.http.request.StringParameterRequest;

public class NetworkInventorySigresServiceImpl implements NetworkInventorySigresService {

    @Override
    public NetworkInventorySigresMetalicoDTO getDslamDetail(StringParameterRequest request) throws Exception {
        return (NetworkInventorySigresMetalicoDTO) new FactoryHttpDAOAbstract<>(NetworkInventorySigresMetalicoDTO.class)
                .createWithoutProxy()
                .post(Urls.NETWORK_INVENTORY_SIGRES_DSLAM_DETAIL.getUrl(), request);
    }

    @Override
    public OltDetailSigresFibraDTO getOltDetail(StringParameterRequest request) throws Exception {
        return (OltDetailSigresFibraDTO) new FactoryHttpDAOAbstract<>(OltDetailSigresFibraDTO.class)
                .createWithoutProxy()
                .post(Urls.NETWORK_INVENTORY_SIGRES_OLT_DETAIL.getUrl(), request);
    }

}
