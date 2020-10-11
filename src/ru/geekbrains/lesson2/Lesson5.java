package ru.geekbrains.lesson2;

public class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0]  = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
        persArray[1]  = new Person("Ivanov Sergey", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[2]  = new Person("Ivanov Petr", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        persArray[3]  = new Person("Ivanov Lev", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        persArray[4]  = new Person("Ivanov Maxim", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 60);
        for (Person person : persArray) {
            if (person.GetAge() > 40) {
                person.info();
            }
        }
    }
}
