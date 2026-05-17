
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length ; ++i)
            {
                if(birdsPerDay[i] == 0) return true;
            }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int cnt = 0;
        if(numberOfDays <= birdsPerDay.length ){
            for(int i = 0; i < numberOfDays ; ++i)
            {
                cnt += birdsPerDay[i];
            }
        }
        else 
        {
            for(int num : birdsPerDay)
                {
                    cnt += num;
                }
        }
        return cnt;
    }

    public int getBusyDays() {
        int cnt = 0;
        for(int num : birdsPerDay)
            {
                if(num >= 5) cnt++;
            }
        return cnt;
    }
}
