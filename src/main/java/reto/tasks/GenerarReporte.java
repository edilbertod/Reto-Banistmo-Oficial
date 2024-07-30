package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.interactions.CambioDePestana;
import reto.userinterfaces.Reporte;
import reto.userinterfaces.TareasPagina;

public class GenerarReporte implements Task {
    public static GenerarReporte reporte(){return Tasks.instrumented(GenerarReporte.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Reporte.BTN_REPORTE),
                CambioDePestana.cambioDePestana()
        );
    }
}
