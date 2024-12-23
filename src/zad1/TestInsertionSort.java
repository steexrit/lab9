public class TestInsertionSort {
    public static void main(String[] args) {
        // Создание массива студентов
        Student[] students = {
                new Student(3, "Глеб"),
                new Student(1, "Аня"),
                new Student(2, "Гоша"),
                new Student(5, "Паша"),
                new Student(4, "Сергей"),
                new Student(6, "Матвей")
        };

        // Печать изначального массива
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка массива студентов по IDNumber методом вставок
        insertionSort(students);

        // Печать отсортированного массива
        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            // Сдвиг элементов массива, если они больше ключа
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }

            // Вставляем ключ на правильное место
            students[j + 1] = key;
        }
    }
}