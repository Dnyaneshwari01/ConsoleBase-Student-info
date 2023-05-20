package Application2;



import java.util.Scanner;



public class MainApp1 {
    static Scanner sc = new Scanner(System.in);
    static BLclass b1 = new BLclass();
    private static int marks;

    public static void main(String[] args) {
        boolean status = true;
        do {
            System.out.println("1.ADD THE STUDENT");
            System.out.println("2.REMOVE STUDENT");
            System.out.println("3.DISPLAY STUDENT");//not done
            System.out.println("4.UPDATE STUDENTS SUBJECT");
            System.out.println("5.SEARCH STUDENT BY ID");
            System.out.println("6.DISPLAY STUDENT BY SUBJECT");//not done
            System.out.println("7.EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
//                    status = false;
                    removeStudent();
                    break;
                case 3:
                    displayStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    Search();
                    break;
                case 6:
                    searchBySub();
                    break;


                default:
                    System.out.println("INVALID CHOICE");
            }
        } while (status);
    }

    private static void searchBySub() {
        System.out.println("enter subject name");
        String name = sc.next();
        System.out.println("enter the student name");
        String studname = sc.next();
        b1.searchBySub(name);
        System.out.println("search by subject is done");
    }



    private static void Search() {
        System.out.println("enter id");
        int id=sc.nextInt();
        b1.search(id);
        System.out.println("search student successfully");
    }

    private static void displayStudent() {
        System.out.println("enter student id");
        int id= sc.nextInt();
        System.out.println("enter student subject");
        String name=sc.next();
        System.out.println("enter student fees");
        double fee= sc.nextDouble();
        b1.displayStudent();

        }
        public static void addStudent () {

            sc = new Scanner(System.in);
            System.out.println("ENTER STUDENT ROLL NO");
            int  rollno = sc.nextInt();
            System.out.println("ENTER NAME");
            String name = sc.next();
            System.out.println("ENTER STUDENTS MARKS");
            int marks=sc.nextInt();
            StudentDto s1 = new StudentDto(rollno, name, marks);
            b1.addData(s1);
            System.out.println("ADD SUCCESSFULLY");
        }




    public static Subject addSubject(){
        System.out.println("ENTER SUBJECT  ID");
        int id=sc.nextInt();
        System.out.println("ENTER THE NAME");
        String name=sc.next();
        System.out.println("ENTER THE FEES");
        double fees=sc.nextDouble();
         return new Subject(id,name,fees);



    }

private static void removeStudent(){

    System.out.println("Enter student ID to remove:");
    int id = sc.nextInt();

    b1.remove(id);
        System.out.println("Student removed successfully!");
    }

public static Subject UpdateSub(){
    System.out.println("enter student id");
    int id= sc.nextInt();
    System.out.println("enter student name");
    String name=sc.next();
    System.out.println("enter student fees");
    double fee=sc.nextDouble();
    Subject s=new Subject(id,name,fee);
    return  s;
}
    public  static void updateStudent(){
        System.out.println("enter student roll no");
        int rollno= sc.nextInt();
        System.out.println("enter student name");
        String name=sc.next();
        System.out.println("enter student marks");
        double mark=sc.nextDouble();
        System.out.println("enter subject name");
        String sub=sc.next();
        StudentDto s1=new StudentDto(rollno,name,marks);
        b1.update(rollno,name,marks);
        System.out.println("updated");
        Subject s=UpdateSub();
    }
}





