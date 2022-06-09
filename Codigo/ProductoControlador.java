package TA10;

public class ProductoControlador {

    private Producto producto[];
    private String codigoProd;
    private String nombreProd;
    private double precioProd;
    private int contador;
    
    public ProductoControlador(int cantidad)
    {
        this.producto = new Producto[cantidad];

        this.contador = 0;
    }

    public void addProducto(String codigo, String nombre, double precio)
    {
        this.producto[this.contador] = new Producto(codigo, nombre,precio);

        this.contador++;
    }

    public Producto buscarProd(String codigo)
    {
        int i;
        i=0;
        while (i<this.contador)
        {
            if(this.producto[i].getCodigo()==codigo)
            {
                break;
            }
            i++;
        }
        if(i == this.contador)
        {
            return null;
        } else {
            return this.producto[i];
        }
    }

    public Producto[] listarProd()
    {
        return this.producto;
    }

    public void listar()
    {
        for(int i=0; i<this.contador; i++)
        {
            this.producto[i].listarProducto();
        }
    }


    public String getCodigoProd() {
        return codigoProd;
        }
    public String getNombreProd() {
        return nombreProd;
        }
    public double getPrecioProd() {
        return precioProd;
        }
    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }
    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }
    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }


}