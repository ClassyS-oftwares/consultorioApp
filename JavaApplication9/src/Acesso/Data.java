/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acesso;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Luis Gustavo
 */
public class Data {
    public void Periodo(){
        //Mensagem de boas vindas
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
        System.out.println("Hoje é: "+f.format(data));
    }
    public void Horario(){
        //Informando a hora
        Calendar c1 = Calendar.getInstance();
        Date data = c1.getTime();
        DateFormat hora1 = DateFormat.getTimeInstance();
        System.out.println("Horario de acesso: "+hora1.format(data));
        System.out.println();
    }
}
