package victorbisquert.introduccionandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables de la inter
    private EditText ptnombre;
    private TextView lblsaludo;
    private Button btnenter;
    private Button btndelete;

    //variables codigo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaVistas();

        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!ptnombre.getText().toString().trim().equalsIgnoreCase("")){
                    lblsaludo.setText("Saludos "+ptnombre.getText());
                }

            }
        });

    }
    private void inicializaVistas() {
        ptnombre = findViewById(R.id.ptnombre);
        lblsaludo = findViewById(R.id.lblsaludo);
        btnenter = findViewById(R.id.btnsaludo);
        btndelete = findViewById(R.id.btndelete);
    }
}