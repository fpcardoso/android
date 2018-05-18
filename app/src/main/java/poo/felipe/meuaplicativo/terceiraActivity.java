package poo.felipe.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class terceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        Intent intent =getIntent();
        TextView ola = (TextView) findViewById(R.id.tVCompleto);
        TextView sobrenome = (TextView) findViewById(R.id.tVSaida);
        ola.setText(intent.getStringExtra("completo"));
    }
}
