package Seminar_3.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentsGroup implements Iterable<Student>, Comparable<StudentsGroup> {
    private int numbGroup;

    List<Student> students;

    /*
     * @param numbGroup - номер группы
     */
    public StudentsGroup(int numbGroup, List<Student> students) {
        this.numbGroup = numbGroup;
        this.students = students;
    }

    public int getNumbGroup() {
        return numbGroup;
    }

    public void setNumbGroup(int numbGroup) {
        this.numbGroup = numbGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    // Переопределил метод, в котором теперь можно вывести идентификатор группы, количество студентов и список студентов(создаю пустую строку, 
    // в которую добавляю через цикл список студентов в столбик)
    @Override
    public String toString() {
        String listStudents = "";
        for (Student student : students) {
            listStudents+=student;
            listStudents+="\n";
        }
        return String.format("Id группы %d, Количество студентов в группе - %d, Список студентов:\n\n%s", getNumbGroup(), getStudents().size(), listStudents);
    }

    @Override
    public Iterator<Student> iterator() {
        return new IteratorStudents(students);
    }
    // Реализовал интерфейс, с помощью которого сортирую группы по количеству студентов, 
    // И отдельно закомментирован метод если количество студентов совпадает, то сортирую по идентификатору группы группы
    @Override
    public int compareTo(StudentsGroup o) {
        
        if (this.getStudents().size() < o.getStudents().size()) {
            return -1;
        } else if (this.getStudents().size() > o.getStudents().size()) {
            return 1;
        }
        // if (this.getNumbGroup() < o.getNumbGroup()) {
        //     return -1;
        // } else if (this.getNumbGroup() > o.getNumbGroup()) {
        //     return 1;
        // }
        return 0;
    }
    
}
