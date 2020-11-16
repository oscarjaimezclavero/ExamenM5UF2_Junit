/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m05_uf02_examen_final;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar_Jaimez_Clavero
 */
public class AvaluadorTest {
    
    Estudiant estudiante1 = new Estudiant("Oscar",2.0,2.0,2.0);
    Estudiant estudiante2 = new Estudiant("Pep",7.0,7.0,7.0);
    Estudiant estudiante3 = new Estudiant("Javi",3.0,4.0,5.0);
    Estudiant estudiante4 = new Estudiant("Paco",1.0,1.0,1.0);
    Estudiant estudiante5 = new Estudiant("Maria",6.0,7.0,5.0);
        
        
        Estudiant[] alumno = {estudiante1, estudiante2, estudiante3, estudiante4, estudiante5};
    
    private Avaluador Avaluador;
    
    public AvaluadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        Avaluador = new Avaluador();
               
    }
    
    @After
    public void tearDown() {
        alumno = null;
        Avaluador = null;
    }


    @Test
    public void testMitjanaSiSupera() throws Exception {
        
        assertEquals(2.0,Avaluador.mitjana(estudiante1),0.1);
        assertEquals(7.0,Avaluador.mitjana(estudiante2),0.1);
        assertEquals(4.0,Avaluador.mitjana(estudiante3),0.1);
        assertEquals(1.0,Avaluador.mitjana(estudiante4),0.1);
        assertEquals(6.0,Avaluador.mitjana(estudiante5),0.1);

    }


    @Test
    public void testMitjana() throws Exception {
        assertEquals(2.0,Avaluador.mitjana(estudiante1),0.1);
        assertEquals(7.0,Avaluador.mitjana(estudiante2),0.1);
        assertEquals(4.0,Avaluador.mitjana(estudiante3),0.1);
        assertEquals(1.0,Avaluador.mitjana(estudiante4),0.1);
        assertEquals(6.0,Avaluador.mitjana(estudiante5),0.1);
    }


    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        
        assertEquals(estudiante2 , Avaluador.millorEstudiantPerNotaMitjana(alumno));
        assertEquals(estudiante2 , Avaluador.millorEstudiantPerNotaMitjana(alumno));
        assertEquals(estudiante2 , Avaluador.millorEstudiantPerNotaMitjana(alumno));
        assertEquals(estudiante2 , Avaluador.millorEstudiantPerNotaMitjana(alumno));
        assertEquals(estudiante2 , Avaluador.millorEstudiantPerNotaMitjana(alumno));

    }
        
}

