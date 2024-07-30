package reto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class CambioDePestana implements Interaction {
    public static CambioDePestana cambioDePestana(){return new CambioDePestana();}

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> pestana = getDriver().getWindowHandles();

        for(String pestana2 : pestana){
            getDriver().switchTo().window(pestana2);
        }
    }
}
