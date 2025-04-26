package com.example.demoPmunoz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductoController {


      @GetMapping("/api/Productos")
    public String index()
    {
        return "Bienvenido  al listado de productos";
    }

    @GetMapping("/api/Producto/{IdProducto}")
    public String ObtnerProducto(@PathVariable String IdProducto)
    {
        String [] productos = {"10","20","30"};
        String cont = "404";
            for (int i=0; i<productos.length; i++)
            {
                if (productos[i] == IdProducto)
                {
                    cont = productos[i];
                }
            }
            return cont;
    }
}
