
package com.codecrafters.tax.ice;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class IncomeTax {
     public static float calcularImpuesto(float ingresoAnual, float ivaPercentage) {
        float impuesto = 0.0F;
        
        if (ingresoAnual <= 11212) {
            impuesto = 0.0F;
        } else if (ingresoAnual <= 14285) {
            impuesto = 0.0F + (ingresoAnual - 11212) * 0.05F;
        } else if (ingresoAnual <= 17854) {
            impuesto = 154 + (ingresoAnual - 14285) * 0.10F;
        } else if (ingresoAnual <= 21442) {
            impuesto = 511 + (ingresoAnual - 17854) * 0.12F;
        } else if (ingresoAnual <= 42874) {
            impuesto = 941 + (ingresoAnual - 21442) * 0.15F;
        } else if (ingresoAnual <= 64297) {
            impuesto = 4156 + (ingresoAnual - 42874) * 0.20F;
        } else if (ingresoAnual <= 85729) {
            impuesto = 8440 + (ingresoAnual - 64297) * 0.25F;
        } else if (ingresoAnual <= 114288) {
            impuesto = 13798 + (ingresoAnual - 85729) * 0.30F;
        } else if (ingresoAnual > 114288) {
            impuesto = 22366 + (ingresoAnual - 114288) * 0.35F;
        }
        
        return impuesto;
    }
          
}
