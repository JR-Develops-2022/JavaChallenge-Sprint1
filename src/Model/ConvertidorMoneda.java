package Model;
import Controller.dls;
/**
 *
 * @author RODX & JonhDuranM
 */
public class ConvertidorMoneda {
    public static void main(String[] args) {
        dls prueba = new dls();
        /*
            double valorConvertido = prueba.ValueConverting;
        */
        
        
        prueba.addValue(11000);
        prueba.convertCurrency();
        
      
        
        System.out.println(prueba.value + " valor Agregado");
        System.out.println(prueba.getPrice() + " valor de dolar");
        System.out.println(prueba.ValueConverting + " valor convertido");      
    }
}