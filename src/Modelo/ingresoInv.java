package Modelo;

public class ingresoInv {
	private String cantidad;
	private String nombreProducto;
	private String proveedor;
	private String fecha;
	
	
	Conectar cx = new Conectar();
	

	public ingresoInv() {
		
		
	}
	//Metodos Contructor
	
	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	//Metodos y Operaciones de las clases
	
	public int darIngreso(ingresoInv objeto){
		cx.con(); //Abrimos conexion
		
		String com = "INSERT INTO Producto (Detalle,Cantidad,Fecha,Proveedor)"+
						"VALUES ('"+objeto.getNombreProducto()+"','"+
									objeto.getCantidad()+"','"+objeto.getFecha()+"','"+
									objeto.getProveedor()+"')"; //Hacemos la consulta SQL
		
		int res = cx.excecQuery(com); //Ejecutamos la consulta
		
		cx.desconectar(); //Cerramos la conexion
		
		//System.out.println(objeto);
		
		System.out.println("Se guardo Exitosamente:"+com);
		
		return res;
	}
	
	public void listar_productos(){
		
		
	}

}
