package HomeRaskLesson5;

public class HomeTaskLesson5 {

public static void main(String[] args) {

    Employee employee = new Employee("Kirill", "Speaker", "asd@mail.ru","89125167343",300,15);


    Employee employee1 = new Employee("Janna", "Secretary", "Jan@mail.ru", "8914432343", 310, 65);
    Employee [] stuffArray = new Employee[5];
                stuffArray[0] = new Employee("Kirill", "Speaker", "asd@mail.ru","89125167343",300,22);
                stuffArray[1] = new Employee("Katya", "Cleaner", "asd123@mail.ru","89125143243",200,49);
                stuffArray[2] = new Employee("August", "CEO", "ceo@mail.ru","89995167343",1000,50);
                stuffArray[3] = new Employee("Dmitriy", "Programmer", "gb@mail.ru","89125167666",400,29);
                stuffArray[4] = new Employee("Janna", "Secretary", "Jan@mail.ru", "8914432343", 310, 65);
                for (int i = 0; i<stuffArray.length; i++ ) {

                    if (stuffArray[i].getAge() > 40) stuffArray[i].printInfo();
                }

    System.out.print(employee.isRetired());
}

}
