
package iz4you;
/**
 *
 * @author Alex
 */
public abstract class Solucao {
    int codSolucao;
    String descricao;
    
    public Solucao (){
        
    }
    public int getCodSolucao() {
        return codSolucao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodSolucao(int codSolucao) {
        this.codSolucao = codSolucao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Solucao(int codSolucao, String descricao) {
        this.codSolucao = codSolucao;
        this.descricao = descricao;
    }
    
    public void lancarSolucao(){
        
    }
    public void alterSolucao(){
        
    }
    public void deletarSolucao(){
       
   }
}
