/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfanumericos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hikis
 */
public class Checkalfanumericos {

    /**
     * Verifica el string sin tienen solo puro alfanumerico y algunos cuantos
     * caracteres
     *
     * @param cad, String que será verificado
     * @return boolean
     */
    public boolean verificaStringsSC(String cad) {
        boolean resp = false;
        String patt = "[\\s\\w@.-]*";
        Pattern pat = Pattern.compile(patt);
        Matcher match = pat.matcher(cad);
        if (match.matches()) {
            resp = true;
        }
        return resp;
    }
}
