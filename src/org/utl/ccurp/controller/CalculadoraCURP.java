
package org.utl.ccurp.controller;


import org.utl.ccurp.model.Persona;

/**
 *
 * @author DYNABOOK
 */
public class CalculadoraCURP {
    
    private char buscarVocalInterna(String s){
        if(s == null){
            return 'X';
        }
        for(int i = 0; i < s.length(); i++){
            char letra = s.charAt(i);
            if(("aeiouAEIOU").indexOf(letra)!=-1){
                return s.charAt(i);
            }
        }
        return 'X';
    }
    
    //--------APELLIDO
    private String curpParte01(Persona persona){
        String apellido = persona.getApellido();

        return ""+apellido.charAt(0)+""+buscarVocalInterna(apellido);
    }
    //-------APELLIDO 2
    private String curpParte02(Persona persona){
        String apellido2 = persona.getApellido2();
        if (apellido2 == null){
            return "X";
        }
        return ""+apellido2.charAt(0);
    }
    //-------NOMBRE
    private String curpParte03(Persona persona){
        String nombre = persona.getNombre().toUpperCase();
        
        if (persona.getNombre2().equals(" ") || persona.getNombre2().equals("")){
            char letra = nombre.charAt(0);
            return ""+letra;
        }
        if(nombre.equals("JOSE")){
            nombre = persona.getNombre2();
        }
        if(nombre.equals("MARIA")){
            nombre = persona.getNombre2();
        }
        return ""+nombre.charAt(0);
    }
    //------ANIO
    private String curpParte04(Persona persona){
        int anio = persona.getAnio();
        String anioString = "" +anio%100;
        if (anioString.length()==1){
        anioString = "0"+anio%100;
        }
        return anioString;
    }
    //--------- MES
    private String curpParte05(Persona persona){
        String mes = ""+persona.getMes();
        if(mes.length()==1){
        mes = "0" +persona.getMes();
        }
        return mes;
    }
    //--------- DIA
    private String curpParte06(Persona persona){
        String dia = ""+persona.getDia();
        if (dia.length()==1){
            dia = "0"+persona.getDia();
        }
        return dia;
    }
    //--------- GENERO
    private String curpParte07(Persona persona){
        return ""+persona.getGenero();
    }
    //--------- ESTADO
    private String curpParte08(Persona persona){
        return persona.getEstado();
    }
    //--------- CONS APELLIDO
    private String curpParte09(Persona persona){
        String apellido = persona.getApellido();
        
        for (int i =1; i < apellido.length(); i++){
            char letra = apellido.charAt(i);
            
            
            if(("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ").indexOf(letra)!=-1){
            return ""+letra;
            }
        }
        return "X";
        
    }
    //--------- CONS APELLIDO 2
    private String curpParte10(Persona persona){
        String apellido2 = persona.getApellido2();
        
        for (int i =1; i < apellido2.length(); i++){
            char letra = apellido2.charAt(i);
            
            
            if(("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ").indexOf(letra)!=-1){
            return ""+letra;
            }
        }
        return "X";
    }
    
    //--------- CONS NOMBRE
    private String curpParte11(Persona persona){
        String nombre = persona.getNombre().toUpperCase();
        
        if(nombre.equals("JOSE")){
            nombre = persona.getNombre2();
        }
        if(nombre.equals("MARIA")){
            nombre = persona.getNombre2();
        }
        
        for (int i =1; i < nombre.length(); i++){
            char letra = nombre.charAt(i);
            
            
            if(("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ").indexOf(letra)!=-1){
            return ""+letra;
            }
        }
        return "X";
    }
    //--------- NUM-RANDOM
    private String curpParte12(Persona persona){
        String numero = "A9";
        if(numero.length()==1){
            numero = "0"+numero;
        }
        return numero;
    }
    
    public String calcularCurp(Persona persona){
        String curpString = null;
        CalculadoraCURP calcular = new CalculadoraCURP();
        curpString =""+calcular.curpParte01(persona)+
                    ""+calcular.curpParte02(persona)+
                    ""+calcular.curpParte03(persona)+
                    ""+calcular.curpParte04(persona)+
                    ""+calcular.curpParte05(persona)+
                    ""+calcular.curpParte06(persona)+
                    ""+calcular.curpParte07(persona)+
                    ""+calcular.curpParte08(persona)+
                    ""+calcular.curpParte09(persona)+
                    ""+calcular.curpParte10(persona)+
                    ""+calcular.curpParte11(persona)+
                    ""+calcular.curpParte12(persona)+' ';
        String curp=curpString.toUpperCase();
        return curp;
    }
    
}
