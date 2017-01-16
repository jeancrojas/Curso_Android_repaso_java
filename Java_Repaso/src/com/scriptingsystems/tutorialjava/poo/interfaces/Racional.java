package com.scriptingsystems.tutorialjava.poo.interfaces;

public class Racional implements Comparable {
	private int numerador;
	private int denominador;
	
	/**
	 * @param numerador
	 * @param denominador
	 */
	public Racional (int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
        /**
         * 
         * @param other
         * @return
         * @throws ComparationException 
         * @see Sobrecarga del metodo compareTo
         * 
         */
	@Override
	public int compareTo(Object other) throws ComparationException {
		// TODO Auto-generated method stub
		if(!(other instanceof Racional))
			throw new ComparationException("el elemento comparado "
					+ "debe ser un objeto de tipo Racional");
		Racional r=(Racional)other;
		if(numerador*r.getDenominador()>denominador*r.getNumerador())
			return 1;
		else if(numerador*r.getDenominador()<denominador*r.getNumerador())
			return -1;
		return 0;
	}

	
	//Funciones GET - SET
	
	/**
	 * @return the numerador
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * @param numerador the numerador to set
	 */
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	/**
	 * @return the denominador
	 */
	public int getDenominador() {
		return denominador;
	}

	/**
	 * @param denominador the denominador to set
	 */
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	
	/* (non-Javadoc)
	 * @return message The Racional
	 */
	@Override
	public String toString() {
		//StringBuilder permite concatenar String
		StringBuilder sb = new StringBuilder ();
		//Signo del racional
                String signo=(numerador>=0 && denominador>0)||(numerador>=0&&denominador<0)?"+":"-";
                //Con el metodo append se va añadiendo a la cadena
		sb.append(signo);
		sb.append(Math.abs(numerador) + "/" + Math.abs(denominador));
		return sb.toString();
	}

	/* 
	 * @see Sobrecarga del metodo equals
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Racional))
			return false;
		Racional r=(Racional)obj;
		return (numerador*r.denominador==denominador*r.numerador)?true:false;
	}

	/* 
	 * @see sobrecarga del metodo hashCode
	 */
        @Override
	public int hashCode() {
		int result = 17;

	    // Include a hash for each field.

	    result = 31 * result + numerador;                                // 8 bits  » 32-bit 
	    result = 31 * result + denominador;                               // 16 bits » 32-bit
	    return result;
	}
	
	
	
	
}
