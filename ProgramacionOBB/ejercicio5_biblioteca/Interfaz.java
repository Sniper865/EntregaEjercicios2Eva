package ejercicio5_biblioteca;

import java.util.Scanner;

import ejercicio2_fecha.Fecha;

public class Interfaz {
    private Scanner sc = new Scanner(System.in);
    public void Menu() {
        int nLibro = 0, elecciones = 0;
        Libro libros[] = new Libro[10];
        Persona personas[] = new Persona[10];
        Fecha fechas[] = new Fecha[10];
        String interfaz = "\n"+" ================| Menu de libros |================" + "\n" +
                "1. Crear un libro nuevo (persona, libro y fecha)" + "\n" +
                "2. Mostrar informacion del autor de un libro" + "\n" +
                "3. Modificar informacion de un autor" + "\n" +
                "4. Mostar la informacion de una fecha" + "\n" +
                "5. Modificar la informacion de una fecha" + "\n" +
                "6. Mostrar la informacion de un libro" + "\n" +
                "7. Modificar informacion del libro" + "\n" +
                "8. Eliminar un libro" + "\n" +
                "9. Salir" + "\n" +
                ""+"\n" +
                "Se pueden crear un maximo de 10 libros" + "\n" +
                "===================================================";
        int eleccion = 0;
        while (eleccion != 9) {
            System.out.println(interfaz);
            System.out.println("Cantidad de libros creados: "+ Libro.getCreados());
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                if (Libro.getCreados() < 10){
                    if (Libro.getCreados() > 0 && Libro.getCreados() < 10) {
                        nLibro++;
                    }
                    personas[nLibro] = new Persona("Indefinido", "indefinido", "indefinido");
                    fechas[nLibro] = new Fecha(0, 0, 0);
                    libros[nLibro] = new Libro("indefinido", "indefinido", "indefinido", "indefinido", "indefinido");
                    libros[nLibro].setFecha(fechas[nLibro]);
                    libros[nLibro].setAutor(personas[nLibro]);
                    }
                    else if(Libro.getCreados() >= 9){
                        System.out.println("\n"+"Ya no puedes crear mas libros, has llegado al limite!!");
                    }

                    break;
                case 2:
                    System.out.println("\n"+"De que autor quieres ver la informacion");
                    elecciones = sc.nextInt();
                    while (elecciones > Libro.getCreados()){
                        System.out.println("Ese autor no existe, escribe de nuevo el autor que quieres ver");
                        elecciones = sc.nextInt();
                    }
                    elecciones = elecciones - 1;
                    System.out.println(personas[elecciones].toString());
                    break;
                case 3:
                    System.out.println("\n"+"De que autor quieres modificar la informacion");
                    elecciones = sc.nextInt();
                    while (elecciones > Libro.getCreados()){
                        System.out.println("Ese autor no existe, escribe de nuevo el autor que quieres modificar");
                        elecciones = sc.nextInt();
                    }
                    elecciones = elecciones - 1;
                    sc.nextLine();
                    System.out.println("\n"+"La informacion actual es:");
                    System.out.println(personas[elecciones].toString());
                    System.out.println("\n"+"Introduce el nuevo nombre");
                    personas[elecciones].setNombre(sc.nextLine());
                    System.out.println("\n"+"Escribe el nuevo primer apellido");
                    personas[elecciones].setApellido1(sc.nextLine());
                    System.out.println("\n"+"Escribe el nuevo segundo apellido");
                    personas[elecciones].setApellido2(sc.nextLine());
                    System.out.println("\n"+"Informacion final modificada del autor " + elecciones + "es: "+"\n" +personas[elecciones].toString());
                    break;
                case 4:
                    System.out.println("\n"+"De que libro quieres ver la fecha");
                    while (elecciones > Libro.getCreados()){
                        System.out.println("Esa fecha no existe, escribe de nuevo la fecha que quieres ver");
                        elecciones = sc.nextInt();
                    }
                    elecciones = sc.nextInt();
                    elecciones = elecciones - 1;
                    System.out.println(fechas[elecciones].toString());
                    break;
                case 5:
                    System.out.println("\n"+"Que fecha quieres modificar");
                    elecciones = sc.nextInt();
                    while (elecciones > Libro.getCreados()){
                        System.out.println("Esa fecha no existe, escribe de nuevo la fecha que quieres modificar");
                        elecciones = sc.nextInt();
                    }
                    elecciones = elecciones - 1;
                    System.out.println("\n"+"La informacion actual es: ");
                    System.out.println(fechas[elecciones].toString());
                    System.out.println("\n"+"Introduce el año nuevo");
                    fechas[elecciones].setAnno(sc.nextInt());
                    System.out.println("\n"+"Introduce el mes nuevo");
                    fechas[elecciones].setMes(sc.nextInt());
                    System.out.println("\n"+"Introduce el dia nuevo");
                    fechas[elecciones].setDia(sc.nextInt());
                    System.out.println("\n"+"La informacion actualizada es: "+"\n"+
                                        fechas[elecciones].toString());

                    break;
                case 6:
                    System.out.println("\n"+"De que libro quieres ver la informacion");
                    elecciones = sc.nextInt();
                    while (elecciones > Libro.getCreados()){
                        System.out.println("Ese libro no existe, escribe de nuevo el libro que quieres ver");
                        elecciones = sc.nextInt();
                    }
                    elecciones = elecciones - 1;
                    System.out.println("\n"+"Esta es la informacion del libro numero"+eleccion);
                    System.out.println(libros[elecciones].toString());
                    break;
                case 7:
                    System.out.println("\n"+"De que libro quieres modificar la informacion");
                    elecciones = sc.nextInt();
                    sc.nextLine();
                    while (elecciones > Libro.getCreados()){
                        System.out.println("Ese libro no existe, escribe de nuevo el libro que quieres modificar");
                        elecciones = sc.nextInt();
                    }
                    elecciones = elecciones - 1;
                    System.out.println("Esta es la informacion actual: "+"\n"+libros[elecciones].toString());
                    System.out.println("Introduce el nuevo titulo del libro");
                    libros[elecciones].setTitulo(sc.nextLine());
                    System.out.println("\n"+"Introduce el nuevo ISBN");
                    libros[elecciones].setIsbn(sc.nextLine());
                    System.out.println("\n"+"Introduce el nuevo editorial");
                    libros[elecciones].setEditorial(sc.nextLine());
                    System.out.println("\n"+"Introduce la nueva ciudad");
                    libros[elecciones].setCiudad(sc.nextLine());
                    System.out.println("\n"+"Introduce el nuevo pais");
                    libros[elecciones].setPais(sc.nextLine());
                    System.out.println("\n"+"Esta es la informacion actualizada de los datos del libro "+elecciones+"\n"+
                    libros[elecciones].toString());
                    break;
                case 8:
                    System.out.println("Que libro deseas eliminar?");
                    elecciones = sc.nextInt();
                    elecciones = elecciones-1;
                    for (int i = elecciones; i < Libro.getCreados()-1;i++){
                        libros[i] = libros[i+1];
                        libros[i].setAutor(personas[i+1]);
                        libros[i].setFecha(fechas[i+1]);
                    }
                    Libro.restarCreados();
                    break;
                case 9:
                    System.out.println("Gracias por usar mi sistema de libros");
            }
        }
    }
}
