public class Main {
    public static void main(String[] args) {
        //task1
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //task2
        String fullNameUp = fullName.toUpperCase();
        System.out.println(fullNameUp);

        //task3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName1);
    }
}

