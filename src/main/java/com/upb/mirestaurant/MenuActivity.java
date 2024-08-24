package com.upb.mirestaurant;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends ListActivity {

    private String [] categoriasProductos = new String[]{"Entradas","Platos Fuertes", "Bebidas","Postres","Licores"};
    private ListView listaCategorias=null;
    private ListAdapter adaptadorLista=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listaCategorias=findViewById(android.R.id.list);
        adaptadorLista= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                categoriasProductos);
        listaCategorias.setAdapter(adaptadorLista);
    }

    protected void onListItemClick(ListView lv, View v, int position, long id){
        super.onListItemClick(lv,v,position,id);
        if(position== 0){
            Intent i; //intent : forma en la que se comunican las clases
            i= new Intent(this, ProductoActivity.class); //(actividad actual , a donde quiere ir)
            //lo nuevo
            i.putExtra("categoria",categoriasProductos[position]);
            //esto no
            startActivity(i); //lanzar la actividad
        }
        if(position== 1){
            Intent i;
            i= new Intent(this, ProductoActivity.class);
            //lo nuevo
            i.putExtra("categoria",categoriasProductos[position]);
            //esto no
            startActivity(i);
        }
        if(position== 2){
            Intent i; //intent : forma en la que se comunican las clases
            i= new Intent(this, ProductoActivity.class);
            //lo nuevo
            i.putExtra("categoria",categoriasProductos[position]);
            //esto no
            startActivity(i);
        }
        if(position== 3){
            Intent i; //intent : forma en la que se comunican las clases
            i= new Intent(this, ProductoActivity.class);
            //lo nuevo
            i.putExtra("categoria",categoriasProductos[position]);
            //esto no
            startActivity(i);
        }
        if(position== 4){
            Intent i; //intent : forma en la que se comunican las clases
            i= new Intent(this, ProductoActivity.class);
            //lo nuevo
            i.putExtra("categoria",categoriasProductos[position]);
            //esto no
            startActivity(i);
        }

    }
}