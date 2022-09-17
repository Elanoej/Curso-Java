package entitties;

public class Matriz {

	private Integer[][] matriz;

	public Matriz(Integer[][] matriz) {
		this.matriz = new Integer[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				this.matriz[i][j] = matriz[i][j];
			}
		}

	}

	public Matriz(int i, int j) {
		this.matriz = new Integer[i][j];
	}

	public void add(int line, int colune, int value) {
		matriz[line][colune] = value;
	}

	public void remove(int line, int colune) {
		matriz[line][colune] = null;
	}

	public Integer getValue(int line, int colune) {
		return matriz[line][colune];
	}

	public int lineLenght() {
		return matriz.length;
	}

	public int coluneLenght() {
		return matriz[0].length;
	}

	public Integer determinante() {
		if (matriz[0].length == 2 && matriz.length == 2) {
			return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
		}
		if (matriz[0].length == 3 && matriz.length == 3) {
			return (matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[0][1] * matriz[1][2] * matriz[2][0])
					+ (matriz[0][2] * matriz[1][0] * matriz[2][1])
					- ((matriz[0][1] * matriz[1][0] * matriz[2][2]) + (matriz[0][0] * matriz[1][2] * matriz[2][1])
							+ (matriz[0][2] * matriz[1][1] * matriz[2][0]));
		}
		// if (matriz[0].length > 3 || matriz.length > 3 ) {

		// }
		else {
			return 696969;
		}
	}

	public Double cofator(int inLine, int inColune) {
		Matriz matrizCopy = new Matriz(matriz);
		Matriz matrizLocal = new Matriz(matriz.length - 1, matriz[0].length - 1);
		int i = inLine - 1;
		int j = inColune - 1;

		for (int line = 0; line < matriz.length; line++) {
			for (int colune = 0; colune < matriz[0].length; colune++) {
				matrizCopy.remove(i, colune);
				matrizCopy.remove(line, j);
			}
		}

		for (int line = 0; line < matrizLocal.lineLenght(); line++) {
			for (int colune = 0; colune < matrizLocal.coluneLenght(); colune++) {
				if (matrizCopy.getValue(line, colune) != null) {
					matrizLocal.add(line, colune, matrizCopy.getValue(line, colune));
				}
				if (matrizCopy.getValue(line, colune) == null) {

					if (matrizCopy.getValue(line + 1, colune) != null) {
						matrizLocal.add(line, colune, matrizCopy.getValue(line + 1, colune));
						continue;
					}
					if (matrizCopy.getValue(line, colune + 1) != null) {
						matrizLocal.add(line, colune, matrizCopy.getValue(line, colune + 1));
						continue;
					}
					if (matrizCopy.getValue(line+1, colune + 1) != null) {
						matrizLocal.add(line, colune, matrizCopy.getValue(line + 1, colune + 1));
						continue;
					}
					
					line++;
					continue;
				}

			}
		}
		return (Math.pow(-1, i + j) * matrizLocal.determinante());
	}

}
