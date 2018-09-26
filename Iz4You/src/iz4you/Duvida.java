
package iz4you;
/**
 *
 * @author Alex
 */
public  class Duvida extends Usuario {
    
    int codDuvida;
    String areaDirecionada,descricao;
    
    public Duvida (){   
        
    }

    public Duvida(int codDuvida, String areaDirecionada, String descricao, int CPF, int telefone, String nome, String email, String senha) {
        super(CPF, telefone, nome, email, senha);
        this.codDuvida = codDuvida;
        this.areaDirecionada = areaDirecionada;
        this.descricao = descricao;
    }
    
    
    public int getCodDuvida() {
        return codDuvida;
    }

    public String getAreaDirecionada() {
        return areaDirecionada;
    }

    public String getDescricao (){
        return descricao;
    }
    public void setCodDuvida(int codDuvida) {
        this.codDuvida = codDuvida;
    }

    public void setAreaDirecionada(String areaDirecionada) {
        this.areaDirecionada = areaDirecionada;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
       public void deletarDuvida(){
        
    }
       public void criarDuvida(){
           
       }
       public void alterarDuvida(){
           
       }
       public void procurarDuvida(){
           
       }
      public void gerarPontuacao(){
       
   }  
}
