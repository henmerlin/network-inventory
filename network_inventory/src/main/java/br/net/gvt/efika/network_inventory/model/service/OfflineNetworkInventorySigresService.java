/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.service;

import br.net.gvt.efika.customer.model.dto.GenericRequest;
import br.net.gvt.efika.network_inventory.model.dto.NetworkInventorySigresMetalicoDTO;
import br.net.gvt.efika.network_inventory.model.dto.OltDetailSigresFibraDTO;

/**
 *
 * @author G0042204
 */
public interface OfflineNetworkInventorySigresService {
    
    public NetworkInventorySigresMetalicoDTO getDslamDetail(GenericRequest request) throws Exception;
    
    public OltDetailSigresFibraDTO getOltDetail(GenericRequest request) throws Exception;
    
}
