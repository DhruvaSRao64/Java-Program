package SEE;
import CIE.Student;

public class External extends Student {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        if (marks.length == 5) {
            System.arraycopy(marks, 0, seeMarks, 0, 5);
        } else {
            throw new IllegalArgumentException("There must be exactly 5 SEE marks.");
        }
    }
}


