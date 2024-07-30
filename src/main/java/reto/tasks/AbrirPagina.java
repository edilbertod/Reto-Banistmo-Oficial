package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    private reto.userinterfaces.AbrirPagina abrirPagina;

    public static AbrirPagina abrir(){return Tasks.instrumented(AbrirPagina.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPagina));
    }
}
