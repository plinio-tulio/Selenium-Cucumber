package br.com.automacao.utils;

import java.util.Random;

public class FakerUtils {

	public static String gerarNomeAleatorio() {
		Random r = new Random();
		String gerada = Integer.toString(Math.abs(r.nextInt()), 34).substring(0, 4);
		return "Usuario" + gerada;
	}

	public static String gerarEmailAleatorio() {
		Random r = new Random();
		String gerada = Integer.toString(Math.abs(r.nextInt()), 34).substring(0, 4);
		return "usuario" + gerada + "@email.com";
	}
}
