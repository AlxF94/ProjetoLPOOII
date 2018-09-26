
package iz4you;

/**
 *
 * @author Alex
 */
public class Usuario {
    private int CPF,telefone;
    private String nome,email,senha;
    public Usuario(){
        
    }
    public int getCPF() {
        return CPF;
    }
    

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone (int telefone){
        this.telefone= telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }

      public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

       public Usuario(int CPF, int telefone, String nome, String email, String senha) {
        this.CPF = CPF;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public Usuario (int CPF, String senha, String email ){
        this.CPF = CPF;
        this.senha = senha;
        this.email = email;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    
    
    
}
