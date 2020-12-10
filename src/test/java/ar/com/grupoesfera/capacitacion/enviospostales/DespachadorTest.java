/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ar.com.grupoesfera.capacitacion.enviospostales;

import org.junit.Test;
import static org.junit.Assert.*;


public class DespachadorTest {

    @Test
    public void despachoMenor5PaquetesTest() {
        Despachador despachador = new Despachador(4, 26);
        despachador.calculadorcostos(despachador.numeropaquetes, despachador.numeroenvio);
        double costo = despachador.obtenercosto();
        double costoesperado = 50;
        assertEquals(costoesperado, costo, 0.0001);
    }

    @Test
    public void despachomenor10paquetesTest() {
        Despachador despachador = new Despachador(8, 26);
        despachador.calculadorcostos(despachador.numeropaquetes, despachador.numeroenvio);
        double costo = despachador.obtenercosto();
        double costoesperado = 80;
        assertEquals(costoesperado, costo, 0.0001);
    }

    @Test
    public void despachomayor10paquetesTest() {
        Despachador despachador = new Despachador(11, 26);
        despachador.calculadorcostos(despachador.numeropaquetes, despachador.numeroenvio);
        double costo = despachador.obtenercosto();
        double costoesperado = 95;
        assertEquals(costoesperado, costo, 0.0001);
    }

    @Test
    public void despachomayor10paquetesmascostoadministrativoTest() {
        Despachador despachador = new Despachador(1, 5);
        int envio = 0;
        while (envio < 11) {
            despachador.calculadorcostos(despachador.numeropaquetes, despachador.numeroenvio);
            envio++;
        }
        double costo = despachador.obtenercosto();
        double costoesperado = 50 * 1.1;
        assertEquals(costoesperado, costo, 0.0001);
    }
}

