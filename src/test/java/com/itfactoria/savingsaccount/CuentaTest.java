/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.savingsaccount;

import com.itfactoria.savingsaccount.Cuenta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jnino
 */
public class CuentaTest {
    
    public CuentaTest() {
        }
    
    
    @org.junit.Test
    public void testCrearCuenta() {
        System.out.println("crear cuenta");
        /*double cantidad = 0.0;
        Cuenta instance = null;
        instance.retirar(cantidad);*/
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Cuenta c = new Cuenta("Chikis", -500);
        assertEquals(0, c.getCantidad(),0);
        
        Cuenta c1 = new Cuenta("Negro", 500);
        assertEquals(500, c1.getCantidad(),0);
        
        c1.ingresar(13000);
        assertEquals(13500, c1.getCantidad(),0);
        
        c1.retirar(12000);
        assertEquals(1500, c1.getCantidad(),0);
        
        c1.retirar(3000);
        assertEquals(1500, c1.getCantidad(),0);
        
    }
    
    
    
}
