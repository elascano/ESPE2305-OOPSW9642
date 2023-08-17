package com.jsons.mensualcalculator.view;

import com.jsons.mensualcalculator.model.WorkingMan;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class MensualSalaryCalculator {
    public static void main(String[] args) {
        int id = 0;
        String name = "Ruben";
        float annualSalary = 15200;
        WorkingMan workingMan = new WorkingMan(id, name, annualSalary);
        System.out.println(workingMan);
    }
}
