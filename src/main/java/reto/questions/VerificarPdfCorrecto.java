package reto.questions;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class VerificarPdfCorrecto implements Question<Boolean> {

    public static VerificarPdfCorrecto verifica() {
        return new VerificarPdfCorrecto();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean resultado = false;
        String tituloDocumento = "PJ Autocertificacion unificado- Fatca y CRS.pdf";
        String titulopdf = null;

        try {
            titulopdf = URLDecoder.decode(Serenity.getWebdriverManager().getWebdriver().getCurrentUrl(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //titulopdf = titulopdf.replaceAll(" + "," ");

        if (titulopdf.contains(tituloDocumento)) {
            resultado = true;
        }
        return resultado;


    }
}
