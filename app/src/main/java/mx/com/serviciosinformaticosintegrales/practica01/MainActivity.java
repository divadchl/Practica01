package mx.com.serviciosinformaticosintegrales.practica01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mx.com.serviciosinformaticosintegrales.practica01.fragmento.FragmentoBinario;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.btnDecimal).setOnClickListener(this);
    }

    @Override
    public void onClick(final View clicked) {
        switch (clicked.getId())
        {
            case R.id.btnDecimal:
                cambiarFragmento1();
                break;
            case R.id.btnBinaria:
                cambiarFragmento2();
                break;
        }
    }

    private void cambiarFragmento1() {
        getFragmentManager().beginTransaction().replace(R.id.fragmentHolder).commit();
    }
}
