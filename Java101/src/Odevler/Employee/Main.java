package Employee;

public class Main {
   public static void main(String[] args){
       Employee isci = new Employee("Ahmet",2000,45,1985);
       isci.tax();
       isci.bonus();
       isci.raiseSalary();

       System.out.println(isci.toString());
   }
}
