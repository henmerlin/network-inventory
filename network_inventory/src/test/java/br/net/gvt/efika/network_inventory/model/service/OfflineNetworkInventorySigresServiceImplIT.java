/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.network_inventory.model.service;

import br.net.gvt.efika.customer.model.dto.GenericRequest;
import br.net.gvt.efika.network_inventory.model.dto.NetworkInventorySigresMetalicoDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class OfflineNetworkInventorySigresServiceImplIT {

    public OfflineNetworkInventorySigresServiceImplIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDslamDetail method, of class
     * NetworkInventorySigresServiceImpl.
     */
    @Test
    public void testGetDslamDetail() {
        try {
            System.out.println("getDslamDetail");
            GenericRequest request = new GenericRequest();
            request.setExecutor("JUnit");
            request.setParameter("BR_SPO_AC-HUA_DSL_07_00_1");
            OfflineNetworkInventorySigresServiceImpl instance = new OfflineNetworkInventorySigresServiceImpl();
            NetworkInventorySigresMetalicoDTO result = instance.getDslamDetail(request);
            assertEquals(result.getIpDslam(), "10.18.217.110");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
     * Test of getOltDetail method, of class NetworkInventorySigresServiceImpl.
     */
    @Test
    public void testGetOltDetail() throws Exception {
//        System.out.println("getOltDetail");
//        StringParameterRequest request = null;
//        NetworkInventorySigresServiceImpl instance = new NetworkInventorySigresServiceImpl();
//        OltDetailSigresFibraDTO expResult = null;
//        OltDetailSigresFibraDTO result = instance.getOltDetail(request);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
