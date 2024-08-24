package com.upb.mirestaurant;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void abrirMenu (View v){
        Intent i; //intent : forma en la que se comunican las clases
        i= new Intent(this, MenuActivity.class); //(actividad actual , a donde quiere ir)
        startActivity(i); //lanzar la actividad
    }

    public void abrirSede (View v){
        Intent i; //intent : forma en la que se comunican las clases
        i= new Intent(this, MapsActivity.class); //(actividad actual , a donde quiere ir)
        startActivity(i); //lanzar la actividad
    }

    public void abrirReserva (View v){
        String numero="+573127336596";
        String mensaje="¡Hola! me gustaria realizar una reserva en este lugar";
        String url="https://api.whatsapp.com/send?phone="+numero+ "&text=" + Uri.encode(mensaje);
        String whatsapp = "com.whatsapp";

        PackageManager pm=getPackageManager();

        try {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        } catch (Exception e) {
            // WhatsApp no esta instalado, abrir navegador
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(i);
        }

        /*
        Intent i= pm.getLaunchIntentForPackage(whatsapp);
        startActivity(i);
         */
    }
    public void abrirPedido (View v){
        /*
        Intent i; //intent : forma en la que se comunican las clases
        i= new Intent(this, PedidoActivity.class); //(actividad actual , a donde quiere ir)
        startActivity(i); //lanzar la actividad

         */
        String numero="+573127336596";
        String mensaje="¡Hola! me gustaria realizar un pedido en este lugar, deseo\n Entradas:\nPlatos Fuertes:\n" +
                "Bebidas:\nPostres:\nMuchas Gracias";
        String url="https://api.whatsapp.com/send?phone="+numero+ "&text=" + Uri.encode(mensaje);
        String whatsapp = "com.whatsapp";

        PackageManager pm=getPackageManager();

        try {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        } catch (Exception e) {
            // WhatsApp no esta instalado, abrir navegador
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(i);
        }
    }
}