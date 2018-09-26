
package iz4you;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Alex
 */
public class Iz4You {

    public static void main(String[] args) {
      
        ArrayList <String> al  = new ArrayList(); 
        ArrayList <String> ald  = new ArrayList();
        Scanner leia = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();
        Duvida d = new Duvida();
        Moderador m = new Moderador();
        int opcao;
        int cod = 0;
    do {
        
            JOptionPane.showInputDialog("|----------------Iz4You------------------|\n"+
                                        "|              1 - Cadastrar             |\n"+                                                     
                                        "|              2 - Lançar Duvida         |\n"+
                                        "|              3 - Procura Duvida        |\n"+
                                        "|              4 - Deletar Duvida        |\n"+
                                        "|              5 - Excluir Conta         |\n"+
                                        "|              6 - Sair                            |\n"+
                                        "|              Informe a opção:          |\n"); 
            opcao = leia.nextInt();
            switch( opcao ) {
                 
                case 1:
                   
                    JOptionPane.showInputDialog("Informe se você é Aluno(1), Professor (2) ou Moderador(3)");
                    int op = leia.nextInt();
                    if (op==1){
                        JOptionPane.showInputDialog("Informe seu nome:");
                        String nome = leia.nextLine();
                        a.setNome(nome);
                        String ad = nome;
                        JOptionPane.showInputDialog("Informe seu email:");
                        String email = leia.nextLine();
                        a.setEmail(email);
                        ad = ad + email;
                        JOptionPane.showInputDialog("Informe seu cpd:");
                        int cpd = leia.nextInt();
                        a.setCpd(cpd);
                        ad = ad + cpd;
                        JOptionPane.showInputDialog("Informe seu telefone:");
                        int tel = leia.nextInt();
                        a.setTelefone(tel);
                        ad = ad + tel;
                        JOptionPane.showInputDialog("Informe sua senha:");
                        String senha = leia.nextLine();
                        a.setSenha(senha);
                        ad = ad + senha;
                        al.add(ad);
                    }
                    else if (op==2){
                        JOptionPane.showInputDialog("Informe seu nome:");
                        String nome = leia.nextLine();
                        p.setNome(nome);
                        String ad = nome;
                        JOptionPane.showInputDialog("Informe seu email:");
                        String email = leia.nextLine();
                        p.setEmail(email);
                        ad = ad + email;
                        JOptionPane.showInputDialog("Informe a sua Matricula:");
                        int cpd = leia.nextInt();
                        ad = ad + cpd;
                        p.setMatricula(cpd);
                        JOptionPane.showInputDialog("Informe seu telefone:");
                        int tel = leia.nextInt();
                        ad = ad + tel;
                        p.setTelefone(tel);
                        JOptionPane.showInputDialog("Informe sua senha:");
                        String senha = leia.nextLine();
                        p.setSenha(senha);
                        ad = ad + senha;
                        al.add(ad);
                    }
                    else if (op==3){
                        JOptionPane.showInputDialog("Informe seu nome:");
                        String nome = leia.nextLine();
                        m.setNome(nome);
                        String ad = nome;
                        JOptionPane.showInputDialog("Informe seu email:");
                        String email = leia.nextLine();
                        m.setEmail(email);
                        ad = ad + email;
                        JOptionPane.showInputDialog("Informe seu codigo de Moderador:");
                        int cpd = leia.nextInt();
                        m.setCodMod(cpd);
                        ad = ad + cpd;
                        JOptionPane.showInputDialog("Informe seu telefone:");
                        int tel = leia.nextInt();
                        m.setTelefone(tel);
                        ad = ad + tel;
                        JOptionPane.showInputDialog("Informe sua senha:");
                        String senha = leia.nextLine();
                        m.setSenha(senha);
                        ad = ad + senha;
                        al.add(ad);
                    }
                    else if((op!=1) && (op!=2) && (op!=3)){
                        JOptionPane.showInputDialog("Opção Invalida!");
                        JOptionPane.showInputDialog("Você será redirecionado ao Menu Inicial!");
                    }
                    break;
                    
                case 2:
                    cod = cod + 1;
                    JOptionPane.showInputDialog("Informe seu Nome de Usuario:");
                    String nome = leia.nextLine();
                    d.setNome(nome);
                    JOptionPane.showInputDialog("Informe a area que você quer direcionar a duvida:");
                    String area = leia.nextLine();
                    d.setAreaDirecionada(area);
                    JOptionPane.showInputDialog("Descreva sua Duvida:");
                    String desc = leia.nextLine();
                    d.setDescricao(desc);
                    ald.add(desc);               
                    break; 
                    
                case 3:
                    JOptionPane.showInputDialog("Informe o cod da Duvida: ");
                    int cod1 = leia.nextInt();
                    break;
                    
                case 4:
                    int i ;
                    int du = ald.size();
                    for(i=0 ; i<du; i++){
                    String message = String.format ("A duvida %d é %s", i, al.get(i));    
                    JOptionPane.showInputDialog (null,message);
                    }
                    break;
                    
                case 5:
                    JOptionPane.showInputDialog("Informe o cod da duvida na qual você quer Excluir:");
                    i = leia.nextInt();
                    try{
                        ald.remove(i);
                    }catch(IndexOutOfBoundsException e){
                        JOptionPane.showInputDialog("Erro cod da duvida Invalido"+e.getMessage());
                    }
                    break;    
                    
                case 6:
                    
                    JOptionPane.showInputDialog("Programa Encerrado!");
                    break;
                    
                default:
                    JOptionPane.showInputDialog("Opção invalida");
                        
                
            }
        } while( opcao != 6);
    }
    
}

