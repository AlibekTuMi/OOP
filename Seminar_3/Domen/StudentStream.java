package Seminar_3.Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentsGroup> {
    private int numbStream;
    List<StudentsGroup> studentStream;
    private static int countStream;
    static{
        countStream = 0;
    }
    /**
     *Добавил Класс студенческого потока с полем номера потока
     @param numbStream - номер потока
     @param studentStream - список студенческого потока
     */
    public StudentStream() {
        studentStream = new ArrayList<>();
        countStream++;
        numbStream = countStream;
    }

    @Override
    public Iterator<StudentsGroup> iterator() {
        return new IteratorStudentsGroup(studentStream);
    }

    public int getNumbStream() {
        return numbStream;
    }

    public void setNumbStream(int numbStream) {
        this.numbStream = numbStream;
    }

    public List<StudentsGroup> getStudentStream() {
        return studentStream;
    }

    public void setStudentStream(List<StudentsGroup> studentStream) {
        this.studentStream = studentStream;
    }
    // с помощью данного метода добавляю в поток (studentStream) каждую группу
    public void add(StudentsGroup a) {
        studentStream.add(a);
    }
    //  реализовал метод, с помощью которого выводится номер потока, количество групп и список студентов через цикл с указанием идентификатора группы с новой строки
    @Override
    public String toString() {
        String listStudentsGroup = "";
       for (StudentsGroup studentsGroup : studentStream) {
        listStudentsGroup+=studentsGroup+"\n";
       
       }
        return String.format("Номер потока - %d, Количество групп - %d, Список групп:\n\n%s", getNumbStream(), countStream, listStudentsGroup);
    }

}
