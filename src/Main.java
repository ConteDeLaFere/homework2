
public class Main {

    public static void main(String[] args) {
        //TASK 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("TASK 1\ndog = " + dog + "\ncat = " + cat + "\npaper = " + paper);
        System.out.println("---------------------------------------------------------");

        //TASK 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("TASK 2\ndog = " + dog + "\ncat = " + cat + "\npaper = " + paper);
        System.out.println("---------------------------------------------------------");

        //TASK 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("TASK 3\ndog = " + dog + "\ncat = " + cat + "\npaper = " + paper);
        System.out.println("---------------------------------------------------------");

        //TASK 4
        System.out.println("TASK 4");
        var friend = 19;

        System.out.println("1) friend = " + friend);
        friend *= 2;
        System.out.println("2) friend = " + friend);
        friend /= 7;
        System.out.println("3) friend = " + friend);
        System.out.println("---------------------------------------------------------");

        //TASK 5
        System.out.println("TASK 5");
        var frog = 3.5;
        System.out.println("1) frog = " + frog);
        frog *= 10;
        System.out.println("2) frog = " + frog);
        frog /= 3.5;
        System.out.println("3) frog = " + frog);
        frog += 4;
        System.out.println("4) frog = " + frog);
        System.out.println("---------------------------------------------------------");

        //TASK 6
        System.out.println("TASK 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var sum = boxerWeight1 + boxerWeight2;
        System.out.println("Total weight is - " + sum);
        var difference = boxerWeight2 - boxerWeight1;
        System.out.println("Weight difference is - " + difference);
        System.out.println("---------------------------------------------------------");

        //TASK 7
        System.out.println("TASK 7");
        System.out.println("Weight difference is - " + difference); //Look at TASK 6
        var difference2 = boxerWeight2 % boxerWeight1; //using the remainder operator
        System.out.println("Weight difference is - " + difference2);
        System.out.println("---------------------------------------------------------");

        //TASK 8
        System.out.println("TASK 8");
        var totalEmployeesTime = 640;
        var timeOfAnEmployee = 8;
        var employeesNumber = totalEmployeesTime / timeOfAnEmployee;
        System.out.println("Всего сотрудников в компании - " + employeesNumber);

        var employeesNumber2 = employeesNumber + 94;
        var timeOfAnEmployee2 = totalEmployeesTime / employeesNumber2;
        System.out.println("Если в компании работает " + employeesNumber2 + " человека, то всего " + timeOfAnEmployee2 + " часа работы может быть поделено между сотрудниками");

    }
}