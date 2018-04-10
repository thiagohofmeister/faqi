/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.HomeView;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class HomeController extends Controller 
{
    private HomeView view;
    
    public HomeController() {
        this.view = new HomeView();
    }

    public void index()
    {
        int optionMenu = this.view.menuPrincipal();
        
        switch (optionMenu) {
            case 1:
                MarcaController marcaController = new MarcaController();
                marcaController.index();
                break;
            case 2:
                ModeloController modeloController = new ModeloController();
                modeloController.index();
                break;
            case 3:
                VeiculoController veiculoController = new VeiculoController();
                veiculoController.index();
            case 9:
                return;
        }
    }
}
