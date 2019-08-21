package easy;

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int max = n;
        int min = 1;
        int mid;

        while (min < max) {

            mid = min + (max - min)/2;

            if(isBadVersion(mid)) {
                max = mid;
            }
            else {
                min = mid+1;
            }
        }

        return max;
    }

}
