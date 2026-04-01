//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    var allHours = 640;
    var shiftEmployee = 8;
    System.out.println("Всего работников в компании — " + (allHours/shiftEmployee) + " человек");
    var employees = allHours/shiftEmployee;
    var bigEmployees = employees + 94;
    var ultraAllHours = bigEmployees * 8;
    System.out.println("Если в компании работает " + bigEmployees + " человек(а), то всего " + ultraAllHours + " час(а/ов) работы может быть поделено между сотрудниками");
    }
