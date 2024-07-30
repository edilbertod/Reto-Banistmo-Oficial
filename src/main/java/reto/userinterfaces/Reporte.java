package reto.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Reporte extends PageObject {
    public static final Target BTN_REPORTE = Target.the("Boton para Generar Reporte").located(By.xpath("//div[@id='tab1']//a[@href = '/wps/wcm/connect/www.banistmo.com11237/ad2e205d-52e5-477f-8eaa-26fc66d73509/PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf?MOD=AJPERES&CVID=mCx33X-']"));
}
