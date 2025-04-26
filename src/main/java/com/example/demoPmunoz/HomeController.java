
package com.example.demoPmunoz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {


   // http://localhost:8080/saludov1/Pedro/Gonzalez
   @GetMapping("/saludov1/{nombre}/{apellido}")
   public String saludov11(@PathVariable String nombre, @PathVariable String apellido) {
       return "Hola " + nombre + " " + apellido + "!";
   } 
   // http://localhost:8080/saludov2?nombre=Pedro&apellido=Gonzalez
   @GetMapping("/saludov2")
   public String saludov22(@RequestParam String nombre,@RequestParam String apellido) {
       return "Hola " + nombre + " " + apellido + "!";
   }


@GetMapping("/api/suma/{num1}/{num2}")
public int suma(@PathVariable int num1, @PathVariable int num2)
    {
        int result = 0;
        result = num1 + num2;
        return result;

    }

}
