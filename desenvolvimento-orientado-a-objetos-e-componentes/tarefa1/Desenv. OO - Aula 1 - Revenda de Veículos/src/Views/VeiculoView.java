/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Entidades.Elements.VeiculoTipoEnum;
import Entidades.Marca;
import Entidades.Modelo;
import Entidades.Veiculos.Carro;
import Entidades.Veiculos.Moto;
import Entidades.Veiculos.Veiculo;
import desenv.oo.aula.pkg1.revenda.de.veículos.controllers.MarcaController;
import desenv.oo.aula.pkg1.revenda.de.veículos.controllers.ModeloController;
import desenv.oo.aula.pkg1.revenda.de.veículos.models.MarcaModel;
import desenv.oo.aula.pkg1.revenda.de.veículos.models.ModeloModel;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class VeiculoView extends View<Veiculo> {
    public int menuPrincipal() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar Veiculos");
        System.out.println("2 - Cadastrar Veiculos");
        System.out.println("3 - Deletar Veiculos");
        System.out.println("9 - Voltar \n");
        
        int option = this.reader.nextInt();
        
        return option;
    }

    public int deletarVeiculos() {
        System.out.println("Digite o código do veiculo que deseja apagar:");
        
        return this.reader.nextInt();
    }

    public Veiculo cadastrarVeiculo() {
        System.out.println("Digite o código:");
        int codigo = this.reader.nextInt();
        
        System.out.println("Digite o Ano:");
        int ano = this.reader.nextInt();
        
        System.out.println("Digite o Preço:");
        float preco = this.reader.nextFloat();
        
        System.out.println("O veiculo está disponível:");
        System.out.println("1 - Sim");
        System.out.println("0 - Não");
        boolean disponivel;
        if (this.reader.nextInt() == 1) {
            disponivel = true;
        } else {
            disponivel = false;
        }
        
        MarcaController marcaController = new MarcaController();
        MarcaModel marcaModel = new MarcaModel();
        
        System.out.println("Digite o código de uma marca:");
        marcaController.listarMarcas();
        Marca marca = marcaModel.buscarMarcaPorCodigo(this.reader.nextInt());
        
        ModeloController modeloController = new ModeloController();
        ModeloModel modeloModel = new ModeloModel();
        
        System.out.println("Digite o código do modelo:");
        modeloController.listarModelos();
        Modelo modelo = modeloModel.buscarModeloPorCodigo(
                this.reader.nextInt()
        );
        
        System.out.println("Escolha o tipo de veículo:");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        
        int tipo;
        do {
            tipo = this.reader.nextInt();
        } while (tipo != 1 && tipo != 2);
        
        
        if (tipo == 1) {
            Carro veiculo = new Carro();
            veiculo.setTipo(VeiculoTipoEnum.CARRO);

            veiculo.setCodigo(codigo)
                    .setAno(ano)
                    .setPreco(preco)
                    .setDisponivel(disponivel)
                    .setMarca(marca)
                    .setModelo(modelo);
            
            System.out.println("Digite o número de portas:");
            veiculo.setNumeroPortas(this.reader.nextInt());
            
            System.out.println("Digite os opcionais:");
            veiculo.setOpcionais(this.reader.nextLine());
            
            return veiculo;
        } else {
            Moto veiculo = new Moto();
            veiculo.setTipo(VeiculoTipoEnum.MOTO);
            
            veiculo.setCodigo(codigo)
                    .setAno(ano)
                    .setPreco(preco)
                    .setDisponivel(disponivel)
                    .setMarca(marca)
                    .setModelo(modelo);
            
            System.out.println("Digite o número de cilindradas:");
            veiculo.setCilindradas(this.reader.nextInt());
            
            System.out.println("Digite o estilo:");
            veiculo.setEstilo(this.reader.nextLine());
            
            return veiculo;
        }
    }
}
