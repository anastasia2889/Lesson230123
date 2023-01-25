public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivan " + "Ivanovich " + "Ivanov";
        System.out.println("ФИО сотруудника " + fullName);
    }

    public static void task2() {
        System.out.println(" Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
    }

    public static void task3() {
            System.out.println("Задача 3");
            String fullName = "Иванов Семён Семёнович";
            fullName = fullName.replace("ё", "е");
            System.out.println("ФИО сотрудника — " + fullName);

    }
    }

