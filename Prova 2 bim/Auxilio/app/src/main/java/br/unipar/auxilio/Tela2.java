package br.unipar.auxilio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Tela2<editText> extends AppCompatActivity {

    //objetos da tela
    View textDatadoPagamento;
    View textSaldoaReceber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textDatadoPagamento = findViewById(R.id.textDatadoPagamento);
        textSaldoaReceber = findViewById(R.id.SaldoaRecer);
    }

    public void inTheSecondActivity() {
        Bundle b = getIntent().getExtras();
        int param1 = -1;
        if(b != null) {
            param1 = b.getInt("param1");
        }
    }
}
