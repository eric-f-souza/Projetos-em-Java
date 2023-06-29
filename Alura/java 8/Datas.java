package testes;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2024, Month.JUNE, 5);
        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadasRio);

        System.out.println(periodo);
        System.out.println(Period.between(hoje, olimpiadasRio));

        olimpiadasRio.plusYears(4);

        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = olimpiadasRio.format(formatado);
        System.out.println(dataFormatada);

        DateTimeFormatter formatadoH = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora.format(formatado));

        LocalTime intervalo = LocalTime.of(15, 50);

        System.out.println(intervalo);

        LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);

        System.out.println(futuro);

        System.out.println(Period.between(LocalDate.now(), futuro));
    }
}
