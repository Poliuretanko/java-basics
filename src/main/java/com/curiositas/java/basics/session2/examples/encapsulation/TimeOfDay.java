package com.curiositas.java.basics.session2.examples.encapsulation;

public enum TimeOfDay {
    Morning(5, 11, "Good morning"),
    Afternoon(11, 18, "Good afternoon"),
    Evening(18, 21, "Good evening"),
    Night(21, 5, "Good night");

    private final int firstHourExclusive;
    private final int lastHourInclusive;
    private final String wish;

    TimeOfDay(int firstHourExclusive, int lastHourInclusive, String wish) {
        this.firstHourExclusive = firstHourExclusive;
        this.lastHourInclusive = lastHourInclusive;
        this.wish = wish;
    }

    public String getWish() {
        return wish;
    }

    public static TimeOfDay get(int hour) {
        for (TimeOfDay timeOfDay : TimeOfDay.values()) {
            if (hour > timeOfDay.firstHourExclusive && hour <= timeOfDay.lastHourInclusive) {
                return timeOfDay;
            }
        }
        return Night;
    }
}
