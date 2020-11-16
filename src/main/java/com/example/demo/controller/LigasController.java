package com.example.demo.controller;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.models.Tickets;
import com.example.demo.models.Clientes;
import com.example.demo.models.Ventas;
import com.example.demo.models.Computadoras;
import com.example.demo.models.Proveedores;
@Controller
@RequestMapping("/examenUnidad2")
public class LigasController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/Computadoras")
	public String Computadoras (Model modelo) {
		
		ArrayList<Computadoras> computadora = new ArrayList<Computadoras>();
		computadora.add(new Computadoras(24314,"Lenovo","Core i5","Windows10",12,8));
		computadora.add(new Computadoras(43124,"Hp","Core i5","Windows10",16,4));
		computadora.add(new Computadoras(43214,"Dell","Core i7","Ubuntu",16,8));
		computadora.add(new Computadoras(32443,"Hp","Celerón","Windows10",14,4));
		computadora.add(new Computadoras(31432,"Lenovo","Core i3","Windows10",18,4));
		
		
		computadora.add(new Computadoras(23423,"HP","Celerón","Windows10",16,4));
		computadora.add(new Computadoras(56544,"Toshiba","Core i3","Windows10",12,8));
		computadora.add(new Computadoras(45635,"Lenovo","Core i9","Windows10",18,8));
		computadora.add(new Computadoras(54654,"HP","AMD","Ubuntu",14,4));
		computadora.add(new Computadoras(15654,"HP","Celeron","Windows10",14,4));
		modelo.addAttribute("Computadoras",computadora);
		modelo.addAttribute("titulo","Tabla de Computadoras");
		return "computadoras";
	}
	
	@GetMapping("/Tickets")
	public String Tickets (Model modelo) {
		
		ArrayList<Tickets> ticket = new ArrayList<Tickets>();
		ticket.add(new Tickets(11,1,21312,2,12500));
		ticket.add(new Tickets(12,2,21321,1,14000));
		ticket.add(new Tickets(13,3,53454,2,13350));
		ticket.add(new Tickets(14,4,65645,1,16300));
		ticket.add(new Tickets(15,5,66453,3,6630));
		
		ticket.add(new Tickets(16,6,56755,2,12500));
		ticket.add(new Tickets(17,7,76556,1,14000));
		ticket.add(new Tickets(18,8,57654,3,13350));
		ticket.add(new Tickets(19,9,46457,1,6300));
		ticket.add(new Tickets(20,10,65776,2,6630));
		
		modelo.addAttribute("Tickets",ticket);
		modelo.addAttribute("titulo","Tabla de Tickets");
		return "Tickets";
	}
	
		@GetMapping("/Ventas")
		public String Ventas (Model modelo) {
		ArrayList<Ventas> venta = new ArrayList<Ventas>();
		venta.add(new Ventas(11,001,"1-11-2020",45600,4000,50,15090));
		venta.add(new Ventas(12,002,"2-11-2020",26600,2240,50,19098));
		venta.add(new Ventas(13,003,"3-06-2020",14300,4272,50,1226));
		venta.add(new Ventas(14,004,"4-08-2020",32400,2608,50,19585));
		venta.add(new Ventas(15,005,"6-09-2020",19890,3182,50,22204));
		
		venta.add(new Ventas(16,001,"7-11-2020",23400,4000,50,25054));
		venta.add(new Ventas(17,002,"8-11-2020",14000,2240,50,39220));
		venta.add(new Ventas(18,003,"18-06-2020",26700,4272,50,12234));
		venta.add(new Ventas(19,004,"19-08-2020",1630,2608,50,15328));
		venta.add(new Ventas(20,005,"16-09-2020",19890,3182,50,34220));
		
		modelo.addAttribute("Ventas",venta);
		modelo.addAttribute("titulo","Tabla de Ventas");
		return "Ventas";
		
	}
		
		@GetMapping("/Clientes")
		
		public String Clientes (Model modelo) {
			ArrayList<Clientes> cliente = new ArrayList<Clientes>();
			cliente.add(new Clientes(161130055,"Brandon","Castro Hernández",553243332,"brandon@gmail.com","Nezahualcóyotl"));
			cliente.add(new Clientes(161130077,"Juan","Silva Mártinez",556576646,"juan@gmail.com","Centro"));
			cliente.add(new Clientes(16114567,"Ana","Bolaños Gómez",550624842,"ana@gmail.com","López"));
			cliente.add(new Clientes(161741277,"Pepe","Solís Medel",550624452,"pepe@gmail.com","Chimalhuacán"));
			cliente.add(new Clientes(16163577,"Lúlu","Pérez Pérez",554639142,"lulu@gmail.com","Ecatepec"));
			
			cliente.add(new Clientes(16116841,"Julio","Sánchez López",557727527,"Julio@gmail.com","Tecámac"));
			cliente.add(new Clientes(16233841,"Albero","Mártinez Pacheco",557862752,"Alberto@gmail.com","Hidalgo"));
			cliente.add(new Clientes(16231354,"Lupillo","Rivera Salcedo",558627275,"Lupillo@gmail.com","CDMX"));
			cliente.add(new Clientes(16324681,"Armando","Mártínez Fuentes",558672572,"Armando@gmail.com","Ecatepec"));
			cliente.add(new Clientes(16233458,"Benito","Pérez Delgadillo",553386452,"benito@gmail.com","Ecatepec"));
			
			modelo.addAttribute("Clientes",cliente);
			modelo.addAttribute("titulo","Tabla de Clientes");
			return "Clientes";
		}
		
		@GetMapping("/Proveedores")
		
		public String Proveedores (Model modelo) {
			ArrayList<Proveedores> proveedor = new ArrayList<Proveedores>();
			proveedor.add(new Proveedores(16113001,"Hp","Brandon","Brandon@Hp.com","ASF6151",25698547,"Nezahualcóyotl"));
			proveedor.add(new Proveedores(16113007,"Dell","Sola","Sola@Dell.com","EASFAS5",78698456,"Ecatepec"));
			proveedor.add(new Proveedores(16114547,"Asus","Padilla","Amalia@Asus.com","FAFAS611",63298547,"Nezahualcóyotl"));
			proveedor.add(new Proveedores(16174127,"Hp","Julio","Julio@Hp.com","SFDCAS511",96398547,"Ecatepec"));
			proveedor.add(new Proveedores(16163577,"Dell","Lucia","lusia@Dell.com","AFSAS5151",14598547,"Nezahualcóyotl"));
			
			proveedor.add(new Proveedores(164534504,"Toshiba","Iván","Ivan@Toshiba.com","ASF51651",453698547,"Nezahualcóyotl"));
			proveedor.add(new Proveedores(164634534,"Dell","Samuel","Samuel@Walmart.com","AGSASFA5151",712456,"Ecatepec"));
			proveedor.add(new Proveedores(161453784,"Hp","Ernesto","Ernesto@Aurrera.com","ASF5A151",64538547,"Nezahualcóyotl"));
			proveedor.add(new Proveedores(164564856,"Dell","Pedro","Pedro@Elektra.com","ASFA15151",45398547,"Ecatepec"));
			proveedor.add(new Proveedores(16464563,"","Francisco","Francisco@Coppel.com","ASF1515",53598547,"Ecatepec"));
			
			modelo.addAttribute("Proveedores",proveedor);
			modelo.addAttribute("titulo","Tabla de Proveedores");
			return "Proveedores";
		}	
}
