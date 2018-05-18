package poo.felipe.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class segundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent =getIntent();
        TextView ola = (TextView) findViewById(R.id.tVSaida);
        ola.setText(intent.getStringExtra("mensagem"));

    }

    public void sobrenome(View view){
        EditText caixa = (EditText) findViewById(R.id.eTSobrenome);

        String mensagem = caixa.getText().toString();

        Intent intent = new Intent(this,terceiraActivity.class);
        intent.putExtra("completo",mensagem);

        startActivity(intent);


    }
}
