/*
Ejercicio 2
Una empresa de ventas desea gestionar el control de viajantes de la misma. Para cada viajante, controla:
� DNI
� Nombre
� Antig�edad
� Distancia recorrida (Km)
� Ventas realizadas
Las ventas contienen la informaci�n siguiente:
� Fecha
� Importe
� Cliente
� Cobrada (seg�n se haya ingresado su importe o no)
Crear un programa que muestre un men� y permita:
1. A�adir un viajante
2. Eliminar un viajante
3. Mostrar un listado de todos los viajantes, indicando la distancia recorrida y el importe acumulado de
	las ventas cobradas
4. Inicializar ventas: la distancia recorrida de todos los viajantes pasar� a ser cero y las ventas cobradas
de todos ellos se almacenar�n en el hist�rico, elimin�ndolas (del programa)
5. Incrementar la distancia recorrida por un viajante (deber� pedir el n�mero de kil�metros recorridos)
6. A�adir una venta de un viajante
7. Cobrar una venta de un viajante
8. Mostrar un listado de todas las ventas no cobradas de un viajante
8. Terminar el programa
Los datos de los viajantes deben ser le�dos de un fichero al inicio de la ejecuci�n del programa, si dicho
fichero existe. An�logamente, ser�n almacenados en dicho fichero antes de finalizar el programa que, si no
exist�a, ser� creado en ese momento. Existir�n dos ficheros m�s: de hist�rico de ventas y de ventas; el
programa solo leer�, al inicio, el de ventas, si existe, y almacenar� en el mismo los datos antes de finalizar.
El hist�rico de ventas almacenar� las ventas cobradas hasta el momento de inicializaci�n de ventas (opci�n
4): si no existe, se crear�; si existe, se a�adir�n las ventas al fichero actual.
 */
public class Venta {
	private String fecha;
	private int importe;
	private String cliente;
	private boolean cobrada;
	public Venta(String fecha, int importe, String cliente, boolean cobrada) {
		this.fecha = fecha;
		this.importe = importe;
		this.cliente = cliente;
		this.cobrada = cobrada;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public boolean isCobrada() {
		return cobrada;
	}
	public void setCobrada(boolean cobrada) {
		this.cobrada = cobrada;
	}
	public String toString() {
		return fecha + "\t" + importe + "\t" + cliente + "\t" + cobrada;
	}
}
