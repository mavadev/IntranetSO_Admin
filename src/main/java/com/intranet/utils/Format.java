package com.intranet.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Format {
    public static LocalDate stringToLocalDate(String fechaStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fecha = LocalDate.parse(fechaStr, formatter);
            return fecha;
        } catch (Exception e) {
            AlertUtils.showWarning("Hubo un error al parsear la fecha");
            return null;
        }
    }
}
