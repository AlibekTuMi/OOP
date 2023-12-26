package Seminar_3.Domen;

import java.util.Iterator;
import java.util.List;

public class IteratorStudents implements Iterator<Student>{
    private int count;
    private List<Student> students;

    /**
     * 
     * @param students - 
     */
    public IteratorStudents(List<Student> students) {
        this.students = students;
        
    }
    @Override
    public boolean hasNext() {
        return count < students.size();
    }
    @Override
    public Student next() {
        return students.get(count++);
    }
    
}
