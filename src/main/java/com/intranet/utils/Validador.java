package com.intranet.utils;

public class Validador {
    public static String esCorreoValido(String correo) {
        if (correo == null || correo.isBlank()) {
            return "El correo no puede estar vacío.";
        }

        // Regex estándar para correos electrónicos
        String regexCorreo = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (!correo.matches(regexCorreo)) {
            return "El formato del correo es inválido.";
        }

        return "OK";
    }

    public static boolean esPasswordValido(String password) {
        return password != null && password.length() >= 8;
    }

    public static String esPasswordSegura(String password) {
        if (password.length() < 8) {
            return "La contraseña debe tener al menos 8 caracteres.";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "La contraseña debe contener al menos una letra mayúscula.";
        }
        if (!password.matches(".*[a-z].*")) {
            return "La contraseña debe contener al menos una letra minúscula.";
        }
        if (!password.matches(".*\\d.*")) {
            return "La contraseña debe contener al menos un número.";
        }
        if (!password.matches(".*[@$!%*?&].*")) {
            return "La contraseña debe contener al menos un carácter especial (@$!%*?&).";
        }
        return "OK";
    }
}
