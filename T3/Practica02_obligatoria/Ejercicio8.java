package T3.Practica02_obligatoria;

/**
 * @Author Sergey Shevchenko
 */
/*
Encontrar y mostrar todos los números de cuatro cifras que cumplan la
condición de que la suma de las cifras de orden impar es igual a la suma
de las cifras de orden par.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Los numeros que cumplen la condicion de que la suma de las cifras de orden impar es igual a la suma\n" + "de las cifras de orden par son: ");
        for (int cont = 1000; cont <= 9999; cont++) {
            int sumaP = 0, sumaI = 0;
            for (int cont2 = 4, aux = cont; cont2 >= 1; cont2--, aux = aux / 10) {
                if (cont2 % 2 == 0)
                    sumaP = sumaP + aux % 10;
                else
                    sumaI = sumaI + aux % 10;
            }
            if (sumaI == sumaP)
                System.out.println(cont);
        }

    }
}
