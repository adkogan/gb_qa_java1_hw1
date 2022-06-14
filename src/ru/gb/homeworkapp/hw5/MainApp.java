package ru.gb.homeworkapp.hw5;

import java.awt.event.WindowFocusListener;

public class MainApp {

    public static void main(String[] args) {


        Employee employee = new Employee("Joe", "Dow", "developer", "Joe@mail.ru", 123454321, 340000, 43);
        employee.info();




        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov", "Ivan", "java developer", "ivanov@mail.ru", 123456789, 280000, 31);
        employeesArray[1] = new Employee("Fedorov","Fedor", "js developer", "fedorov@mail.ru", 123456788, 260000, 33);
        employeesArray[2] = new Employee("Petrov", "Petr", "Go developer", "petrov@mail.ru", 123456788, 290000, 36);
        employeesArray[3]= new Employee("Sergeev", "Sergey", "Cobol developer", "sergeev@mail.ru", 123456777, 200000, 56);
        employeesArray[4]= new Employee("Vasiliev", "Vasily", "Fortran developer", "vasiliev@mail.ru", 123455512, 130000, 61);



        for(int i=0; i< employeesArray.length; i++){
            if(employeesArray[i].getAge()>40){
                employeesArray[i].info();
            }
        }




    }
}
