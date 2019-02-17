package pe.edu.cibertec.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Vista
    RecyclerView rvProduct;

    //Modelo: Informacion a mostrar
    ArrayList<Product> products;

    //Adaptador
    AdapterProduct adapterProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlaza variable con su vista a partir del id
        rvProduct = findViewById(R.id.rvProduct);

        //Asigna espacio de memoria para el arreglo
        products = new ArrayList<>();

        //Carga la informacion a mostrar
        loadItems();

        //Inicializo el Adaptador
        adapterProduct = new AdapterProduct(products);
    }

    private void loadItems() {
        Product productoLaptop = new Product("Laptop","Lenovo 790",10);
        products.add(productoLaptop);

        Product productoMouse = new Product("Mouse","Logitech M54",16);
        products.add(productoMouse);

    }
}
