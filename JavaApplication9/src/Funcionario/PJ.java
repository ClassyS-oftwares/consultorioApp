/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

/**
 *
 * @author Luis Gustavo
 */
public class PJ extends professor{
    
    private int NumContrato;
    private String FimContrato;

    public int getNumContrato() {
        return NumContrato;
    }

    public void setNumContrato(int NumContrato) {
        this.NumContrato = NumContrato;
    }

    public String getFimContrato() {
        return FimContrato;
    }

    public void setFimContrato(String FimContrato) {
        this.FimContrato = FimContrato;
    }
    
    public void contrato() {
        //Captura de Dados
        
        System.out.println("Digite o nome da empresa: ");
        this.setNome(tecladostrin.nextLine());
        
        System.out.println("Digite o telefone comercial: ");
        this.setTel(tecladoint.nextInt());
        
        System.out.println("Digite o endereço da empresa: ");
        this.setEndereco(tecladostrin.nextLine());
        
        System.out.println("Digite o numero do contrato: ");
        this.setNumContrato(tecladoint.nextInt());
        
        System.out.println("Digite a data do fim do contrato: ");
        this.setFimContrato(tecladostrin.nextLine());
                
    }
    
    public void MostraDados() {
        //Exibir Dados do Contrato
        System.out.println();
        System.out.println(this.getNome());
        
        System.out.println(this.getTel());
        
        System.out.println(this.getEndereco());
        
        System.out.println(this.getNumContrato());
        
        System.out.println(this.getFimContrato());
    }
}
