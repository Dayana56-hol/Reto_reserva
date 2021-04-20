package co.com.red5g.retoreserva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MasViajesPage {

    public static final Target BTN_MORE_TRAVEL = Target.the("Botón más viajes").locatedBy("//div[text()='More travel']");
    public static final Target BTN_TRAVEL_DEALS = Target.the("Botón de ofertas de viaje").locatedBy("//div[text()='Travel Deals']");
    public static final Target BTN_VACATION_RENTALS = Target.the("Botón de alquiler de vacaciones").locatedBy("//a[@href='/vacation-rentals/']");


}
