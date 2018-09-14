// @author Luis Gustavo
package Cadastro;

//Classes Filhas
import Funcionario.Adm;
import Funcionario.PJ;
import Funcionario.CLT;
import Acesso.Data;

//Metodos Utilizados 
import java.util.Scanner;


public class Cadastrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BD banco = new BD();
        //banco.LerDados();
        
        //Variaveis
        String nome;
        int cont = 0;
        
       //Scanners e listas
       Scanner sc = new Scanner(System.in);
       Scanner nm = new Scanner(System.in);

       //Nome Do Usuario
       System.out.println("Digite seu nome: ");
       System.out.println();
       nome = nm.nextLine();
       
       //Data e Hora 
       Data date = new Data();
       date.Periodo();
       date.Horario();
       
       while (cont != 4){
        
       System.out.println("O que gostaria de fazer Sr(a)?");      
       System.out.println("1- Cadastrar CLT");
       System.out.println("2- Contratar PJ");
       System.out.println("3- Cadastrar ADM");
       System.out.println("4- Sair");
       int x = sc.nextInt();
       switch(x){
           case 1: 
               CLT f1 = new CLT();
                f1.Registrar();
                f1.cadastro();
                f1.Mostrarcadastro();
                f1.Exibir();
                System.out.println("Cadastro efetuado com sucesso!!!");
                break;
            case 2: 
               PJ f2 = new PJ();
                f2.contrato();
                f2.MostraDados();      
                System.out.println("Contrato firmado com sucesso!!!");
                break;
            case 3:
                Adm f3 = new Adm();
                f3.Registrar();
                f3.Mostrar();
                System.out.println("Cadastro efetuado com sucesso!!!");
                break;
            case 4:
                System.out.println("!Volte Sempre!");
                cont = 4;
                break;
       }//Fim do Switch
       }//Fim do While
        
    }
    
}
