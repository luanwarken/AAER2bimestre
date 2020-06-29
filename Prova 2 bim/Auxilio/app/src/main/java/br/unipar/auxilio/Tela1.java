package br.unipar.auxilio;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Tela1<editText> extends AppCompatActivity {

    //objetos da tela
    editText textAuxílio;
    editText plainTextCPFdoFavorecido;
    editText plaintTextDatadoNascimento;
    editText plaintTextRendaMensal;
     int RendaMensal;
     String testeRendaMensal;



    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textAuxílio = (editText) findViewById(R.id.textAuxílio);
        plainTextCPFdoFavorecido = (editText) findViewById(R.id.plaintTextCPFdoFavorecido);
        plaintTextDatadoNascimento = (editText) findViewById(R.id.plainTextDatadoNascimento);
        plaintTextRendaMensal = (editText) findViewById(R.id.plainTextRendaMensal);



            //calculo do teto
            double SaldoaReceber = ( RendaMensal *0.70);
            if (RendaMensal > 475) RendaMensal = 475;

            //calcular auxilio
            if(RendaMensal > 5000);
                testeRendaMensal = "O auxílio foi negado";



          //calcular a idade

            int DiadoNascimento = 0;
            int MesdoNascimento = 0;
            int AnodoNascimento;

            Calendar dataNasc=Calendar.getInstance();
            try {
                dataNasc.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("Diadonascimento/MesdoNascimento/AnodoNascimento"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            dataNasc.add(Calendar.YEAR, 18);

            //Data do Pagamento


        LocalDate d1 = LocalDate.of( 2020, MesdoNascimento, DiadoNascimento);
        LocalDate d2 = d1.plusDays(20);


        }
         public  void goToNewActivity() {
            Intent intent = new Intent(firstActivity.this, SecondActivity.class);
            Bundle b = new Bundle();
             String pagamentoBeneficio = b.getString("dataPagamento");
             Double saldoReceberBeneficio = b.getDouble("saldoReceber");

            finish();















        }







    }

