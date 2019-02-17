package pe.edu.cibertec.inventory;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

//Importante heredar de la Clase RecyclerView.Adapter<VH> VH:ViewHolder
public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ProductPrototype> {

    ArrayList<Product> items;

    public AdapterProduct(ArrayList<Product> items) {
        this.items = items;
    }

    //Crea la vista en base al Prototipo por cada Celda (Plantilla para cada item)
    @NonNull
    @Override
    public ProductPrototype onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    //Carga la informacion por cada celda, de acuerdo a la posicion
    @Override
    public void onBindViewHolder(@NonNull ProductPrototype productPrototype, int i) {

    }

    //Indica la cantidad de registros en el RecyclerView
    @Override
    public int getItemCount() {
        return items.size();
    }

    //For access Adapter<ProductPrototype> change to public
    // Desciende de la clase ViewHolder
    public class ProductPrototype extends RecyclerView.ViewHolder {

        TextView tvName, tvDescription, tvQuantity;

        public ProductPrototype(@NonNull View itemView) {
            super(itemView);

            //Aprovechar el itemView que es de tipo View para acceder al Id
            tvName = itemView.findViewById(R.id.txtName);
            tvDescription = itemView.findViewById(R.id.txtDescription);
            tvQuantity = itemView.findViewById(R.id.txtQuantity);
        }
    }
}
