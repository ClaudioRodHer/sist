package com.mad.vista;

public class FrmEntrada {
	public static final String Pesos = null;
	public String Material;
	public String Codigo;
	public String Maquina;
	public String Fecha;
	public double Peso;
	public String Turno;
	 
	public String Mostrar(){
		return "Material"+Material
				+"\nCodigo"+Codigo
				+"\nMaquina"+Maquina
				+"\nFecha"+Fecha
				+"\nKg"+Peso
				+"\nTurno"+Turno;
	}
	}
