package test;

import enumeracion.Dias;
import enumeracion.Continentes;

public class TestEnumeraciones {

    public static void main(String[] args) {

        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.VIERNES);
        System.out.println("Continente No.3: "+Continentes.AMERICA+" Paises: "+Continentes.AMERICA.getPaises());

    }

    private static void indicarDiaSemana(Dias dias) {

        switch (dias) {

            case LUNES: {
                System.out.println("Dia 1: " + Dias.LUNES);
                break;
            }
            case MARTES: {
                System.out.println("Dia 1: " + Dias.MARTES);
                break;
            }
            case MIERCOLES: {
                System.out.println("Dia 1: " + Dias.MIERCOLES);
                break;
            }
            case JUEVES: {
                System.out.println("Dia 1: " + Dias.JUEVES);
                break;
            }
            case VIERNES: {
                System.out.println("Dia 1: " + Dias.VIERNES);
                break;
            }
            case SABADO: {
                System.out.println("Dia 1: " + Dias.SABADO);
                break;
            }
            case DOMINGO: {
                System.out.println("Dia 1: " + Dias.DOMINGO);
                break;
            }
            default:
                System.out.println("Dia inexistente");

        }

    }

}
