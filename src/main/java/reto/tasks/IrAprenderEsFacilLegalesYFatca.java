package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.userinterfaces.TareasPagina;

public class IrAprenderEsFacilLegalesYFatca implements Task {
    public static IrAprenderEsFacilLegalesYFatca tareas(){return Tasks.instrumented(IrAprenderEsFacilLegalesYFatca.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on (TareasPagina.BTN_POPUP),
                Click.on(TareasPagina.BTN_APRENDER),
                Click.on (TareasPagina.BTN_POPUP),
                Click.on(TareasPagina.BTN_LEGALES),
                Click.on (TareasPagina.BTN_POPUP),
                Click.on(TareasPagina.BTN_FATCA),
                Click.on (TareasPagina.BTN_POPUP)
        );
    }
}
