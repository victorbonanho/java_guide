package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Operacoes {

	public static void main(String[] args) {
		// INSTANCIAÇÃO
		// (Agora) -> Data-hora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		// Texto ISO 8601 ->  Data-hora
		// Texto formato customizado -> Data-hora
		// dia, mês, ano , [horário] -> Data-hora local
		
		//FORMATAÇÃO
		//Data-hora -> Texto ISO 8601
		
		//OBTER DADOS DE UMA DATA-HORA LOCAL
		// Data-hora local -> dia, mês, ano, horário
		
		//CONTERTER DATA-HORA GLOBAL PARA LOCAL
		//Data-hora glgobal, timezone (sistema local) -> Data-hora local
		
		//CÁLCULOS COM DATA-HORA
		//Data-hora +/- tempo -> Data-hora
		//Data-hora 1, Data-hora 2 -> Duração
	}

}
