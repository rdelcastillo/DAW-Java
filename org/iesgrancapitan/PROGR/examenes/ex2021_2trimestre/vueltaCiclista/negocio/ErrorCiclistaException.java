package org.iesgrancapitan.PROGR.examenes.ex2021_2trimestre.vueltaCiclista.negocio;

@SuppressWarnings("serial")
public class ErrorCiclistaException extends IllegalArgumentException {

  public ErrorCiclistaException(String mensaje) {
    super(mensaje);
  }

}
