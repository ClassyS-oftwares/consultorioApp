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
public class CLT extends professor implements Ferias{
    
    private Double CargaHoraria;

    public Double getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(Double CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    @Override
    public void Calcular_Ferias(Double Ferias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void cadastro() {
        //Captura de Dados
        
        System.out.println("Digite a carga horaria do professor: ");
        this.setCargaHoraria(tecladodoub.nextDouble());
    }
    public void Exibir() {
        //Exibição de Dados
        System.out.println(this.getCargaHoraria());
    }
}
