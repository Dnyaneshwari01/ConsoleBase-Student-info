package Application2;

import Application1.Customer;

import java.util.ArrayList;
import java.util.List;

import static Application2.MainApp1.b1;
import static Application2.MainApp1.sc;

public class BLclass {
    private static List<StudentDto> data = new ArrayList<>();
    private static List<Subject> data2 = new ArrayList<>();

    {
        data.add(new StudentDto(1, "vanita", 300));
    }

    {
        data2.add(new Subject(101, "math", 300));
    }

    public void addData(StudentDto s) {
        data.add(s);

    }

    //display
    public void displayStudent() {
        for (StudentDto s : data) {
            System.out.println(s.getName());
            System.out.println(s.getRollno());
            System.out.println(s.getMarks());
        }
    }

    public void remove(int id) {
        for (int i = 0; i < data.size(); i++) {
            if (id == data.get(i).getRollno()) {
                data.remove(i);
            }
        }
    }

    public void update(int rollno, String name, double mark) {
        for (int i = 0; i < data.size(); i++) {
            if (rollno == data.get(i).getRollno()) {
                data.get(i).setName(name);
                data2.get(i).setMark(mark);
            }
        }
    }

    public void search(int id) {
        for (int i = 0; i < data.size(); i++) {
            boolean status = true;
            if (status) {
                if (id == data.get(i).getRollno()) {
                    data.contains(i);
                    for (StudentDto s : data) {
                        System.out.println(s.getName());
                        System.out.println(id == s.getRollno());
                        System.out.println(s.getMarks());
                    }
                }
            }


            }
        }

    public void searchBySub(String name) {
        for (StudentDto s:data){
            if(s.getSubject().getClass().equals(name)){
                System.out.println(s.getName());
                System.out.println(s.getMarks());
            }
    }
}
}

