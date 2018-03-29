/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.service;

/**
 *
 * @author G0042204
 */
public class FactoryOfflineNetworkInventoryService {

    public static OfflineNetworkInventoryService newNetworkInventoryService() {
        return new OfflineNetworkInventoryServiceImpl();
    }

    public static OfflineNetworkInventorySigresService newNetworkInventorySigresService() {
        return new OfflineNetworkInventorySigresServiceImpl();
    }

}
