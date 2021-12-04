package Array;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] a = {0, 0};
        for (int i=0;i<students.length;i++)
            a[students[i]]+=1;

        int k = 0;
        while (k < sandwiches.length){
            if (a[sandwiches[k]] > 0)
                a[sandwiches[k]]-=1;
            else
                break;
            k+=1;
        }
        return sandwiches.length-k;
    }
}
