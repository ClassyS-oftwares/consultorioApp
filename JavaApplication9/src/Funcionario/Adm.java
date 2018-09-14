//@author Luis Gustavo
package Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Adm extends funcionarios implements Ferias{
    ArrayList listaADM = new ArrayList();
    private String Depto;
    private String Cargo;
    
    Scanner tecladoint = new Scanner(System.in);
    Scanner tecladostrin = new Scanner(System.in);
    Scanner tecladodoub = new Scanner(System.in);

    public String getDepto() {
        return Depto;
    }

    public void setDepto(String Depto) {
        this.Depto = Depto;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    public void Registrar(){
     //captura de dados
        System.out.println("Digite código de funcionario: ");
        this.setCodigo(tecladoint.nextInt());
        
        System.out.println("Digite nome completo: ");
        this.setNome(tecladostrin.nextLine());
        
        System.out.println("Digite numero do cartão: ");
        this.setNumCart_Trab(tecladostrin.nextLine());
        
        System.out.println("Digite numero de telefone: ");
        this.setTel(tecladoint.nextInt());
        
        System.out.println("Digite endereço: ");
        this.setEndereco(tecladostrin.nextLine());
        
        System.out.println("Digite data de nascimento: ");
        this.setData_nasc(tecladostrin.nextLine());
        
        System.out.println("Digite data de registro: ");
        this.setDataRgistro(tecladostrin.nextLine());
        
        System.out.println("Digite seu departamento: ");
        this.setDepto(tecladostrin.nextLine());
        
        System.out.println("Digite seu cargo: ");
        this.setCargo(tecladostrin.nextLine());
    }
    
    public void Mostrar(){
         //Exibição de dados
        System.out.println();
        listaADM.add(this.getCodigo());
        System.out.println(this.getCodigo());
        
        listaADM.add(this.getNome());
        System.out.println(this.getNome());
        
        listaADM.add(this.getNumCart_Trab());
        System.out.println(this.getNumCart_Trab());
        
        listaADM.add(this.getTel());
        System.out.println(this.getTel());
        
        listaADM.add(this.getCodigo());
        System.out.println(this.getEndereco());
        
        listaADM.add(this.getData_nasc());
        System.out.println(this.getData_nasc());
        
        listaADM.add(this.getDataRgistro());
        System.out.println(this.getDataRgistro());
        
        listaADM.add(this.getDepto());
        System.out.println(this.getDepto());
        
        listaADM.add(this.getCargo());
        System.out.println(this.getCargo());
        System.out.println(listaADM);
    }

    @Override
    public void Calcular_Ferias(Double Ferias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
