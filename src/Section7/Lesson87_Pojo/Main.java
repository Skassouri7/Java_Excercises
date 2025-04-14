package Section7.Lesson87_Pojo;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 7; i++){
            LPAStudent s = new LPAStudent("IE00" + i,
                    switch (i){
                        case 0 -> "Soufiane";
                        case 1 -> "Harry";
                        case 2 -> "John";
                        case 3 -> "Sarah";
                        case 4 -> "Mary";
                        case 5 -> "Jack";
                        case 6 -> "Lisa";
                        case 7 -> "Ryan";
                        default -> "Anonymous";
                    }
                    ,
                    "02/02/2002",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("IE2334", "Soufiane", "05/12/1988", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("IE1325", "James", "23/02/1998", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    }
}
