/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.Postre;

/**
 *
 * @author Paul del Pezo
 */
public class LecheDescremada implements PuedeUsarLeche{


	@Override
	public void aplicarLeche(Postre postre) {
		System.out.println("Usando leche descremada");
		
	}
    
}
