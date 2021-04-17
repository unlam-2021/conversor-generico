
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flescano
 */
public class ConverterController {
    private static Map<String, Converter> convertInstances = new HashMap<String, Converter>();
    private static String METROS_CENTIMETROS = "Metros - Centimetros";
    private static String CENTIMETROS_PULGADAS = "Centimetros - Pulgadas";
    private static String LIBRAS_KILOGRAMOS = "Libras - Kilogramos";
    private static String LITROS_GALONES = "Litros - Galones";
    private static String METROS_PIES = "Metros - Pïes";
    
    private static Map<String, Labels> labels = new HashMap<String, Labels>();

    public ConverterController() {
        convertInstances.put(METROS_CENTIMETROS, new MetrosCentimetrosConverter());
        convertInstances.put(CENTIMETROS_PULGADAS, new CentimetrosPulgadasConverter());
        convertInstances.put(LIBRAS_KILOGRAMOS, new LibrasKilogramosConverter());
        convertInstances.put(LITROS_GALONES, new LitrosGalonesConverter());
        convertInstances.put(METROS_PIES, new MetrosPiesConverter());
        
        labels.put(METROS_CENTIMETROS, new Labels("Metros", "Centimetros"));
        labels.put(CENTIMETROS_PULGADAS, new Labels("Centimetros", "Pulgadas"));
        labels.put(LIBRAS_KILOGRAMOS, new Labels("Libras", "Kilogramos"));
        labels.put(LITROS_GALONES, new Labels("Litros", "Galones"));
        labels.put(METROS_PIES, new Labels("Metros", "Pies"));
    }
    
    
    public Set<String> getOptions() {       
       return convertInstances.keySet();
    }
    
    public Converter getConverter(String option) {
        return convertInstances.get(option);
    }
    
    public Labels getCLabels(String option) {
        return labels.get(option);
    }
}
