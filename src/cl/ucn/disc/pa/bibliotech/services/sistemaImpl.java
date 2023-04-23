/*
 * Copyright (c) 2023. Programacion Avanzada, DISC, UCN.
 */

package cl.ucn.disc.pa.bibliotech.services;

import java.io.IOException;

public interface sistemaImpl {

    boolean verificarContrasenia(String contrasenia);

    void iniciarSession(final int numeroDeSocio, final String contrasenia);

    void cerrarSession();

    void realizarPrestamoLibro(final String isbn) throws IOException;

    String obtegerCatalogoLibros();

    String obtenerDatosSocioLogeado();

}
