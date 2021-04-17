/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flescano
 */
public abstract class Converter {
    Double unit = 1D;
    
    public Double convertTo(Double value) {
        return value*unit;
    };
    
    public Double converFrom(Double value) {
        return value/unit;
    };
}
