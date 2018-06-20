
package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Abstração classes relacionadas ao banco de dados.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public interface AbstractInterfaceDAO<E> {
    
    /**
     * Persiste uma entidade no banco de dados.
     * 
     * @param entity 
     * @return  
     */
    public int persist(E entity);
    
    /**
     * Busca um registro no banco pelo ID.
     * 
     * @param id
     * @return 
     */
    public E findById(Long id) throws SQLException;
    
    /**
     * Retorna todos os registros de uma tabela do banco.
     * 
     * @return 
     */
    public ArrayList<E> retrieveAll();
}
