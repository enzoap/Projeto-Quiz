/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;


/**
 *
 * @author Aluno
 */
public class Perguntas {
   public static ArrayList<Questao> preciclagem = new ArrayList<Questao>();
   public static ArrayList<Questao> psus = new ArrayList<Questao>();
   public static ArrayList<Questao> precursos = new ArrayList<Questao>();
   private int pergunta = 0;
   private int sala = 0;
   private int x = 0;
   private int y = 0;
   private int z = 0;
 
   public void PreencherArray(){
       Preciclagem();
       Precursos();
       Psus();
   }
   
   public String MsgInicial(){
    return "Escolha o tópico abaixo para ser jogado!!";
}
   
   public void setSala(int s) {
       this.sala = s;
   }
   
   
   public Questao getProximapergunta(){
       if (sala == 1) {
           if (x < (preciclagem.size())) return preciclagem.get(x++);
           else return null;
       }
           
       if (sala == 2){
           if (y < (psus.size())) return psus.get(y++);
           else return null;
       }
           
       if (sala == 3) {
           if(z < (precursos.size()))
           return precursos.get(z++);
       else return null;
       }
       return null;
       
   }
   
   public static void Preciclagem(){
       
       preciclagem.add(new Questao("1°) Reciclar é uma forma de reduzir o lixo depositado no ambiente\n" +
"e todos podemos colaborar para a conscientização da sociedade sobre\n" +
"os benefícios dessa atividade.",true));
       
       preciclagem.add(new Questao("2°) Muitas pessoas utilizam essa forma de vida como fonte de renda, \n" +
"e ainda ajudam o meio ambiente. O profissional que destina o tempo \n" +
"para reciclagem é totalmente importante para o ciclo e redução da \n" +
"produção de lixos.",true));
        
       preciclagem.add(new Questao("3°) São muitos os materiais que são recicláveis e podemos fazer a \n" +
"separação na nossa casa e no local de trabalho. Os materiais que\n" +
"são recicláveis são: pilhas, acrílico, espuma, plástico, tecido e componentes\n" +
"eletrônicos.",false));
       
       preciclagem.add(new Questao("4°) Os materiais que serão reciclados são transportados para uma \n" +
"cooperativa ou são recolhidos em locais estratégicos, esses materiais \n" +
"são limpos e reprocessados em novos materiais para a produção industrial.",true));
       
        preciclagem.add(new Questao("5°) Mesmo com o avanço da tecnológia, é impossivel fazer com que os itens \n" +
"não reciclaveis se tornem futuramente reciclaveis.",false));
   
   }
   public static void Psus(){
       
       psus.add(new Questao("1°) Desenvolvimento sustentável é o desenvolvimento capaz \n" +
"de suprir as necessidades da geração atual.",true));
       
       psus.add(new Questao("2°) Nos dias atuais, as estratégias de responsabilidade \n" +
"social das empresas estão voltadas na sustentabilidade. \n" +
" Ações e produtos sustentáveis na área empresarial ganham \n" +
"destaque e o gosto dos consumidores.",true));
       
       psus.add(new Questao("3°) Sustentabilidade é uma característica e condição de um \n" +
"processo ou de um sistema que não permite a sua permanência, em \n" +
"certo nível, por um determinado prazo.",false));
       
       psus.add(new Questao("4°) Sustentabilidade Ambiental. Ela tem o intuito de fazer com que o\n" +
"meio ambiente permaneça com desmatamentos em lugares adequados,\n" +
"compromentendo a proxima geração",false));
               
       psus.add(new Questao("5°)A sustentabilidade ambiental não se preocupa em cuidar das águas, \n" +
"o lixo pode ser separado em sacolas plásticas, e preocupações com queimadas \n" +
"e desmatamentos.",false));        
   }
   
   public static void Precursos(){
       
       precursos.add(new Questao("1°) O petróleo é um recurso natural renovável?",false));
       
       precursos.add(new Questao("2°) Pode se dizer que recursos naturais são elementos não renováveis,\n" + 
               "e que implicam na sobrevivência em sociedade do ser humano?",false)); 
       
       precursos.add(new Questao("3°) Cobre, ouro, prata e ferro, são considerados recursos naturais?",true));
       
       precursos.add(new Questao("4°) Energia solar e energia eólica são consideradas recursos naturais?",true));
       
       precursos.add(new Questao("5°) A água, as florestas, os vegetais, o solo, o oxigênio, a luz solar,\n "+
               "os ventos, os animais e os minérios, são todos recursos naturais?",true));   
   }
   
}
