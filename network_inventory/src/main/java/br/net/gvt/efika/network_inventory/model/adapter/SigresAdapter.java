/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.adapter;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.network_inventory.model.dto.OltDetailSigresFibraDTO;

/**
 *
 * @author G0042204
 */
public class SigresAdapter {

    public static InventarioRede adapt(OltDetailSigresFibraDTO oltDetail) {
        InventarioRede i = new InventarioRede();
        i.setIpDslam(oltDetail.getIpOlt());
        i.setVendorDslam(oltDetail.getVendor());
        i.setModeloDslam(oltDetail.getModel());
        return i;
    }

}
