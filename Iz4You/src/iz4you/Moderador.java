
package iz4you;

/**
 *
 * @author Alex
 */
public class Moderador extends Aluno{
    int codMod;
 
    public Moderador(int codMod, int CPF, int telefone, String nome, String email, String senha, int cpd) {
        super(CPF, telefone, nome, email, senha, cpd);
        this.codMod = codMod;
    }
    

    public Moderador (){
        
    }
            
    public int getCodMod() {
        return codMod;
    }

    public void setCodMod(int codMod) {
        this.codMod = codMod;
    }
    
    public void avaliarDenuncia(){
                    
    }
    public void avaliarSolucao(){
        
    }
}
