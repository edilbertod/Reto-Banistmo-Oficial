package reto.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.questions.VerificarPdfCorrecto;
import reto.tasks.AbrirPagina;
import reto.tasks.GenerarReporte;
import reto.tasks.IrAprenderEsFacilLegalesYFatca;

public class RetoStepDefinitions {

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("ingreso a la pagina web de banistmo")
    public void ingresoALaPaginaWebDeBanistmo() {
        OnStage.theActorCalled("actor").wasAbleTo(
                AbrirPagina.abrir()
        );
    }

    @Cuando("accedo a la seccion aprender es facil legales fatca y crs")
    public void accedoALaSeccionAprenderEsFacilLegalesFatcaYCrs() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrAprenderEsFacilLegalesYFatca.tareas()
        );
    }

    @Y("generar el documento pdf")
    public void generarElDocumentoPdf() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GenerarReporte.reporte()
        );
    }

    @Entonces("Verifico que el documento generado sea el correcto")
    public void verificoQueElDocumentoGeneradoSeaElCorrecto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                VerificarPdfCorrecto.verifica())
        );
    }

}
