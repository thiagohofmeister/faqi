
package controller;

import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public abstract class Controller<T> {
    
    public abstract ArrayList<T> listar ();
    
    public abstract T buscar (String ra);
}
