import java.text.DecimalFormat;

public class factura {
    public static void main(String[] args) {
        // Datos de la factura
        String nombreCliente = "Cliente XYZ";
        String direccion = "123 Calle Principal";
        String fecha = "2023-11-09";
        int numeroFactura = 1001;

        // Elementos facturados
        String[] productos = {"Producto A", "Producto B", "Producto C"};
        double[] precios = {10.50, 20.30, 15.75};

        // Calcular el subtotal
        double subtotal = 0;
        for (double precio : precios) {
            subtotal += precio;
        }

        // Calcular impuestos (por ejemplo, IVA del 21%)
        double iva = subtotal * 0.21;

        // Calcular el total
        double total = subtotal + iva;

        // Formatear cantidades a dos decimales
        DecimalFormat df = new DecimalFormat("#.##");
        String subtotalFormateado = df.format(subtotal);
        String ivaFormateado = df.format(iva);
        String totalFormateado = df.format(total);

        // Imprimir la factura
        System.out.println("****** FACTURA ******");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Dirección: " + direccion);
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de Factura: " + numeroFactura);
        System.out.println("_____________________");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - " + precios[i]);
        }
        System.out.println("_____________________");
        System.out.println("Subtotal: $" + subtotalFormateado);
        System.out.println("IVA (21%): $" + ivaFormateado);
        System.out.println("Total: $" + totalFormateado);
    }
}
  

