/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2020.pkg1;

import ordenamiento.Grafica;
import recursivo.Fibonacci;

/**
 *
 * 
 */
public class AnalisisDeAlgoritmos20201 {

    /**
     */
    public static void main(String[] gggg) {
        
        
       /* 
            Burbuja  b = new Burbuja(true);
        Burpbuja  b1 = new Burpbuja(true);
        Insertion  b2 = new Insertion(true);
        
        ArrayList<AlgoritmoOrdenamiento> lista = new ArrayList<>();
        lista.add(b);
        lista.add(b1);
        lista.add(b2);
       
        Manager m = new Manager(lista);
        m.ejecutarPrueba(1000, 15, 500, true);
        * Comentario hecho 2 sep */
       
       /*System.out.println(factorial.Factorial_Recursivo(i));
       System.out.println(factorial.Factorial_Iterativo(i));
       System.out.println(Fibonacci.Fib_r(i));*5 de septiembre*/
        
       /*System.out.println(suma.suma_recursiva(5, 8));
        Burbuja  b = new Burbuja(false);
        Burpbuja  b1 = new Burpbuja(false);
        Insertion  b2 = new Insertion(false);
        MergeSort ms1= new MergeSort(false);
        QuickSort qk1= new QuickSort(false);
        ArrayList<AlgoritmoOrdenamiento> lista = new ArrayList<>();
        //lista.add(b);
       // lista.add(b);
       // lista.add(b2);
        lista.add(ms1);
        lista.add(qk1);
        Manager m = new Manager(lista);
        m.ejecutarPrueba(40000, 4, 1000, true);26 de septiembre*/
       
       double t1[] = new double[5000];
       double t2[] = new double[5000];
       double t3[] = new double[5000];
       double t4[] = new double[5000];
        for(int x=0; x<5000;x++){
           t1[x]= Fibonacci.run_fiboIterativo(x);
           t2[x]= Fibonacci.run_fiboIterativoDinamico(x);
           //t3[x]= Fibonacci.run_Fib_r(x);
           t4[x]= Fibonacci.run_fiboRecursivoDinamico(x);
           System.out.println(x);
        }
        Grafica g = new Grafica("numFib","Tiempo","Pruebas Fibonacci");
        
        g.agregarSerie(t1, "Iterativo");
        g.agregarSerie(t2, "Dinamico Iterativo");
        //g.agregarSerie(t3, "Recursivo");
        g.agregarSerie(t4, "Dinamico Recursivo");
        g.creaYmuestraGrafica();
        
    
    }
}