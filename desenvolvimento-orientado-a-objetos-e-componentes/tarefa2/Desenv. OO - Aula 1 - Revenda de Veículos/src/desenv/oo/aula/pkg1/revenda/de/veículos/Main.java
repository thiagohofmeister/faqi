/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenv.oo.aula.pkg1.revenda.de.veículos;

import Entidades.Elements.VeiculoTipoEnum;
import Entidades.Marca;
import Entidades.Modelo;
import Entidades.Veiculos.Carro;
import Entidades.Veiculos.Moto;
import Entidades.Veiculos.Veiculo;
import desenv.oo.aula.pkg1.revenda.de.veículos.controllers.GerenciaDeDados;
import desenv.oo.aula.pkg1.revenda.de.veículos.controllers.HomeController;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class Main {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeController home = new HomeController();
        home.index();
    }
}
