package com.example.decimoterceiro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView tvResultFerias, tvDecTerceiro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        setTitle("Valores a receber");

        tvResultFerias = (TextView)findViewById(R.id.txtResultadoFerias);
        tvDecTerceiro = (TextView)findViewById(R.id.txtDecTerc);

        Bundle dados = getIntent().getExtras();

        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        double meses, salario, ferias, dt;
        meses = Double.parseDouble(usuario.getMeses());
        salario = Double.parseDouble(usuario.getSalario());
        ferias = (double) salario + (salario / 3);
        dt = salario * (meses / 12);

        tvResultFerias.setText(String.valueOf(ferias));
        tvDecTerceiro.setText(String.valueOf(dt));
    }
}