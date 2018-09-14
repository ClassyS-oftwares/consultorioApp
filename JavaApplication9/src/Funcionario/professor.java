/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

import java.util.Scanner;

/**
 *
 * @author Luis Gustavo
 */
public class professor extends funcionarios {
    private String Area;
    private String Formacao;
    
     Scanner tecladoint = new Scanner(System.in);
     Scanner tecladostrin = new Scanner(System.in);
     Scanner tecladodoub = new Scanner(System.in);
    

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getFormacao() {
        return Formacao;
    }

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
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
        
        System.out.println("Digite área de atuação: ");
        this.setArea(tecladostrin.nextLine());
        
        System.out.println("Digite sua formação: ");
        this.setFormacao(tecladostrin.nextLine());
    }
    
    public void Mostrarcadastro(){
         //Exibição de dados
        System.out.println();
        System.out.println(this.getCodigo());
        
        System.out.println(this.getNome());
        
        System.out.println(this.getNumCart_Trab());
        
        System.out.println(this.getTel());
        
        System.out.println(this.getEndereco());
        
        System.out.println(this.getData_nasc());
        
        System.out.println(this.getDataRgistro());
        
        System.out.println(this.getArea());
        
        System.out.println(this.getFormacao());
    }
    
}
