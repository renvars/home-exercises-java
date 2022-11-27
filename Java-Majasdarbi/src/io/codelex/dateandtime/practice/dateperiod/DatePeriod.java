package io.codelex.dateandtime.practice.dateperiod;

import io.codelex.classesandobjects.practice.date.Date;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod date) {
        //Check if dates even overlap
        if (end.isBefore(date.start) || date.end.isBefore(start)) {
            return null;
        }
        LocalDate overlapStar;
        LocalDate overlapEnd;
        if (start.isBefore(date.start)) {
            overlapStar = date.start;
        } else {
            overlapStar = start;
        }
        if (end.isBefore(date.end)) {
            overlapEnd = end;
        } else {
            overlapEnd = date.end;
        }


        return new DatePeriod(overlapStar, overlapEnd);
    }


    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }
}
