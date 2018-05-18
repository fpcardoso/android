package poo.felipe.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void olaNome(View view){
        EditText caixa = (EditText) findViewById(R.id.eTNome);

        TextView ola = (TextView) findViewById(R.id.tVOla);

        String mensagem = caixa.getText().toString();

        ola.setText(mensagem);

        Intent intent = new Intent(this,segundaActivity.class);


        intent.putExtra("mensagem",mensagem);

        startActivity(intent);

    }

}
