package anascoding.com.br.idadecachorro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtIdade = null;
    Button btnDescobrirIdade = null;
    TextView txtResultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtIdade = (EditText) findViewById(R.id.edtIdade);
        btnDescobrirIdade = (Button) findViewById(R.id.btnDescobrirIdade);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnDescobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idadeTexto = edtIdade.getText().toString();
                if (idadeTexto.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Digite uma idade", Toast.LENGTH_SHORT).show();
                    txtResultado.setText("");
                } else {
                    int idadeValor = Integer.parseInt(idadeTexto);
                    txtResultado.setText(String.format("A idade em anos humanos é: %s anos", idadeValor * 7));
                }
            }
        });
    }
}