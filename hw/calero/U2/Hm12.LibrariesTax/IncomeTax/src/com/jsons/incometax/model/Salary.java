
package com.jsons.incometax.model;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class Salary {
    
    private float value;

    @Override
    public String toString() {
        return "Salary{" + "value=" + value + '}';
    }

    public Salary(float value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }
    
}
