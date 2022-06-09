package TA10;
public class Main {
    public static void main(String args[])
    {
        ProductoControlador productoControlador = new ProductoControlador(4);

        productoControlador.addProducto("01", "Gaseosa",3);
        productoControlador.addProducto("02", "Agua",1);
        productoControlador.addProducto("03", "Dulces",2);
        productoControlador.addProducto("04", "Galleta",2);

        System.out.println("  ");
        System.out.println(" -Listado de Productos- ");
        System.out.println("  ");
        for(Producto p : productoControlador.listarProd())
        {
            System.out.println("Codigo: "+ p.getCodigo());
            System.out.println("Nombre: "+ p.getNombre());
            System.out.println("Precio: "+ p.getPrecio());
            System.out.println("  ");
        }
        System.out.println(" -Busqueda de Producto- ");
        System.out.println("Codigo de producto buscado: 04 ");
        String producto = "04";
        Producto encontrado;
        encontrado = productoControlador.buscarProd(producto);

        if(encontrado != null)
        {
            System.out.println("  ");
            System.out.println("-Producto encontrado: -");
            System.out.println("Codigo: "+ encontrado.getCodigo());
            System.out.println("Nombre: "+ encontrado.getNombre());
            System.out.println("Precio: "+ encontrado.getPrecio());
            System.out.println("  ");
        } else {

            System.out.println("No se encontro el codigo buscado: "+producto);
        }

    }
}