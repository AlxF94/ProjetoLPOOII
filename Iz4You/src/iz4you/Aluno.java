
package iz4you;
/**
 *
 * @author Alex
 */
public class Aluno extends Usuario{
    protected int cpd;
    private int pontuacao;
    
    public Aluno(int CPF, int telefone, String nome, String email, String senha, int cpd) {
        super(CPF, telefone, nome, email, senha);
        this.cpd= cpd;
    }

    public int getCpd() {
        return cpd;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setCpd(int cpd) {
        this.cpd = cpd;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    public void contarPontuacao (int potuacao){
        pontuacao+= pontuacao;
    }
    public Aluno(){
    
    }

}
