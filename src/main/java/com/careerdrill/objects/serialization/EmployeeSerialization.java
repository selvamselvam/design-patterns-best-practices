package com.careerdrill.objects.serialization;

import java.io.*;

public class EmployeeSerialization {


    public static void main(String[] args) {
        Employee e = new Employee("siva", 11);
        String filename = "employee.ser";

        serializationFile(filename, e);

        DeserializationFile(filename);


    }


    private static void serializationFile(String filename, Employee e) {
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(e);
            objectOutputStream.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        System.out.println("Object has been serialized");
    }

    private static void DeserializationFile(String filename) {
        Employee e = null;
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            e = (Employee) objectInputStream.readObject();
            objectInputStream.close();

        } catch (IOException | ClassNotFoundException ioException) {
            ioException.printStackTrace();
        }
        System.out.println(e.getEmpID() + ":" + e.getName());


    }
}
