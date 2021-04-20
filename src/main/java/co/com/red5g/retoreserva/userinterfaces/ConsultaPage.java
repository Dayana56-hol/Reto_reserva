package co.com.red5g.retoreserva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultaPage {


    //Campos de consulta
    public static final Target TXT_GOING_TO = Target.the("Campo destino uno").located(By.xpath("//button[@class='uitk-faux-input']"));
    public static final Target TXT_WHERE_YOU_GOING = Target.the("Campo ingreso uno").located(By.id("location-field-destination"));
    public static final Target TXT_WHERE_YOU_GOING_DOS = Target.the("Campo ingreso dos").locatedBy("//input[@class='uitk-field-input uitk-typeahead-input  ']");
    public static final Target TXT_WHERE_YOU_GOING_TRES = Target.the("Campo ingreso tres").located(By.id("location-field-location"));
    public static final Target SLC_LISTA_CARTG = Target.the("Campo destino uno").located(By.xpath("//li[@data-index='0']"));
    public static final Target BTN_CRUISES = Target.the("Botón de opción cruceros").locatedBy("//span[text()='Cruises']");
    public static final Target LIST_CRUISES = Target.the("Lista de opciones de crucero").locatedBy("//option[@value='bahamas']");
    public static final Target SLC_CRUISES = Target.the("Seleccion crucero").located(By.id("cruise-destination"));
    public static final Target BTN_CONTINUE_CRUCERO = Target.the("Botón de ingreso al crucero").located(By.id("selectSailingButton-AQoCcmMSAmFkGIDQkuyfLyAHKgNuYXMyAmJzOgNuYXNCAmJz-AD"));
    public static final Target BTN_THING = Target.the("Botón de cosas por hacer").locatedBy("//span[text()='Things to do']");
    public static final Target TXT_THING_TO_DO_IN = Target.the("Campo de cosas para hacer").located(By.xpath("//button[@class='uitk-faux-input']"));
    public static final Target TXT_DESTINACION_VACATION = Target.the("Campo de destinación vacaciones").located(By.id("VR-destination"));
    public static final Target LBL_MENSAJE_OFERTA = Target.the("Mensaje de oferta").locatedBy("//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-flex-shrink-0 uitk-toolbar-button']");
    public static final Target LBL_APART_VACATION = Target.the("Opción de apartaestudio").locatedBy("//section[@class='results']//following::h3[text()='Apartaestudio Vista al mar Aire Acondicionado, Internet y Agua.caliente - N2-']");
    //Botón de búsqueda y resultados
    public static final Target BTN_BUSCAR = Target.the("Botón buscar").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']");
    public static final Target BTN_DESTINATION = Target.the("Botón de destination").locatedBy("//span[text()='Search']");
    public static final Target LBL_RESULTADOS_UNO = Target.the("Resultados de búsqueda").locatedBy("//div[text()='What we are paid impacts our sort order']");
    public static final Target LBL_RESULTADOS_DOS = Target.the("Resultados de búsqueda").locatedBy("//h2[text()='Top 10 things to do']");
    public static final Target LBL_RESULTADOS_TRES = Target.the("Resultados de búsqueda").locatedBy("//section[@class='results']//child::li[1]");
    public static final Target LBL_RESULTADOS_CUATRO = Target.the("Resultados de búsqueda").locatedBy("//li[text()='Book with confidence:']");
    public static final Target LBL_RESULTADOS_CINCO = Target.the("Resultados de búsqueda").locatedBy("//h1[text()='Book Discount Travel']");
    public static final Target LBL_INFORMACION = Target.the("Informacion del hotel").locatedBy("//h3[text()='Popular amenities']");
    public static final Target LBL_INFORMACION_APAR = Target.the("Informacion del apartaestudio").locatedBy("//h2[text()='About this property']");



}
