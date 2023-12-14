/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numericos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hikis
 */
public class Onlydigits {

    /**
     * Verifica que en la variable solo haya numero enteros del 0 al 9
     *
     * @param cad
     * @return
     */
    public boolean verificaint(String cad) {
        boolean resp = false;
        String patt = "[0-9]+";
        Pattern pat = Pattern.compile(patt);
        Matcher match = pat.matcher(cad);
        if (match.matches()) {
            resp = true;
        }
        return resp;
    }

    /**
     * Verifica que el string introducido sea un entero o un numero con
     * decimales
     *
     * @param cad
     * @return
     */
    public boolean verificafloat(String cad) {
        boolean resp = false;
        String patt = "[0-9]+||[0-9]+.[0-9]+";
        Pattern pat = Pattern.compile(patt);
        Matcher match = pat.matcher(cad);
        if (match.matches()) {
            resp = true;
        }
        return resp;
    }

    /**
     * Formatea las cantidades a 2 digitos y revisa si se redondea o se trunca.
     * Se utiliza mas en cuestiones de facturacion, ya que pide que sean los 2
     * decimales y de ahi a decicion de que si un decimal es menor o igual a 5
     * se trunca y si no se redondea
     *
     * @param cant
     * @return
     */
    public double formatdecimal(double cant) {
        int dato = 0;
        int punto = 0;
        boolean band = false;
        double resp;
        String c = String.valueOf(cant);
//        String cadena = "";
        for (int i = 0; i < c.length(); i++) {
//            Empieza a tomar datos despues del punto
            if (c.charAt(i) == '.') {
                band = true;
            }
            if (band) {
//                3 digitos de decimal para saber qe hacer con los decimales
                if (punto == 3) {
                    dato = Integer.parseInt(c.charAt(i) + "");
                    i = c.length();
                    break;
                }
//                cadena += c.charAt(i);
                punto++;
            }
        }
        if ((dato <= 5)) {
            resp = BigDecimal.valueOf(cant).setScale(2, RoundingMode.FLOOR).doubleValue();
        } else {
            resp = BigDecimal.valueOf(cant).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        return resp;
    }
}
