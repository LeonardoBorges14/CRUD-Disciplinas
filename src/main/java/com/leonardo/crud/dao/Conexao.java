package com.leonardo.crud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/disciplinas?serverTimezone=UTC",
					"root", "");
		} catch (SQLException e) {
			System.out.println("|||--------------------->> "+e.getMessage());
			return null;
		}
	}
}
