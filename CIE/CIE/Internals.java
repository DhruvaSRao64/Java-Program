package CIE;

public class Internals {
    public int[] internalMarks = new int[5];

    public Internals(int[] marks) {
        if (marks.length == 5) {
            System.arraycopy(marks, 0, internalMarks, 0, 5);
        } else {
            throw new IllegalArgumentException("There must be exactly 5 internal marks.");
        }
    }
}

