package paquete1;
import java.util.Random;


public class Partida {
	private Tablero tablero;
	private Fantasma fantasma;
	private Comecocos comecocos;
	private int puntuacion;
	private int vidas;
	private int [][] movimientos;
	private Random random;
	
	public Partida () {
		this.comecocos = new Comecocos();
		this.fantasma = new Fantasma();
		this.tablero = new Tablero();
		this.puntuacion = 0;
		this.vidas = 3;
		this.movimientos = new int[][] {
			{-1,0},{1,0},{0,-1},{0,1}
		};
		this.random = new Random();
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public Fantasma getFantasma() {
		return fantasma;
	}

	public void setFantasma(Fantasma fantasma) {
		this.fantasma = fantasma;
	}

	public Comecocos getComecocos() {
		return comecocos;
	}

	public void setComecocos(Comecocos comecocos) {
		this.comecocos = comecocos;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	public int[] moverJugador(char tecla) {
		int[] movimiento; 
		if (tecla == 'W' || tecla == 'w') {
			movimiento = movimientos[0];
		}
		if (tecla == 'A' || tecla == 'a') {
			movimiento = movimientos[2];
		}
		if (tecla == 'S' || tecla == 's') {
			movimiento = movimientos[1];
		}
		if (tecla == 'D' || tecla == 'd') {
			movimiento = movimientos[3];
		}
		else {
			movimiento = new int [] {0,0};
		}
		return movimiento;
		}
	
	public int[] moverFantasma(Tablero tablero, Fantasma fantasma) {
		int filaFantasma = getfantasma_x();
		int colFantasma = getfantasma_y();
		int numAleatorio = this.random.nextInt();
		
		for (int[] movimiento : this.movimientos) {
			
		}
	}
}
