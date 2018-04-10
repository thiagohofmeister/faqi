
package desenv.oo.aula.pkg1.revenda.de.veículos.controllers;

import Entidades.Elements.VeiculoTipoEnum;
import Entidades.Marca;
import Entidades.Modelo;
import Entidades.Veiculos.Carro;
import Entidades.Veiculos.Moto;
import Entidades.Veiculos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class GerenciaDeDados {
    
    private static GerenciaDeDados instance;
    
    public ArrayList<Veiculo> veiculos = new ArrayList<>();
    
    public ArrayList<Marca> marcas = new ArrayList<>();
    
    public ArrayList<Modelo> modelos = new ArrayList<>();

    private GerenciaDeDados() {
        startUp();
    }
    
    public static GerenciaDeDados getInstance () {
        
        if (instance == null) {
            return new GerenciaDeDados();
        }
        
        return instance;
    }
    
    /**
     * Método responsável por inserir alguns dados pré-definidos
     */
    private void startUp()
    {
        marcas.add(new Marca(1111, "Chevrolet"));
        marcas.add(new Marca(2222, "Volkswagem"));
        marcas.add(new Marca(3333, "Ford"));
        marcas.add(new Marca(4444, "Harley"));
        
        modelos.add(new Modelo(111111, "Opala SS"));
        modelos.add(new Modelo(111112, "Camaro"));
        modelos.add(new Modelo(222221, "Golf"));
        modelos.add(new Modelo(222222, "Gol"));
        modelos.add(new Modelo(333331, "Fusin"));
        modelos.add(new Modelo(333332, "Edge"));
        modelos.add(new Modelo(444441, "Sportster"));
        modelos.add(new Modelo(444442, "Fat Boy FL"));
        modelos.add(new Modelo(444443, "V-ROD Musc"));

        veiculos.add(new Carro(
                marcas.get(0),
                modelos.get(0),
                VeiculoTipoEnum.CARRO,
                15000,
                1980,
                true,
                111111111,
                2,
                "Pneus banda branca"
        ));
        
        veiculos.add(new Carro(
                marcas.get(2),
                modelos.get(4),
                VeiculoTipoEnum.CARRO,
                60500,
                2015,
                true,
                333332311,
                4,
                "Teto solar"
        ));
        
        veiculos.add(new Moto(
                marcas.get(3),
                modelos.get(6),
                VeiculoTipoEnum.MOTO,
                50000,
                2014,
                true,
                444441141,
                1200,
                "Harley Turbo"
        ));
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public ArrayList<Modelo> getModelos() {
        return modelos;
    }
}
