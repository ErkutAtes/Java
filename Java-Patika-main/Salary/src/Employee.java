public class Employee {

String name;
int salary;
int workHours;
int hireYear;

//Kurucu method tanımlama
Employee(String name,int salary,int workHours,int hireYear){
    this.name = name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;

}

//Vergi hesaplama method
public int tax(){
/*Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.*
/*Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.*/

    int taxCost;
    if(this.salary <= 1000){
        taxCost = 0;
    }
    else {
        taxCost = (this.salary * 3) / 100;
    }

    return taxCost;
}


//Bonus hesaplama method
public int bonus(){
    int bonusHours , totalBonus;

    if(this.workHours >= 40){
        bonusHours = workHours - 40;
        totalBonus = bonusHours * 30;
    }
    else{
        bonusHours = 0;
        totalBonus = 0;
    }

    return totalBonus;
}

//Maaş zammı hesaplama
public int riseSalary(){
    int time , totalRise;
    time = this.hireYear - 2021;

    if (time > 9 && time < 20){
        totalRise = (this.salary * 10) / 100;
    }
    else if (time > 10){
        totalRise = (this.salary * 5) / 100;
    }
    else {
        totalRise = (this.salary * 15) / 100;
    }
    return totalRise;
}


public void printEmployee(){

    int bonusAndTax;
    System.out.printf("Ad :%s\n",name);
    System.out.printf("Maaşı :%d\n",salary);
    System.out.printf("Çalışma Saati :%d\n",workHours);
    System.out.printf("BAşlangıç Yılı :%d\n",hireYear);

    System.out.printf("Vergi :%d\n",tax());
    System.out.printf("Bonus: %d\n",bonus());
    System.out.printf("Maaş artışı :%d\n",riseSalary());


    bonusAndTax = this.salary - tax() + bonus();
    System.out.printf("Vergi ve Bonuslar ile birlikte maaş :%d\n",bonusAndTax);

    System.out.printf("Toplam Maaş :%d\n",this.salary - tax() + bonus() + riseSalary());

}















}
