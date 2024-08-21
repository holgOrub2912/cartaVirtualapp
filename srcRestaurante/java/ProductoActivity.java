package com.upb.mirestaurant;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ProductoActivity extends ListActivity {

    public class Producto{
        private String nombreProducto;
        private String ingredientesProducto;
        private String precioProducto;
        private Integer imagenProducto;
    }
    private MyAdapter adaptador=null;
    private static ArrayList<Producto> arregloProductos=new ArrayList<Producto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        //lo nuevo
        String categoriaSeleccionada=getIntent().getStringExtra("categoria");

        //esto no
        setData(categoriaSeleccionada);
        adaptador= new MyAdapter(this);
        setListAdapter(adaptador);

        /*
        setContentView(R.layout.activity_producto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         */
    }

    private void setData(String categoriaSeleccionada){
        arregloProductos.clear();

        if(categoriaSeleccionada.equals("Entradas")){
            //Entrada 1
            Producto productoActual1=new Producto();
            productoActual1.nombreProducto=this.getResources().getString(R.string.entrada1);
            productoActual1.ingredientesProducto=this.getResources().getString(R.string.ing_entrada1);
            productoActual1.precioProducto=this.getResources().getString(R.string.precio_entrada1);
            productoActual1.imagenProducto=R.drawable.pasos;
            arregloProductos.add(productoActual1);

            //Entrada 2
            Producto productoActual2=new Producto();
            productoActual2.nombreProducto=this.getResources().getString(R.string.entrada2);
            productoActual2.ingredientesProducto=this.getResources().getString(R.string.ing_entrada2);
            productoActual2.precioProducto=this.getResources().getString(R.string.precio_entrada2);
            productoActual2.imagenProducto=R.drawable.naemda;
            arregloProductos.add(productoActual2);

            //Entrada 3
            Producto productoActual3=new Producto();
            productoActual3.nombreProducto=this.getResources().getString(R.string.entrada3);
            productoActual3.ingredientesProducto=this.getResources().getString(R.string.ing_entrada3);
            productoActual3.precioProducto=this.getResources().getString(R.string.precio_entrada3);
            productoActual3.imagenProducto=R.drawable.capaton;
            arregloProductos.add(productoActual3);
        }
        if(categoriaSeleccionada.equals("Bebidas")){
            Producto productoActual3=new Producto();
            productoActual3.nombreProducto=this.getResources().getString(R.string.bebida1);
            productoActual3.ingredientesProducto=this.getResources().getString(R.string.ing_bebida1);
            productoActual3.precioProducto=this.getResources().getString(R.string.precio_bebida1);
            productoActual3.imagenProducto=R.drawable.gojus;
            arregloProductos.add(productoActual3);

            Producto productoActual2=new Producto();
            productoActual2.nombreProducto=this.getResources().getString(R.string.bebida2);
            productoActual2.ingredientesProducto=this.getResources().getString(R.string.ing_bebida2);
            productoActual2.precioProducto=this.getResources().getString(R.string.precio_bebida2);
            productoActual2.imagenProducto=R.drawable.goseasas;
            arregloProductos.add(productoActual2);

        }
        if(categoriaSeleccionada.equals("Platos Fuertes")){

            Producto productoActual1=new Producto();
            productoActual1.nombreProducto=this.getResources().getString(R.string.platoFuerte1);
            productoActual1.ingredientesProducto=this.getResources().getString(R.string.ing_platoFuerte1);
            productoActual1.precioProducto=this.getResources().getString(R.string.precio_platoFuerte1);
            productoActual1.imagenProducto=R.drawable.necars;
            arregloProductos.add(productoActual1);

            Producto productoActual2=new Producto();
            productoActual2.nombreProducto=this.getResources().getString(R.string.platoFuerte2);
            productoActual2.ingredientesProducto=this.getResources().getString(R.string.ing_platoFuerte2);
            productoActual2.precioProducto=this.getResources().getString(R.string.precio_platoFuerte2);
            productoActual2.imagenProducto=R.drawable.picoti;
            arregloProductos.add(productoActual2);

            Producto productoActual3=new Producto();
            productoActual3.nombreProducto=this.getResources().getString(R.string.platoFuerte3);
            productoActual3.ingredientesProducto=this.getResources().getString(R.string.ing_platoFuerte3);
            productoActual3.precioProducto=this.getResources().getString(R.string.precio_platoFuerte3);
            productoActual3.imagenProducto=R.drawable.taliani;
            arregloProductos.add(productoActual3);
        }
        if(categoriaSeleccionada.equals("Postres")){

            Producto productoActual1=new Producto();
            productoActual1.nombreProducto=this.getResources().getString(R.string.postre1);
            productoActual1.ingredientesProducto=this.getResources().getString(R.string.ing_postre1);
            productoActual1.precioProducto=this.getResources().getString(R.string.precio_postre1);
            productoActual1.imagenProducto=R.drawable.dolahe;
            arregloProductos.add(productoActual1);


            Producto productoActual2=new Producto();
            productoActual2.nombreProducto=this.getResources().getString(R.string.postre2);
            productoActual2.ingredientesProducto=this.getResources().getString(R.string.ing_postre2);
            productoActual2.precioProducto=this.getResources().getString(R.string.precio_postre2);
            productoActual2.imagenProducto=R.drawable.surimita;
            arregloProductos.add(productoActual2);
        }
        if(categoriaSeleccionada.equals("Licores")){

            Producto productoActual1=new Producto();
            productoActual1.nombreProducto=this.getResources().getString(R.string.licor1);
            productoActual1.ingredientesProducto=this.getResources().getString(R.string.ing_licor1);
            productoActual1.precioProducto=this.getResources().getString(R.string.precio_licor1);
            productoActual1.imagenProducto=R.drawable.zarvece;
            arregloProductos.add(productoActual1);

            Producto productoActual2=new Producto();
            productoActual2.nombreProducto=this.getResources().getString(R.string.licor2);
            productoActual2.ingredientesProducto=this.getResources().getString(R.string.ing_licor2);
            productoActual2.precioProducto=this.getResources().getString(R.string.precio_licor2);
            productoActual2.imagenProducto=R.drawable.esovitra;
            arregloProductos.add(productoActual2);
        }

    }

    public static class MyAdapter extends BaseAdapter {

        private Context myContexto;
        public MyAdapter(Context c){
            myContexto=c;
        }
        @Override
        public int getCount(){
            return arregloProductos.size();
        }
        @Override
        public Object getItem(int arg){
            return arregloProductos.get(arg);
        }
        @Override
        public long getItemId(int arg){
            return 0;
        }
        @Override
        public View getView(int position, View vista, ViewGroup arg2){

            View view=null;

            if(vista==null){
                LayoutInflater inflater=(LayoutInflater) myContexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view= inflater.inflate(R.layout.activity_producto, null);
            }
            else{
                view=vista;
            }

            //Tabla Dinamica
            /* Problema*/
            ImageView ingProducto=(ImageView) view.findViewById(R.id.imageViewProducto);
            ingProducto.setImageDrawable(myContexto.getResources().getDrawable(arregloProductos.get(position).imagenProducto));

            TextView nombreProducto=(TextView) view.findViewById(R.id.textViewProducto);
            nombreProducto.setText(arregloProductos.get(position).nombreProducto);

            TextView ingredientesProducto=(TextView) view.findViewById(R.id.textViewIngredientes);
            ingredientesProducto.setText(arregloProductos.get(position).ingredientesProducto);

            TextView precioProducto=(TextView) view.findViewById(R.id.textViewPrecio);
            precioProducto.setText(arregloProductos.get(position).precioProducto);

            return view;
        }
    }
}