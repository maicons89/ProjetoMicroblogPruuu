package principalPombo;

import java.util.ArrayList;
import java.util.Iterator;

import entidades.Administrador;
import entidades.Pruu;
import entidades.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Pruu> pruusFeed = new ArrayList();
		
		Usuario admin = new Administrador("Maicon","maicon@hotmail.com","111.111.111.11");
		
		Usuario Isadora = new Usuario("Isadora", "isadora@hotmail.com", "222.222.222.22");
		Pruu pruuIsadora1 = new Pruu("Saindo de ferias", Isadora);
		Pruu pruuIsadora2 = new Pruu("Chegando em Rio Grande, RS.", Isadora);
		pruusFeed.add(pruuIsadora1);
		pruusFeed.add(pruuIsadora2);
		ArrayList<Pruu> pruusIsadora = new ArrayList();
		Isadora.setPruus(pruusIsadora);
		pruusIsadora.add(pruuIsadora1);
		pruusIsadora.add(pruuIsadora2);
		
		Usuario Bob = new Usuario("Bob", "bob@hotmail.com", "333.333.333.33");
		Pruu pruuBob1 = new Pruu("Chegando no Senac para assistir as aulas de POO.", Bob);
		Pruu pruuBob2 = new Pruu("A aula hoje est muito boa!", Bob);
		pruusFeed.add(pruuBob1);
		pruusFeed.add(pruuBob2);
		ArrayList<Pruu> pruusBob = new ArrayList();
		Bob.setPruus(pruusBob);
		pruusBob.add(pruuBob1);
		pruusBob.add(pruuBob2);
		
		Bob.darLike(pruuIsadora2);
		Bob.darLike(pruuIsadora2);
		
		Isadora.darLike(pruuBob2);
		
		((Administrador) admin).bloquearPruu(pruuIsadora1);
		
		System.out.println("******* FEED - LISTA DE PRUUS *******");
		for (int i = 0; i < pruusFeed.size(); i++) {
			System.out.println(pruusFeed.get(i));
			System.out.println("**********************************************");
			}
		System.out.println("");
		System.out.println("******* PRUUS - ISADORA *******");
		for (int i = 0; i < pruusIsadora.size(); i++) {
			System.out.println(pruusIsadora.get(i));
			System.out.println("**********************************************");
			}
		
		System.out.println("");
		System.out.println("******* PRUSS - BOB *******");
		for (int i = 0; i < pruusBob.size(); i++) {
			System.out.println(pruusBob.get(i));
			System.out.println("**********************************************");
			}
	}
}
