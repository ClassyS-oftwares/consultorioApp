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
public class funcionarios {
    private int Codigo;
    private String Nome;
    private String NumCart_Trab;
    private int Tel;
    private String Endereco;
    private String Data_nasc;
    private String DataRgistro;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNumCart_Trab() {
        return NumCart_Trab;
    }

    public void setNumCart_Trab(String NumCart_Trab) {
        this.NumCart_Trab = NumCart_Trab;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    private boolean Registrar() {
        return true;
    }
    
    public void Demitir(){
       
    }

    public String getData_nasc() {
        return Data_nasc;
    }

    public void setData_nasc(String Data_nasc) {
        this.Data_nasc = Data_nasc;
    }

    public String getDataRgistro() {
        return DataRgistro;
    }

    public void setDataRgistro(String DataRgistro) {
        this.DataRgistro = DataRgistro;
    }
    
}
