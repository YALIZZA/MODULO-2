package CLASE02;

public class Employee {

    private String name;
    private int Id;
    private double salary;

    public Employee (String name, int Id, double salary) {
     //recibe todo los atributos (los que yo quiera )
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("El salario no puede ser menor  cero.");
        }
        
    }

      public void IncreaseSalary(double percentaje){
         salary += (salary * percentaje / 100);
         // operador ternario -logico 
      //  double valor = (percentaje > 0) ? salary : 1300000 ;

      }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", Id=" + Id + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Id;
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Id != other.Id)
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }


}
