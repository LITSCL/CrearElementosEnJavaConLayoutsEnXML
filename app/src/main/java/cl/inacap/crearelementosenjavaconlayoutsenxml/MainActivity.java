package cl.inacap.crearelementosenjavaconlayoutsenxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView texto0Tv;
    private TextView texto1Tv;
    private TextView texto2Tv;
    private TextView texto3Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. Se definen los layout (Se esta utilizando el layout del XML utilizando el id).
        LinearLayout primerLayout = (LinearLayout)findViewById(R.id.primerLayout);
        LinearLayout segundoLayout = (LinearLayout)findViewById(R.id.segundoLayout);

        //2. Se crean los View necesarios.
        this.texto0Tv = new TextView(this);
        this.texto1Tv = new TextView(this);
        this.texto2Tv = new TextView(this);
        this.texto3Tv = new TextView(this);

        //3. Se añaden propiedades a los View.
        texto1Tv.setText("Hola Mundo 1");
        texto2Tv.setText("Hola Mundo 2");
        texto3Tv.setText("Hola Mundo 3");

        //4. Se añaden los View al Layout.
        primerLayout.addView(texto1Tv);
        segundoLayout.addView(texto2Tv);
        segundoLayout.addView(texto3Tv);
    }
}