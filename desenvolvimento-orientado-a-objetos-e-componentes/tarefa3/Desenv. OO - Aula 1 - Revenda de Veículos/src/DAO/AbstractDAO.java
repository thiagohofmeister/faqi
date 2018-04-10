package DAO;

import java.util.List;

/**
 *
 * @author Thiago Hofmeister
 */
public abstract class AbstractDAO<T> {
    
    public abstract List<T> buscarTodos();
    
    public abstract T buscarPorCodigo(int codigo);
    
    public abstract void deletarPorCodigo(int codigo);
    
    public abstract void cadastrar(T entidade);
}
