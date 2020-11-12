/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.Pastel;
import Postres.Postre;

/**
 *
 * @author Paul del Pezo
 */
public class LecheDeslactosada implements PuedeUsarLeche {
    public void aplicarLecheDeslactosada() {
    	System.out.println("Cambiando para usar Leche deslactosada");
    }

	@Override
	public void aplicarLeche(Postre postre) {
		if(postre.getClass()==Pastel.class) {
			System.out.println("Cambiando para usar Leche descremada");
		}else {
			aplicarLecheDeslactosada();
		}
		
	}
        
}
