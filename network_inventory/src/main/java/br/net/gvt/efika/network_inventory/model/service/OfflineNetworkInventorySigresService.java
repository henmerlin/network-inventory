/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.service;

import br.net.gvt.efika.network_inventory.model.dto.NetworkInventorySigresMetalicoDTO;
import br.net.gvt.efika.network_inventory.model.dto.OltDetailSigresFibraDTO;
import br.net.gvt.efika.util.dao.http.request.StringParameterRequest;

/**
 *
 * @author G0042204
 */
public interface OfflineNetworkInventorySigresService {
    
    public NetworkInventorySigresMetalicoDTO getDslamDetail(StringParameterRequest request) throws Exception;
    
    public OltDetailSigresFibraDTO getOltDetail(StringParameterRequest request) throws Exception;
    
}
