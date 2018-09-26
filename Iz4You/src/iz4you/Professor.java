
package iz4you;

/**
 *
 * @author Alex
 */
public class Professor extends Usuario {
    private int matricula;

    public Professor(){
        
    }
    
    public Professor(int CPF, int telefone, String nome, String email, String senha) {
        super(CPF, telefone, nome, email, senha);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
