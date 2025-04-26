
package com.example.demoPmunoz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {


@GetMapping("/Hola/{Nombre}/{Apellido}")
    public String index(@PathVariable("Nombre") String Nombre, @PathVariable("Apellido") String Apellido){

        return "Nombre: " + Nombre + ", Apellido: " + Apellido;
    }

    
@GetMapping("/Saludo")
public String index2(@RequestParam String Nombre, @RequestParam String Apellido){

    return "Nombre: " + Nombre + ", Apellido: " + Apellido;
}


@GetMapping("/Suma")
public int suma(@RequestParam int numero1, @RequestParam int numero2){

    return numero1 + numero2;
}

}
