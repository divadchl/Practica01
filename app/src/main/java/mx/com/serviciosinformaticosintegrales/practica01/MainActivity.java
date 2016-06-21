package mx.com.serviciosinformaticosintegrales.practica01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mx.com.serviciosinformaticosintegrales.practica01.fragmento.FragmentoBinario;
import mx.com.serviciosinformaticosintegrales.practica01.fragmento.FragmentoDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.btnBinaria).setOnClickListener(this);
        findViewById(R.id.btnDecimal).setOnClickListener(this);
    }

    @Override
    public void onClick(final View clicked) {
        switch (clicked.getId())
        {
            case R.id.btnBinaria:
                cambiarFragmento1();
                break;
            case R.id.btnDecimal:
                cambiarFragmento2();
                break;
        }
    }

    private void cambiarFragmento1() {
        FragmentoBinario f = FragmentoBinario.newInstance();
        getFragmentManager().beginTransaction().replace(R.id.fragmentHolder, f).commit();
    }
    private void cambiarFragmento2() {
        getFragmentManager().beginTransaction().replace(R.id.fragmentHolder, new FragmentoDecimal()).commit();
    }
}
