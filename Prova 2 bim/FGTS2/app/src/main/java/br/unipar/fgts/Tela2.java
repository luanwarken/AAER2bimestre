package br.unipar.fgts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Tela2 extends AppCompatActivity {

    View textDatadoPagamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textDatadoPagamento = findViewById(R.id.textDatadoPagamento);
    }

    public void inTheSecondActivity() {
        Bundle b = getIntent().getExtras();
        int param1 = -1;
        if(b != null) {
            param1 = b.getInt("param1");
}
