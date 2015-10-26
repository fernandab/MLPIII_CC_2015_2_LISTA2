package gui;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propriedades {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("database.properties");
		prop.load(ip);
		ip.close();
		
		System.out.println("URL ---------:" + prop.getProperty("conexao.url"));
		System.out.println("DATABASE ----:" + prop.getProperty("conexao.database"));
		System.out.println("USUAROP -----:" + prop.getProperty("conexao.usuario"));
		System.out.println("SENHA -------:" + prop.getProperty("conexao.senha"));
		System.out.println("PORTA -------:" + prop.getProperty("conexao.porta"));
	}

}
