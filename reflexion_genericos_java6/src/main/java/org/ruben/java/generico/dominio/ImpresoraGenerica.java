package org.ruben.java.generico.dominio;

public class ImpresoraGenerica <T>{//Por convencion se usa T de tipo Type

	T paraImprimir;
	
	public ImpresoraGenerica(T paraImprimir) {
	this.paraImprimir = paraImprimir;
}

	public void imprimir( ) {
		System.out.println(paraImprimir);
	}
}
