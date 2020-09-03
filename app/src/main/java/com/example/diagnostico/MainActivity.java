package com.example.diagnostico;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
//DECLARO LAS VARIABLES QUE VOY A OCUPAR
    private static final Random rgenerador = new Random();
    //AQUI OCUPARE UN VECTOR
    private static final Integer[] imagenesID=
            //INTEGRO LAS IMAGENES
            {R.drawable.imagen,R.drawable.imagen2,R.drawable.imagen3,R.drawable.imagen4,R.drawable.imagen5,R.drawable.imagen6,
            R.drawable.imagen7,R.drawable.imagen8,R.drawable.imagen9,R.drawable.imagen10,R.drawable.imagen11,R.drawable.imagen12,
            R.drawable.imagen13,R.drawable.imagen14,R.drawable.imagen15,R.drawable.imagen16,R.drawable.imagen17,R.drawable.imagen18};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //AQUI INICIALIZARE LAS VARIABLES
        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        //LE ASIGNO LA FUNCION AL BOTON
        View nextButton = findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int resource =
                                //ACTIVO EL RANDOM
                                imagenesID[rgenerador.nextInt(imagenesID.length)];
                                iv.setImageResource(resource);
                        }
        });
    }
}