package iz4you;

/**
 *
 * @author Alex
 */
public class Avalicao {
  int avaliacao;
  String observacao,comentario;

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Avalicao(int avaliacao, String observacao, String comentario) {
        this.avaliacao = avaliacao;
        this.observacao = observacao;
        this.comentario = comentario;
    }
  
  
  public void comentarAvalicao(){
      
  }
}
