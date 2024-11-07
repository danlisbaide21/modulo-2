package com.mycompany.recursosproyecto;
import java.util.ArrayList;
import java.util.List;

public class RecursosProyecto {
    // Primer método
    public String mensajeProgramacion() {
        return "Programación Orientada a Objetos";
    }

    // Segundo método
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método
    public int multiplicarEnteros(int a, int b) {
        return a * b;
    }

    // Cuarto método
    public List<Integer> listaNumeros(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }
}
