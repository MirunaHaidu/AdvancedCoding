package e16;

public enum Runner {
    BEGINNER(300, 350),
    INTERMEDIATE(261, 299),
    ADVANCED(240, 260);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int result){
        if(result<=260){
            return ADVANCED;
        } else if(result >300){
            return BEGINNER;
        } else{
            return INTERMEDIATE;
        }
    }
}
