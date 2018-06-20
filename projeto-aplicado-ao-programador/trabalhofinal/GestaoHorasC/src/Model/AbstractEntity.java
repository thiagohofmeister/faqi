
package Model;

/**
 * Abstração das modelagens de dados.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public abstract class AbstractEntity<E> {
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
