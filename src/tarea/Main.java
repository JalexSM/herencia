package tarea;

import java.util.Scanner;

import academico.Docente;
import academico.Estudiante;
import criaturas.Perro;
import cuentas.CuentaCorriente;
import geometrico.Rectangulo;
import libros.LibroDigital;

public class Main {
	
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args) {

		int opcion = 0;

        while (opcion != 11) {
       	 	System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println(" 1. Persona ");
            System.out.println(" 2. Cuenta");
            System.out.println(" 3. Producto");
            System.out.println(" 4. Transporte");
            System.out.println(" 5. Empleado");
            System.out.println(" 6. Animal");
            System.out.println(" 7. Vehiculo ");
            System.out.println(" 8. Figura ");   
            System.out.println(" 9. Libro ");
            System.out.println(" 10. Sistema de facturación con herencia ");
            System.out.println(" 11. SALIR");

            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                    	ejercicio1();
                        break;
                    case 2:
                   	 	ejercicio2();
                        break;
                    case 3:
                   	// ejercicio3();

                        break;
                    case 4:
                   	// ejercicio4();
                        break;
                    case 5:
                   	// ejercicio5();
                    break;
                    case 6:
                    	ejercicio6(); 
                     break;
                    case 7:
                   	// ejercicio7();  
                     break;
                    case 8:
                    	ejercicio8();
                     break;
                    case 9:
                    	ejercicio9();
                     break;
                    case 10:
                    	// ejercicio10();
                     break;
                    case 11:
                   	    System.out.println("saliendo ... ");
                     break;
                    default:
                        System.out.println("Opción inválida.");
                }
            
                } catch (Exception e) {
                    System.out.println("Debe ingresar un número válido.");
                    sc.nextLine(); 
                }
            }

        }
	
	
	
	public static void ejercicio1() {
		
		
		Docente doc1 = new Docente("armenio", 44, "anatomia");
		Estudiante est1 = new Estudiante("leyver",18,1243412);
		
		
		doc1.mostrar();
		est1.mostrar();
		
		
		
	}
	
	public static void ejercicio2() {
		
		
		CuentaCorriente cuen1 = new CuentaCorriente(1000,1000);
		cuen1.depositar(200);
		cuen1.retirar(2300);
		

		
		
	}
	public static void ejercicio6() {
		
	Perro perro1 = new Perro();	
		
	perro1.haceSonido();	
		
		
		
		
		
		
		
	}
	
	public static void ejercicio8() {
		
		Rectangulo rec1 = new Rectangulo("azul",3,2);
		
		rec1.area();
	}

	public static void ejercicio9() {
		
		LibroDigital lib1 = new LibroDigital("Homero","La Odisea",545.32);
		lib1.mostrarInfo();
		
		
	}
	
	
	
	
	
	
	
			
	}


