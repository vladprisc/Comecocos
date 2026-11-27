package paquete1;

public class Tablero {
	private char[][] tablero;
	public Tablero() {
		this.tablero = new char[][] {
		    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
		    {'#', '·', '·', '·', '#', '·', '·', '·', '·', '·', '#'},
		    {'#', '·', '#', '·', '#', '·', '#', '#', '#', '#', '#'},
		    {'#', '·', '#', '·', '·', '·', '·', '·', '·', '·', '#'},
		    {'#', '·', '#', '#', '#', '·', '#', '#', '#', '·', '#'},
		    {'#', '·', '·', '·', '·', '·', '·', '#', '·', '·', '#'},
		    {'#', '#', '#', '#', '#', '·', '·', '#', '·', '#', '#'},
		    {'#', '·', '·', '·', '·', '·', '·', '·', '·', '·', '#'},
		    {'#', '·', '#', '#', '#', '#', '#', '·', '#', '·', '#'},
		    {'#', '·', '·', '·', '·', '·', '·', '·', '#', '·', '#'},
		    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
		};
	}
	
	public char[][] getTablero() {
		return tablero;
	}
	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}
	
	public void dibujarTablero(Comecocos comecocos, Fantasma fantasma, int vidas, int puntuacion) {
		int i = 0;
		while (i<this.tablero.length) {
			for (int j=0; j<this.tablero[i].length;j++) {
				char pos = this.tablero[i][j];
				if (i==comecocos.getPac_x() && j==comecocos.getPac_y()) {
					pos = 'C';
				}
				if (i==fantasma.getFantasma_x() && j==fantasma.getFantasma_y()) {
					pos = 'F';
				}
				System.out.print(pos);
				System.out.print(' ');
			System.out.print("");
			}
		}
		System.out.print("Vidas:"+vidas);
		System.out.print("Puntos:"+puntuacion);
	}
}

