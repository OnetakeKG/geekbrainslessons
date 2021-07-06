package HomeRaskLesson5;
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
public class Employee {
  //ФИО, должность, email, телефон, зарплата, возраст
  private String name;
  private String position;
  private String email;
  private String phoneNumber;
  private String gender;
  private int salary;
  private int age;

  public void printInfo() {
    System.out.printf("Employee: name - %s, position - %s, email - %s, phoneNumber - %s, salary - %d, age - %d\n",
            this.name, this.position, this.email, this.phoneNumber, this.salary, this.age);


  }
  public int getAge() {
    return age;
  }



  public Employee (String name, String position, String email, String phoneNumber, int salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.age = age;
    this.salary = salary;
  }

  public Boolean isRetired () {
  return (this.age > 63 && this.gender.equals("male") || this.age > 60 && this.gender.equals("female"));

  }


}
