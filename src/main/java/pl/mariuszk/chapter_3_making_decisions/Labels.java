package pl.mariuszk.chapter_3_making_decisions;

public class Labels {

    public Labels() {
        int i = 0;
        A_VALID_LABEL: if (i < 4)
        ALSO_A_VALID_LABEL: {

        }

        // 'break' control statement with label allows to transfer control to the loop with given label (terminating it).
        // 'break' control statement without label only terminates the nearest inner loop.
        // The same applies to the 'continue' control statement, but instead of terminating the loop - the control is
        // transferred to the boolean expression that determines if the loop should continue.
        int j = 5;
        LOOP: while (j > 0) {
            int k = 5;
            AA: while (k > 0) {
                if (k == 3) {
                    break LOOP;
                }
                k--;
            }
            j--;
        }
    }
}
