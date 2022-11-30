package ru.avalon.dev_j200_lab_1.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private final static String PATTERN = "yyyy-MM-dd";

    public static Date getFormattedDate(String date) throws ParseException {
        return new SimpleDateFormat(PATTERN).parse(date);
    }
}
