package com.cursojava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

	public static void main(String[] args) {
		
		//Data dd MM yyyy
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2019, 2, 1));
		System.out.println(LocalDate.parse("2019-12-01"));
		
		System.out.println(agora.plusDays(30));
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfMonth());
		System.out.println(agora.getDayOfYear());
		
		System.out.println(agora.isLeapYear());
		System.out.println(LocalDate.parse("2019-09-20").isLeapYear());
		
		//Hora formato ISO
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);
		
		System.out.println(LocalTime.of(20, 18));
		System.out.println(LocalTime.parse("19:45"));
		
		System.out.println(hAgora.plusMinutes(30));
		System.out.println(hAgora.minus(2, ChronoUnit.HOURS));
		
		System.out.println(hAgora.getHour());
		
		//Data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		
		System.out.println(LocalDateTime.of(2019,  2, 16, 20, 25, 10));
		System.out.println(LocalDateTime.parse("2019-03-17T21:30:20"));
		
		System.out.println(agoraCompleto.plusYears(20));
		
		//Fusos-horários
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		Set<String> fusos = ZoneId.getAvailableZoneIds();
		for(String f : fusos) {
			System.out.println(f);
		}
		
		System.out.println();
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		System.out.println(sp);
		
		//Transformar LocalDateTime em ZonedDateTime
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp);
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2018-01-16T20:25:10-02:00[America/Sao_Paulo]"));
		
		//Trabalhando com offset
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
		System.out.println(offsetdt);
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
 
	}

}
