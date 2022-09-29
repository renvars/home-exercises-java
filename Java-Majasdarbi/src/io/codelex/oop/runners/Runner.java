package io.codelex.oop.runners;

enum Runner {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED;
    int MARATHON_MIN;
    int MARATHON_MAX;


    static Runner getFitnessLevel(int minutesMarathon) {
        if (minutesMarathon < 180) {
            return ADVANCED;
        } else if (minutesMarathon < 240) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }
}
