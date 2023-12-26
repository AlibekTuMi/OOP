package Seminar_3.Domen;

import java.util.Iterator;
import java.util.List;

public class IteratorStudentsGroup implements Iterator<StudentsGroup>{
    private int count;
    private List<StudentsGroup> studentsGroup;

    /**
     * Реализовал интерфейс, с помощью которого через цикл можно вывести списки студенческих групп
     * @param studentsGroup - список студенческих групп
     */
    public IteratorStudentsGroup(List<StudentsGroup> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
    @Override
    public boolean hasNext() {
       return count < studentsGroup.size();
    }
    @Override
    public StudentsGroup next() {
        return studentsGroup.get(count++);
    }
    
}
