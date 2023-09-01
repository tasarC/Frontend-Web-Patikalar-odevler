package Employee;

public class Employee {
     String name ;
     double salary ;
     double workHours ;
     int hireYear;

     Employee( String name , double salary , double workHours , int hireYear){
          this.name = name;
          this.salary = salary;
          this.workHours = workHours;
          this.hireYear = hireYear;
     }

     public double tax(){

          if(this.salary < 1000 ){

               return 0;
          }else {

               return salary*0.03;
          }
     }

     public double bonus(){
          if(workHours>40){
               double ekMesayiUcreti = workHours-40;
               return ekMesayiUcreti*30;
          }else{
               return 0;
          }
     }
     public void raiseSalary(){
          double yil = 2023-hireYear;
          if(yil<10){
               salary += salary*0.05;
          } else if (yil>=10 && yil<20) {
               salary += salary*0.1;
          }else salary += salary * 0.15;
     }
     public String toString(){
          return " \n Adı: " + name + "\n Başlangıç Yılı: " + hireYear+"\n Haftalık Çalışma Saati: " + workHours +"\n Vergi:"+tax()+"\n Bonus:"+bonus()+ "\n Maaşı: " + salary ;
     }

}
