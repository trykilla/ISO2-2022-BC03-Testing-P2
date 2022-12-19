package BC03.P2;


public class Triangulo {


	@SuppressWarnings("serial")
	class ErrorException extends Exception{
        public ErrorException(String msg){
            super(msg);
        }
	}
	public Triangulo(double lado1, double lado2, double lado3, double angulo1, double angulo2, double angulo3) throws ErrorException {
		this.setLado1(lado1);
		this.setLado2(lado2);
		this.setLado3(lado3);
		this.setAngulo1(angulo1);
		this.setAngulo2(angulo2);
		this.setAngulo3(angulo3);

	}



	public void setLado1(double lado1) throws ErrorException {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}  else {
			throw new ErrorException("Lado no válido");
		}
		
	}


	public void setLado2(double lado2)throws ErrorException {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}  else {
			throw new ErrorException("Lado no válido");
		}
	}



	public void setLado3(double lado3) throws ErrorException {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}  else {
			throw new ErrorException("Lado no válido");
		}
	}



	public void setAngulo1(double angulo1) throws ErrorException {
		if (angulo1 > 0) {
		this.angulo1 = angulo1;
		} else {
			throw new ErrorException("Ángulo no válido");
		}
	}


	public void setAngulo2(double angulo2) throws ErrorException{
		if (angulo2 > 0) {
			this.angulo2 = angulo2;
			} else {
				throw new ErrorException("Ángulo no válido");
			}
	}



	public void setAngulo3(double angulo3) throws ErrorException{
		if (angulo3 > 0) {
			this.angulo3 = angulo3;
			} else {
				throw new ErrorException("Ángulo no válido");
			}
	}

	private double lado1, lado2, lado3, angulo1, angulo2, angulo3;

	public String tipoTriangulo() {
		String tipoTriangulo = "";
		boolean esEquilatero = false;
		if ((this.angulo1 + this.angulo2 + this.angulo3) != 180)
			 tipoTriangulo = "No es un triángulo";
		else if (this.lado1 >= (this.lado2 + this.lado3) || this.lado3 >= (this.lado2 + this.lado1)
				|| this.lado2 >= (this.lado1 + this.lado3))
			 tipoTriangulo = "No es un triángulo";
		else if ((this.angulo1 == this.angulo2 && this.angulo1 == this.angulo3)
				&& (this.lado1 != this.lado2 || this.lado1 != this.lado3))
			 tipoTriangulo = "No es un triángulo";
		else if ((this.angulo1 != this.angulo2 || this.angulo1 != this.angulo3)
				&& (this.lado1 == this.lado2 && this.lado1 == this.lado3))
			 tipoTriangulo = "No es un triángulo";
		
		else {
			if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
					
				esEquilatero = true;
				tipoTriangulo = "Triángulo equilatero y acutángulo";
			} else if (this.lado1 == this.lado2 || this.lado3 == this.lado1 || this.lado3 == this.lado2)
				tipoTriangulo = "Isosceles";
	
				
			else if (this.lado1 != this.lado2 && this.lado2 != this.lado3 && this.lado3 != this.lado1)
				tipoTriangulo ="Escaleno";

			if ((this.angulo1 < 90 && this.angulo2 < 90 && this.angulo3 < 90) && !esEquilatero)
				tipoTriangulo+=" Acutangulo";
			else if ((this.angulo1 == 90 || this.angulo2 == 90 || this.angulo3 == 90))
				tipoTriangulo +=" Rectangulo";
			else if ((this.angulo1 > 90 || this.angulo2 > 90 || this.angulo3 > 90))
				tipoTriangulo += " Obtusangulo";
		}
		return tipoTriangulo;
	}
}
