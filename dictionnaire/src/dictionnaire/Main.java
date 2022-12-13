package dictionnaire;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static Fonctions instance;
	static Traduction objinstance;
	static ArrayList<String> tableauFrancais = new ArrayList();
	static ArrayList<String> tableauAnglais = new ArrayList();
	static ArrayList<String> tableauEspagnol = new ArrayList();
	
	static String resMot;

	public static void main(String[] args) {
		menu();
				
	}

	private static void menu() {
		System.out.println("================= Le Traducteur =================");
		System.out.println("=================================================");
		System.out.println("\n");
		
		instance.lectureFichierFrancais( tableauFrancais);
		instance.lectureFichierAnglais( tableauAnglais);
		instance.lectureFichierEspagnol( tableauEspagnol);
						
		System.out.println("\t\t========== Menu ============");
		System.out.println("\t\t1. Traduire un texte");
		System.out.println("\t\t2. Ajouter un mot");
		System.out.println("\t\t3. Supprimer un mot");
		System.out.println("\t\t4. Afficher le dictionnaire");
		System.out.println("\t\t0. Quitter le programme");

		Scanner sc = new Scanner(System.in);
		int choixMenu;
		do {
		System.out.println("Saisiseez le numéro correspondant à votre choix.");
		choixMenu = sc.nextInt();
		if (choixMenu!=1 && choixMenu!=2 && choixMenu!=3 && choixMenu!=0 && choixMenu!=4) {
			System.out.println("Le chiffre saisi peut uniquement etre 0, 1, 2, 3 ou 4. Veuillez resaisir le chiffre correspondant à votre choix.");
			}
		}while (choixMenu!=1 && choixMenu!=2 && choixMenu!=3 && choixMenu!=0 && choixMenu!=4);
		
		//choix menu
		if(choixMenu == 1) {
			System.out.println("\t\t\t| Traduction |");
			System.out.println("\t\t1.  Francais - Anglais");
			System.out.println("\t\t2.  Anglais - Francais");
			System.out.println("\t\t3.  Francais - Espagnol");
			System.out.println("\t\t4.  Espagnol - Francais");
			System.out.println("\t\t5.  Anglais - Espagnol");
			System.out.println("\t\t6.  Espagnol - Anglais");
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Saisir le numéro de votre choix.");
			int choixLangue = sc2.nextInt();
			
			if(choixLangue == 1) {
				Traduction.traductionFrancaisAnglais( tableauFrancais,tableauAnglais);
				menu();
			}
			else {
				if(choixLangue == 2) {
					Traduction.traductionAnglaisFrancais(tableauAnglais,tableauFrancais);
					menu();
				}
				else {
					if(choixLangue == 3) {
						Traduction.traductionFrancaisEspagnol(tableauFrancais,tableauEspagnol);
						menu();
					}
					else {
						if(choixLangue == 4) {
							Traduction.traductionEspagnolFrancais(tableauEspagnol,tableauFrancais);
							menu();
						}
						else {
							if(choixLangue == 5) {
								Traduction.traductionAnglaisEspagnol(tableauAnglais,tableauEspagnol);
								menu();
							}
							else {
								if(choixLangue == 6) {
									Traduction.traductionEspagnolAnglais(tableauEspagnol,tableauAnglais);
									menu();
								}
							}
						}
					}
				}
			}
		}
		else {
			if(choixMenu == 2) {
				System.out.println("\t======== Ajouter un mot ==========\n");
				System.out.println("N.B: Vous devez ecrire tous les mots du dictionnaire en minuscule\n");
					ecrirefrancais();
					menu();
				
			}else
				if(choixMenu == 3) {
				System.out.println("\t============= Supprimer un mot =============\n");
				System.out.println("N.B: Vous devez ecrire tous les mots du dictionnaire en minuscule\n");
				effacerunmot();
				menu();
			} else 
				if(choixMenu == 0){
				System.out.println("\n\t FIN DU PROGRAMME!!");
			}else {
				liredictionnaire();
				menu();
			}
		}
		
	}

	
	

	private static void ecrirefrancais() {
		System.out.println("Ecrire votre mot en francais ");
		Scanner scmot = new Scanner(System.in);
		String motfrancais = scmot.nextLine();
		
		String motfrancais2 = "\n"+motfrancais;
		
		Path path = Paths.get("francais.txt");
		try {
			Files.write(path, motfrancais2.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ecrireAnglais();
		
	}

	private static void ecrireAnglais() {
		System.out.println("Ecrire la traduction en anglais ");
		Scanner scmot = new Scanner(System.in);
		String motanglais = scmot.nextLine();
		
		String motanglais2 = "\n"+motanglais;
		
		Path path = Paths.get("anglais.txt");
		try {
			Files.write(path, motanglais2.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ecrireEspagnol();
		
	}

	private static void ecrireEspagnol() {
		System.out.println("Ecrire la traduction en espagnol ");
		Scanner scmot = new Scanner(System.in);
		String motespagnol = scmot.nextLine();
		
		String motespagnol2 = "\n"+motespagnol;
		
		Path path = Paths.get("espagnol.txt");
		try {
			Files.write(path, motespagnol2.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Le mot a ete ajoute avec succes!\n");
	}

	public static void effacerunmot() {
		System.out.println("Saisir votre mot en francais ");
		Scanner scmot2 = new Scanner(System.in);
		String texteSaisi = scmot2.nextLine();
		boolean trouve1=false;
				
		for(int i=0; i < tableauFrancais.size(); i++) {
			if(tableauFrancais.get(i).contentEquals(texteSaisi) ) {
				
				tableauFrancais.remove(i);
				tableauAnglais.remove(i);
				tableauEspagnol.remove(i);
				i = tableauFrancais.size();
				trouve1=true;
			}
		}
		if (trouve1==false) {
			System.out.println("Le dictionnaire ne comporte pas le mot :"+texteSaisi+".");}
	
	File fileFrancais = new File("francais.txt");
	try(BufferedWriter bfw = new BufferedWriter(new FileWriter(fileFrancais))){
	bfw.write("");
	}catch(IOException e) {
	e.printStackTrace();
	}
	File fileEspagnol = new File("espagnol.txt");
	try(BufferedWriter bfw = new BufferedWriter(new FileWriter(fileEspagnol))){
	bfw.write("");
	}catch(IOException e) {
	e.printStackTrace();
	}
	File fileAnglais = new File("anglais.txt");
	try(BufferedWriter bfw = new BufferedWriter(new FileWriter(fileAnglais))){
	bfw.write("");
	}catch(IOException e) {
	e.printStackTrace();
	}
	
	for(int i=0; i < tableauFrancais.size(); i++) {
		String motfrancais2 = "\n"+tableauFrancais.get(i).toLowerCase();
		
		Path path = Paths.get("francais.txt");
		try {
			Files.write(path, motfrancais2.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	for(int i=0; i < tableauAnglais.size(); i++) {
		String motfrancais2 = tableauAnglais.get(i)+" \n";
		
		Path path = Paths.get("anglais.txt");
		try {
			Files.write(path, motfrancais2.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	for(int i=0; i < tableauEspagnol.size(); i++) {
		String motfrancais2 = "\n"+tableauEspagnol.get(i);
		
		Path path = Paths.get("espagnol.txt");
		try {
			Files.write(path, motfrancais2.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	if (trouve1==true) {
	System.out.println("Le mot \""+texteSaisi+"\"  est éffacé avec succès! ");
	}
	
	}
	

	public static void liredictionnaire() {
		ArrayList<String> dictionnaire = new ArrayList( tableauFrancais);
		Collections.sort(dictionnaire);
		System.out.println(dictionnaire);
	}



	
	
}
