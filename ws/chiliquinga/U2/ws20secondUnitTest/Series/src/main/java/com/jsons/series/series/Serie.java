/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.series.series;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Serie {
    public static int computeDivergence(int divergence){   
    int result = 0;
 
    int addend = 0;
    
    while(true){
        if(divergence == 1){
            result = 1;
            break;
        }
        if(divergence == 0){
            result = 0;
            break;
        }
        for(int i = 0; i < divergence; i++){
            addend = i + 1;
            if(divergence % 2 == 0 && addend % 2 == 0){
                result = result - addend;
            }else{
                if(addend % 2 == 0){
                    result = result - addend;
                }else{
                    result = result + addend;
                }
            }                
        }
        break;
    }
        
    return result;
        
    }
}
