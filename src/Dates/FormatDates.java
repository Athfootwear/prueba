/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dates;

/**
 *
 * @author Hikis
 */
public class FormatDates {

    /**
     * Formateo de fechas al tomarla de la bd, hay veces donde la fecha no esta
     * formateada de manera adecuada y da error al momento de insertar hacia la
     * bd, ej, entra 11/12/2023 13:12:25.000, y apor el simple formato se sabe
     * que dará error al momento de insertarllo
     *
     * @param fecha, Fecha distinta a formato, yyyy-mm-ddThh:mm:ss
     * @return
     */
    public String ffecha(String fecha) {
        String resp = "";
        for (int i = 0; i < fecha.length() - 2; i++) {
            if (fecha.charAt(i) == ' ') {
                resp += "T";
            } else {
                resp += fecha.charAt(i) + "";
            }
        }
        return resp;
    }

    /**
     * Se obtiene el mes en letra cortado a la mitad de acuerdo al numero de mes
     * que se pase como parametro. Ej, 9 = Nov
     *
     * @param m
     * @return
     */
    public String formateamesrespaldo(int m) {
        String mes = "";
        switch (m) {
            case 1:
                mes = "Ene";
                break;
            case 2:
                mes = "Feb";
                break;
            case 3:
                mes = "Mar";
                break;
            case 4:
                mes = "Abr";
                break;
            case 5:
                mes = "May";
                break;
            case 6:
                mes = "Jun";
                break;
            case 7:
                mes = "Jul";
                break;
            case 8:
                mes = "Ago";
                break;
            case 9:
                mes = "Sep";
                break;
            case 10:
                mes = "Oct";
                break;
            case 11:
                mes = "Nov";
                break;
            case 12:
                mes = "Dic";
                break;
            default:
                break;
        }
        return mes;
    }

    /**
     * Se obtiene el mes en letra de acuerdo al numero de mes que se pase como
     * parametro. Ej, 9= Noviembre
     *
     * @param m
     * @return
     */
    public String formateamescompleto(int m) {
        String mes = "";
        switch (m) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                break;
        }
        return mes;
    }

    /**
     * Obtiene los ultimos dos digitos del año para el nombre del archivo del
     * respaldo de la bd. Ej, 2023 =23
     *
     * @param year
     * @return
     */
    public String formateayearrespaldo(String year) {
        String y = "";
        for (int i = 2; i < 4; i++) {
            y += year.charAt(i);
        }
        return y;
    }
}
