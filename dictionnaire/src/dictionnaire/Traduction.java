package dictionnaire;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Traduction {
	public static void traductionEspagnolAnglais(ArrayList tableauEspagnol, ArrayList tableauAnglais) {
		String [] tableauAnglai = (String[]) tableauAnglais.toArray(new String[tableauAnglais.size()]);
		String [] tableauEspagno = (String[]) tableauEspagnol.toArray(new String[tableauEspagnol.size()]);
		System.out.println("\t\t Traduction Espagnol - Anglais ");
		System.out.println("\t\t_______________________________");
		System.out.println("Saisir votre texte ici:");
		Scanner scmot2 = new Scanner(System.in);
		String texteSaisi = scmot2.nextLine();
		
		String [] arrOfStr = texteSaisi.split(" ");
		String resultat ="";
		boolean trouve1=false;
		boolean trouve2=true;
		for (String a: arrOfStr) {
		trouve1=false;
		String je=a;
		
		for(int i=0; i < tableauEspagno.length; i++) {
			String b=tableauEspagno[i];
			if(b.equals(a) ) {
				String c= tableauAnglai[i];
				resultat=resultat+ " "+ c;
				i = tableauEspagno.length;
				trouve1=true;
			}
		}
		if (trouve1==false) {
			System.out.println("Le dictionnaire ne comporte pas le mot :"+je+". Veuillez l'ajouter!");
			trouve2=false;
					}
		}
		
		if (trouve2==true) {
		traductionAnglais(resultat);
		}else {
			System.out.println("Impossible de traduire, car il y a au moins un mot qui ne se trouve pas dans le dictionnaire.");
		}
	}

	public static void traductionAnglaisEspagnol(ArrayList tableauAnglais, ArrayList tableauEspagnol) {
		String [] tableauAnglai = (String[]) tableauAnglais.toArray(new String[tableauAnglais.size()]);
		String [] tableauEspagno = (String[]) tableauEspagnol.toArray(new String[tableauEspagnol.size()]);
		System.out.println("\t\t Traduction Anglais - Espagnol \t\t");
		System.out.println("\t\t_______________________________");
		System.out.println("Saisir votre texte ici:");
		Scanner scmot2 = new Scanner(System.in);
		String texteSaisi = scmot2.nextLine();
		
		String [] arrOfStr = texteSaisi.split(" ");
		String resultat ="";
		boolean trouve1=false;
		boolean trouve2=true;
		for (String a: arrOfStr) {
		trouve1=false;
		String je=a;
		
		for(int i=0; i < tableauAnglai.length; i++) {
			String b=tableauAnglai[i];
			if(b.equals(a) ) {
				String c= tableauEspagno[i];
				resultat=resultat+ " "+ c;
				i = tableauAnglai.length;
				trouve1=true;
			}
		}
		if (trouve1==false) {
			System.out.println("Le dictionnaire ne comporte pas le mot :"+je+". Veuillez l'ajouter!");
			trouve2=false;
					}
	
		}
		
		if (trouve2==true) {
		traductionEspagnol(resultat);
		}else {
			System.out.println("Impossible de traduire, car il y a au moins un mot qui ne se trouve pas dans le dictionnaire.");
		}	
	}

	public static void traductionEspagnolFrancais(ArrayList tableauEspagnol, ArrayList tableauFrancais) {
		String [] tableauFrancai = (String[]) tableauFrancais.toArray(new String[tableauFrancais.size()]);
		String [] tableauEspagno = (String[]) tableauEspagnol.toArray(new String[tableauEspagnol.size()]);
		System.out.println("\t\t Traduction Espagnol - Francais ");
		System.out.println("\t\t_______________________________");
		System.out.println("Saisir votre texte ici:");
		Scanner scmot2 = new Scanner(System.in);
		String texteSaisi = scmot2.nextLine();
		String [] arrOfStr = texteSaisi.split(" ");
		String resultat ="";
		boolean trouve1=false;
		boolean trouve2=true;
		for (String a: arrOfStr) {
		trouve1=false;
		String je=a;
		
		for(int i=0; i < tableauEspagno.length; i++) {
			String b=tableauEspagno[i];
			if(b.equals(a) ) {
				String c= tableauFrancai[i];
				resultat=resultat+ " "+ c;
				i = tableauEspagno.length;
				trouve1=true;
			}
		}
		if (trouve1==false) {
			System.out.println("Le dictionnaire ne comporte pas le mot :"+je+". Veuillez l'ajouter!");
			trouve2=false;
					}
	
		}
		
		if (trouve2==true) {
		traductionFrancais(resultat);
		}else {
			System.out.println("Impossible de traduire, car il y a au moins un mot qui ne se trouve pas dans le dictionnaire.");
		}
		
	}

	public static void traductionFrancaisEspagnol(ArrayList tableauFrancais, ArrayList tableauEspagnol) {
		String [] tableauFrancai = (String[]) tableauFrancais.toArray(new String[tableauFrancais.size()]);
		String [] tableauEspagno = (String[]) tableauEspagnol.toArray(new String[tableauEspagnol.size()]);
		System.out.println("\t\t Traduction Francais - Espagnol ");
		System.out.println("\t\t_______________________________");
		System.out.println("Saisir votre texte ici:");
		Scanner scmot2 = new Scanner(System.in);
		String texteSaisi = scmot2.nextLine();
		
		String [] arrOfStr = texteSaisi.split(" ");
		String resultat ="";
		boolean trouve1=false;
		boolean trouve2=true;
		for (String a: arrOfStr) {
		trouve1=false;
		String je=a;
		
		for(int i=0; i < tableauFrancai.length; i++) {
			String b=tableauFrancai[i];
			if(b.equals(a) ) {
				String c= tableauEspagno[i];
				resultat=resultat+ " "+ c;
				i = tableauFrancai.length;
				trouve1=true;
			}
		}
		if (trouve1==false) {
			System.out.println("Le dictionnaire ne comporte pas le mot :"+je+". Veuillez l'ajouter!");
			trouve2=false;
					}
	
		}
		
		if (trouve2==true) {
		traductionEspagnol(resultat);
		}else {
			System.out.println("Impossible de traduire, car il y a au moins un mot qui ne se trouve pas dans le dictionnaire.");
		}
		
	
	}

	

	public static void traductionAnglaisFrancais(ArrayList tableauAnglais, ArrayList tableauFrancais) {
		String [] tableauFrancai = (String[]) tableauFrancais.toArray(new String[tableauFrancais.size()]);
		String [] tableauAnglai = (String[]) tableauAnglais.toArray(new String[tableauAnglais.size()]);
		System.out.println("\t\t Traduction Anglais - Francais ");
		System.out.println("\t\t_______________________________");
		System.out.println("Saisir votre texte ici:");
		Scanner scmot2 = new Scanner(System.in);
		String texteSaisi = scmot2.nextLine();
		
		String [] arrOfStr = texteSaisi.split(" ");
		String resultat ="";
		boolean trouve1=false;
		boolean trouve2=true;
		for (String a: arrOfStr) {
		trouve1=false;
		String je=a;
		
		for(int i=0; i < tableauAnglai.length; i++) {
			String b=tableauAnglai[i];
			if(b.equals(a) ) {
				String c= tableauFrancai[i];
				resultat=resultat+ " "+ c;
				i = tableauAnglai.length;
				trouve1=true;
			}
		}
		if (trouve1==false) {
			System.out.println("Le dictionnaire ne comporte pas le mot :"+je+". Veuillez l'ajouter!");
			trouve2=false;
					}
	
		}
		
		if (trouve2==true) {
		traductionFrancais(resultat);
		}else {
			System.out.println("Impossible de traduire, car il y a au moins un mot qui ne se trouve pas dans le dictionnaire.");
		}
		
		
		
	}

	

	public static void traductionFrancaisAnglais(ArrayList tableauFrancais, ArrayList tableauAnglais) {
		String [] tableauFrancai = (String[]) tableauFrancais.toArray(new String[tableauFrancais.size()]);
		String [] tableauAnglai = (String[]) tableauAnglais.toArray(new String[tableauAnglais.size()]);
		
		System.out.println("\t\t Traduction Francais - Anglais ");
		System.out.println("\t\t_______________________________");
		System.out.println("Saisir votre texte ici:");
		Scanner scmot2 = new Scanner(System.in);
		String texteSaisi = scmot2.nextLine();
		String [] arrOfStr = texteSaisi.split(" ");
		String resultat ="";
		boolean trouve1=false;
		boolean trouve2=true;
		for (String a: arrOfStr) {
		trouve1=false;
		String je=a;
		
		for(int i=0; i < tableauFrancai.length; i++) {
			String b=tableauFrancai[i];
			if(b.equals(a) ) {
				String c= tableauAnglai[i];
				resultat=resultat+ " "+ c;
				i = tableauFrancai.length;
				trouve1=true;
			}
		}
		if (trouve1==false) {
			System.out.println("Le dictionnaire ne comporte pas le mot :"+je+". Veuillez l'ajouter!");
			trouve2=false;
					}
	
		}
		
		if (trouve2==true) {
		traductionAnglais(resultat);
		}else {
			System.out.println("Impossible de traduire, car il y a au moins un mot qui ne se trouve pas dans le dictionnaire.");
		}
		
		
	}
	private static void traductionEspagnol(String i) {
		System.out.println("a pour traduction espagnole : "+i);
		
	}
	private static void traductionFrancais(String i) {
		System.out.println("a pour traduction francaise : "+i);
		
	}
	private static void traductionAnglais(String i) {
		System.out.println("a pour traduction anglaise : "+ i);
		
	}
}
