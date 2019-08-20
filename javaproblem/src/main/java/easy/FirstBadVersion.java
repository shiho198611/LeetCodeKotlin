package easy;

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int index = n;
        boolean lastCheck = false;
        int lastCheckIndex = 0;

        while (true) {
            boolean check = isBadVersion(index);
            if(check) {
                lastCheckIndex = index;
                lastCheck = true;
                int newIndex = index / 2;

                if(newIndex < lastCheckIndex) {

                }
            }
            else {
                index = index + (lastCheckIndex - index)/2;
            }
        }

    }

}
