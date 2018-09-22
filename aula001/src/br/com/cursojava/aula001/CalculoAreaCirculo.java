package br.com.cursojava.aula001;

public class CalculoAreaCirculo {
	
	double area;
	double raio;
	double diametro;
	
	public CalculoAreaCirculo() {
		this.setDiametro(20);
		this.setRaio(diametro);
		this.setArea();
		System.out.println(this.getArea());
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea() {
		this.area = Math.PI * Math.pow(this.getRaio(), 2);
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double diametro) {
		this.raio = this.getDiametro() / 2;
	}
	
	
	public static void main(String[] args) {
		new CalculoAreaCirculo();
	}

}
