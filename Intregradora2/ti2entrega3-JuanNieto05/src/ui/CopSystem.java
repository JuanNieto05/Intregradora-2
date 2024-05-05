package ui;

import java.util.Scanner;
import model.Controller;
import java.util.ArrayList;
import java.util.Collections;

// Pide la informacion
public class CopSystem {

	// Atributos
	private Scanner reader;

	// Relaciones
	private Controller controller;

	public static void main(String[] args) {

		CopSystem exe = new CopSystem();
		exe.menu();

	}

	// Constructor
	public CopSystem() {
		reader = new Scanner(System.in);
		controller = new Controller();

	}

	public void menu() {
		boolean flag = true;
		do {
			System.out.println("Bienvenido a la COP16");
			System.out.println("1) menú administrativo");
			System.out.println("2) menú de consultas");

			System.out.println("0) Salir");
			int option = reader.nextInt();

			switch (option) {
				case 1:
					menuAdministrativo();
					break;

				case 2:
					menuConsultas();
					break;

				default:
					flag = false;
					System.out.println("Gracias por usar nuestros servicios");
					break;
			}
		} while (flag);
	}

	public void menuAdministrativo() {

		boolean flag = true;
		do {
			System.out.println("1) registar comunidad");
			System.out.println("2) registar lugar");
			System.out.println("3) ingresar producto en comunidad");
			System.out.println("4) eliminar producto");
			System.out.println("5) ingresar especie en lugar");
			System.out.println("6) modificar especie");

			System.out.println("0) Salir");
			int option = reader.nextInt();

			switch (option) {
				case 1:
					registerCommunity();
					break;

				case 2:
					registerPlace();
					break;

				case 3:
					getProductIntoCommunity();
					break;

				case 4:
					eliminateProduct();
					break;

				case 5:
					getSpeciesIntoPlace();
					break;

				case 6:
					modifySpecies();
					break;

				default:
					flag = false;
					System.out.println("Gracias por usar nuestros servicios");
					break;
			}
		} while (flag);

	}

	public void menuConsultas() {

		boolean flag = true;
		do {
			System.out.println("1) consultar lugar");
			System.out.println("2) Informacion de comunidades por departamentos");
			System.out.println("3) Especies con mas cantidad ");
			System.out.println("4) lugares con area");
			System.out.println("0) Salir");
			int option = reader.nextInt();

			switch (option) {
				case 1:
					consultPlace();
					break;

				case 2:
					informacionOfCommunity();
					break;

				case 3:
				 	System.out.println(controller.specieWithMoreAmount());;
					break;

				case 4:
					placesBigger();
					break;

				default:
					flag = false;
					System.out.println("Gracias por usar nuestros servicios");
					break;
			}
		} while (flag);

	}

	public void registerCommunity() {

		reader.nextLine();

		System.out.println("Dijite el nombre de la comunidad");
		String communityName = reader.nextLine();

		System.out.println("Dijite el tipo de comunidad");
		System.out.println(controller.listTypeCommunity());
		int communityType = reader.nextInt();

		System.out.println("Dijite el nombre del representante");
		reader.nextLine();
		String communityBossName = reader.nextLine();

		System.out.println("Dijite el numero del representante");
		String communityBossPhone = reader.nextLine();

		System.out.println("Dijite el el problema de la comunidad");
		System.out.println(controller.listProblemCommunity());
		int communityProblems = reader.nextInt();

		System.out.println("Dijite la cantidad de habitantes de la comunidad");
		double communityAmount = reader.nextDouble();

		System.out.println("A que departamento pertence ls comunidad?");
		System.out.println(controller.listDepartment());
		int communityDepartment = reader.nextInt();


		boolean result = controller.storageCommunity(communityName, communityType, communityBossName,
				communityBossPhone, communityProblems, communityAmount,communityDepartment);

		if (result) {
			System.out.println("La comunidad se a registrado exitosamente al igual que el producto");
		} else {
			System.out.println("Error, la comunidad no se ha registrado");
		}

	}

	public void registerPlace() {

		reader.nextLine(); // Correcion del bug del Scanner

		System.out.println("Dijite el nombre del lugar");
		String placeName = reader.nextLine();

		System.out.println("A que departamento pertence el lugar?");
		System.out.println(controller.listDepartment());
		int placeDepartment = reader.nextInt();

		System.out.println("Dijite el area del lugar");
		reader.nextLine();
		String square = reader.nextLine();

		System.out.println("Que tipo de lugar es?");
		System.out.println(controller.listType());
		int placeType = reader.nextInt();

		System.out.println("Ingresa la fecha de apaertura env (formato DD/MM/AAAA):");
		reader.nextLine();
		String placeOpeningDay = reader.nextLine();

		System.out.println("Ingrese el nombre de la comunidad a la cual pertence el lugar");
		System.out.println(controller.listCommunity(placeOpeningDay));
		String communityName = reader.nextLine();

		System.out.println("Dijite el url de la imagen");
		String placePhoto = reader.nextLine();

		System.out.println("Dijite los recurosos ncesarios para el sostenimiento");
		double financial = reader.nextDouble();

		boolean result = controller.storagePlace(placeName, placeDepartment, square, placeType, placeOpeningDay,
				communityName, placePhoto, financial);

		if (result) {
			System.out.println("Lugar registrado exitosamente");
		} else {
			System.out.println("Error, el lugar no se ha registrado");
		}

	}

	public void getProductIntoCommunity() {

		System.out.println("A que comunidad se debe de agregar este producto?");
		System.out.println(controller.listCommunity(null));
		reader.nextLine();
		String communityName = reader.nextLine();

		System.out.println("Cual es el nombre del producto?");
		reader.nextLine();
		String productName = reader.nextLine();

		System.out.println("Cual es el porcentaje de producto natural usado?");
		double productNatural = reader.nextDouble();

		System.out.println("Que tipo de producto es?");
		System.out.println(controller.listProductType());
		int productType = reader.nextInt();

		System.out.println("Es hecho a mano?");
		reader.nextLine();
		String productHandMade = reader.nextLine();

		boolean result = controller.storageProduct(communityName, productName, productNatural, productType,
				productHandMade);

		if (result) {
			System.out.println("Producto registrado existosamente");
		} else {
			System.out.println("Error, al registrar producto");
		}

	}

	public void eliminateProduct() {

		System.out.println("De que comunidad se debe de elimar el producto?");
		System.out.println(controller.listCommunity(null));
		reader.nextLine();
		String communityName = reader.nextLine();

		System.out.println(controller.listProduct(null));

		System.out.println("Ingrese el nombre del producto a eliminar");
		String productName = reader.nextLine();

		if (controller.eliminateProduct(productName)) {

			System.out.println("Producto eliminado exitosamente");

		} else {

			System.out.println("El producto no ha podido ser eliminado");

		}
	}

	public void getSpeciesIntoPlace() {

		System.out.println(controller.listPlace(null));
		System.out.println("Ingrese el lugar a agregar especie");
		reader.nextLine();
		String placeName = reader.nextLine();

		System.out.println("Ingrese el nombre de la especie");
		String speciesName = reader.nextLine();

		System.out.println("Que tipo es'");
		System.out.println(controller.listSpeciesType());
		int speciesType = reader.nextInt();

		System.out.println("Dijite el url de la imagen");
		reader.nextLine();
		String speciesPhoto = reader.nextLine();

		System.out.println("Dijite la cantidad de ejemplares");
		int speciesAmount = reader.nextInt();

		boolean result = controller.storageSpecies(placeName, speciesName, speciesType, speciesPhoto, speciesAmount);

		if (result) {
			System.out.println("Producto registrado existosamente");
		} else {
			System.out.println("Error, al registrar producto");
		}
	}

	public void modifySpecies() {

		reader.nextLine();

		System.out.println(controller.listSpecies());

		System.out.println("Dijite el nombre de la especie");
		String speciesName = reader.nextLine();

		String msg = controller.showSpecies(speciesName);

		if (msg.equals("La especie no se encuentra")) {

			System.out.println(msg);

		} else {

			System.out.println("Los datos del producto son:\n" + msg);
			System.out.println("Digite la nueva cantidad");
			int speciesAmount = reader.nextInt();

			controller.showSpecies(speciesName);
		}

	}

	public void consultPlace() {

		reader.nextLine();

		System.out.println("Dijite el nombre del lugar");
		String placeName = reader.nextLine();

		String msg = controller.showPlace(placeName);

		if (msg.equals("El lugar no se encuentra")) {

			System.out.println(msg);

		} else {

			System.out.println("Los datos del lugar son:\n" + msg);
		}
	}

	public void informacionOfCommunity() {

		
		reader.nextLine();

		System.out.println("Dijite el nombre de la comunidad");
		String communityName = reader.nextLine();

		String msg = controller.showCommunity(communityName);

		if (msg.equals("La comunidad no se encuentra")) {

			System.out.println(msg);

		} else {

			System.out.println("Los datos de la comunidad son:\n" + msg);
		}

	}


	public void placesBigger() {

		System.out.println(controller.listPlacesWithNameAndArea());

	}
}