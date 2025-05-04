package com.aluracursos.screenmatch.modelos;

import java.io.FileWriter;

public class Pruebas{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("archivo");

            writer.write("Hello");
            writer.close();
            writer.write(" World!");
            writer.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}