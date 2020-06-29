package br.unipar.fgts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tela1<editText> extends AppCompatActivity {

    //obejtos da primeira tela
    editText plainTextCPFdoFavorecido;
    editText plaintTextDatadoNascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plainTextCPFdoFavorecido = (editText) findViewById(R.id.plaintTextCPFdoFavorecido);
        plaintTextDatadoNascimento = (editText) findViewById(R.id.plainTextDatadoNascimento);


        public void calcularDataPagamento(DatadoNascimento){


            Calendar DatadoNascimento = new GregorianCalendar();
            DatadoNascimento.setTime(DataNascimento);


            Calendar today = Calendar.getInstance();

            int ano = today.get(Calendar.YEAR);
            int mesInt = DatadoNascimento.get(Calendar.MONDAY) + 1;
            int diaInt  = DatadoNascimento.get(Calendar.DAY_OF_MONTH) + 20;

            if(diaInt > 31){
                int diaSobra = diaInt - 31;
                diaInt = 0;
                mesInt = DatadoNascimento.get(Calendar.MONDAY) + 2;
                diaInt  = diaInt + diaSobra;




    }
        public  void goToNewActivity() {
            Intent intent = new Intent(firstActivity.this, SecondActivity.class);
            Bundle b = new Bundle();
            String pagamentoBeneficio = b.getString("dataPagamento");


            finish();
}
