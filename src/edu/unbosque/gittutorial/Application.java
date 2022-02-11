package edu.unbosque.gittutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) {
        System.out.println("Bienvenido estudiante");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);

        try {
            System.out.print("Ingrese el nombre del estudiante: ");
            String name = br.readLine();

            Student student = new Student();
            student.setName(name);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
