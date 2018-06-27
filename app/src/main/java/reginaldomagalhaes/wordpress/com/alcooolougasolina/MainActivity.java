package reginaldomagalhaes.wordpress.com.alcooolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoGasolina;
    private EditText precoAlcool;
    private Button botaoverificar;
    private TextView textoresultdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        precoGasolina = (EditText) findViewById(R.id.caixaPrecoGasolina_id);
        precoAlcool = (EditText) findViewById(R.id.caixaPrecoAlcool_id);
        botaoverificar = (Button) findViewById(R.id.botaoVerificar_id);
        textoresultdo= (TextView) findViewById(R.id.textoSaida_id);
        botaoverificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoPrecoGasolina = precoGasolina.getText().toString();
                String textoPrecoAlcool = precoAlcool.getText().toString();
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double resultado = valorAlcool / valorGasolina;

                if (resultado >= 0.7) {
                    textoresultdo.setText("É melhor usar gasolina, pois é maior que 70%");
                } else {
                    textoresultdo.setText("É melhor usar alcool, pois é menor que 70%");
                }
            }


        });



    };
}