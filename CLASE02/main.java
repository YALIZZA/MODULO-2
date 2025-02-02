package CLASE02;

import CLASE01.book;
public class main {


    public static void main(String[] args) {

      Employee empleado1 = new Employee("Yalizza", 1100974147, 2200000);
      Employee empleado2 = new Employee("Elayne", 1100974140, 6200000);
      Manager gerente1 = new Manager("ana", 28284128, 100000000, "DEVSENIOR");
      System.out.println(empleado1.toString());

      empleado1.IncreaseSalary(12);

      System.out.println(empleado1.toString());

      empleado1.setSalary(0);

      System.out.println(empleado1.toString());

      System.out.println(empleado1.hashCode());
      System.out.println(empleado2.hashCode());

      System.out.println(empleado1.equals(empleado2));

      System.out.println(gerente1.toString());

    }
    
}
