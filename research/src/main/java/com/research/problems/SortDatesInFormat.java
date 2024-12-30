package com.research.problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class SortDatesInFormat {
    public static void main(String[] args) {
        String[] dates = {"01/05/2022", "02/03/2023", "12/15/2021", "09/30/2022", "06/01/2022"};
        String format = "MM/dd/yyyy";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate[] parsedDates = new LocalDate[dates.length];

        for (int i = 0; i < dates.length; i++) {
            parsedDates[i] = LocalDate.parse(dates[i], formatter);
        }

        Arrays.sort(parsedDates);

        String[] sortedDates = new String[dates.length];

        for (int i = 0; i < parsedDates.length; i++) {
            sortedDates[i] = parsedDates[i].format(formatter);
        }

        System.out.println(Arrays.toString(sortedDates));
    }
}
