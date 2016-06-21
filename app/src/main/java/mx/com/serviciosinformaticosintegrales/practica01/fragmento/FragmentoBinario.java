package mx.com.serviciosinformaticosintegrales.practica01.fragmento;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.com.serviciosinformaticosintegrales.practica01.R;

/**
 * Created by David on 20/06/2016.
 */
public class FragmentoBinario extends Fragment {

    public static FragmentoBinario newInstance()
    {
        FragmentoBinario f = new FragmentoBinario();

        return f;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_binario, container, false);


        return view;
    }
}
