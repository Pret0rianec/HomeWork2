//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    // Task1
    System.out.println("Task1 Выведите значения");
    var dog = 8.0;
    System.out.println(dog);
    var cat = 3.6;
    System.out.println(cat);
    var paper = 763789;
    System.out.println(paper);

    // Task2
    System.out.println("Task2 Увеличьте значение на 4");
    System.out.println(dog + 4);
    System.out.println(cat + 4);
    System.out.println(paper + 4);

    // Task3
    System.out.println("Task3 Уменьшить значение");
    System.out.println(dog - 3.5);
    System.out.println(cat - 1.6);
    System.out.println(paper - 7639);

    // Task4
    System.out.println("Task4 Инициализируйте (присвойте значение)");
    var friend = 19;
    System.out.println(friend);
    System.out.println(friend * 2);
    System.out.println(friend * 2 / 7);

    // Task5
    System.out.println("Task5 Инициализируйте переменную frog");
    var frog = 3.5;
    System.out.println(frog);
    System.out.println(frog * 10);
    System.out.println(frog * 10 / 3.5);
    var frogBigSum = frog * 10 / 3.5;
    System.out.println(frogBigSum + 4);

    // Task6
    System.out.println("Task6 BOX");
    var boxer1 = 78.2;
    var boxer2 = 82.7;
    System.out.println((boxer1 + boxer2));
    System.out.println((boxer2 - boxer1));

    // Task7
    System.out.println("Task7 остаток от деления между двумя весами");
    System.out.println((boxer2 % boxer1));

    // Task8
    System.out.println("Task8 арифметических функции");
    var allHours = 640;
    var shiftEmployee = 8;
    System.out.println("Всего работников в компании — " + (allHours / shiftEmployee) + " человек");
    var employees = allHours / shiftEmployee;
    var bigEmployees = employees + 94;
    var ultraAllHours = bigEmployees * 8;
    System.out.println("Если в компании работает " + bigEmployees + " человек(а), то всего " + ultraAllHours + " час(а/ов) работы может быть поделено между сотрудниками");
}
