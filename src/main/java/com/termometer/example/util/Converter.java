package com.termometer.example.util;

import org.springframework.stereotype.Component;

@Component
public class Converter {

   public double convertFarenheitCelsius (double farenheit) {
	   double resultado = farenheit - 32 * 5/9;
       return resultado;
   }

   public double convertCelsiusFarenheit(double celsius) {
	   double resultado1 = celsius * 9/5 + 32;
       return resultado1;
   }
}
