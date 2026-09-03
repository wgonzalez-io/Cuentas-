import java.util.Scanner; //Este será un programa que nos ayudara a repartir la cuenta de una mesa entre varias personas, incluyendo el porcentaje de propina que se desea dejar.
import java.util.ArrayList;
public class division {
   
    static class persona{
        String nombre;
        double consumo;
        public persona(String nombre, double consumo){
            this.nombre = nombre;
            this.consumo = consumo;
        }
        public void mostrarDatos(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Consumo: " + consumo);
        }

    }    
    static class consumo{
        String producto;
        double precio;
        persona cliente;
        public consumo(String producto, double precio, persona cliente){
            this.producto = producto;
            this.precio = precio;
            this.cliente = cliente;
        }
        public void mostrarDatos(){
            System.out.println("Producto: " + producto);
            System.out.println("Precio: " + precio);
            System.out.println("Cliente: " + cliente.nombre);
        }
        public void calcularConsumo(){
            cliente.consumo += precio;
        }
    }

    static class gastoCompartido{
        double montoTotal;
        String descripcion;
        double porcentajePropina;
        public gastoCompartido(double montoTotal, String descripcion, double porcentajePropina){
            this.montoTotal = montoTotal;
            this.descripcion = descripcion;
            this.porcentajePropina = porcentajePropina;
        }
    }

    static class mesa{
         ArrayList<persona> personas;
         ArrayList<consumo> consumos;
        public mesa(){
            this.personas = new ArrayList<>();
            this.consumos = new ArrayList<>();
        }
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        persona waskart = new persona("Waskart", 800);
        consumo consumo1 = new consumo("Pollo a la plancha", 400, waskart);
        consumo1.mostrarDatos();
        consumo1.calcularConsumo();
        waskart.mostrarDatos();
        persona mateo = new persona("mateo", 100);
        consumo consumo2 = new consumo("Carne asada", 500, mateo);
        consumo2.calcularConsumo();
        consumo2.mostrarDatos();
        mateo.mostrarDatos();
        sc.close();
    }
}
