package mx.edu.ittepic.michel.tpdm_u1_practica1_uribesharon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText name;
    TextView gra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnregistrar);
        name = findViewById(R.id.camponombre);
        gra = findViewById(R.id.gra);
    }

    public void mensajeboton(View v){
        gra.setText("Gracias por inscribir a "+name.getText().toString());
    }
}
