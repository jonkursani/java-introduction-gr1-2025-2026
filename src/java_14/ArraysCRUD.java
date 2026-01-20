void main() {
    Scanner sc = new Scanner(System.in);

    // 1.
    System.out.print("Sa studente jane ne klase: ");
    int nrStudents = Integer.parseInt(sc.nextLine());
//    int nrStudents = sc.nextInt();

    String[] students = new String[nrStudents];

    // 2.
    fillStudents(students);

    // 3.
    final String STOP = "stop";
    String userInput = "";

    // Iteron perderisa useri nuk e shkrun stop
    while (!userInput.equalsIgnoreCase(STOP)) {
        System.out.println("====================================");
        System.out.println("1 - Listo te gjithe studentet");
        System.out.println("2 - Gjej dhe shfaq nje student sipas emrit");
        System.out.println("3 - Perditeso emrin e nje studenti ekzistues");
        System.out.println("4 - Fshij nje student nga lista");
        System.out.println("stop - Ndalo programin dhe shiko listen finale");
        System.out.println("====================================");

        userInput = sc.nextLine().trim();

        switch (userInput) {
            case "1" -> {
                System.out.println("Lista e studenteve: ");
                printStudents(students);
            }
            case "2" -> {
                String studentName;
                do {
                    System.out.print("Shkruani emrin e studentit qe po kerkoni: ");
                    studentName = sc.nextLine();
                } while (studentName.isBlank()); // validim qe mos me pranu emer empty ""

                String studentFromArray = getStudent(students, studentName);
                System.out.println(studentFromArray);
            }
            case "3" -> {
                String oldName;
                do {
                    System.out.print("Shkruani emrin e studenti qe deshironi ta perditesoni: ");
                    oldName = sc.nextLine();
                } while (oldName.isBlank());

                String newName;
                do {
                    System.out.print("Shkruani emrin e perditesuar: ");
                    newName = sc.nextLine();
                } while (newName.isBlank());

                updateStudent(students, oldName, newName);
            }
            case "4" -> {
                String name;
                do {
                    System.out.print("Shkruani emrin e studentit qe deshironi ta fshini: ");
                    name = sc.nextLine();
                } while (name.isBlank());

                deleteStudent(students, name);
            }
            case STOP -> {
                System.out.println("============ Ndaluat programin kjo eshte lista finale ============");
                printStudents(students);
            }
        }
    }
}

//public static void fillStudents(String[] array) {
public void fillStudents(String[] array) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < array.length; i++) {
        System.out.printf("Krijoni studentin %d: ", i + 1);
        array[i] = sc.nextLine();
    }
}

public void printStudents(String[] array) {
    for (String st : array) {
        System.out.print(st + " ");
    }
    System.out.println();
}

public int findIndex(String[] array, String name) {
    for (int i = 0; i < array.length; i++) {
        // nese e kemi gjet indeksin
        if (array[i].equalsIgnoreCase(name)) {
            return i;
        }
    }

    // nese nuk e kemi gjet indeksin
    return -1;
}

public String getStudent(String[] array, String name) {
    int index = findIndex(array, name);

    if (index != -1) {
        return "Studenti: " + array[index];
    } else {
        return "Studenti me kete emer nuk u gjet";
    }
}

public void updateStudent(String[] array, String oldName, String newName) {
    int index = findIndex(array, oldName);

    if (index != -1) {
        array[index] = newName;
        System.out.println("Studenti u perditesua");
    } else {
        System.out.println("Studenti me kete emer nuk u gjet");
    }
}

public void deleteStudent(String[] array, String name) {
    int index = findIndex(array, name);

    if (index != -1) {
        array[index] = "";
        System.out.println("Studenti u fshi me sukses");
    } else {
        System.out.println("Studenti me kete emer nuk u gjet");
    }
}