package mx.com.serviciosinformaticosintegrales.practica01.fragmento;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mx.com.serviciosinformaticosintegrales.practica01.R;

/**
 * Created by David on 20/06/2016.
 */
public class FragmentoBinario extends Fragment implements View.OnClickListener {

    private TextView txvResultado;
    private boolean blnSuma=false;
    private String strContenidoEditText="";
    private String[] numerosBin = new String[2];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_binario, container, false);

        view.findViewById(R.id.btnBin0).setOnClickListener(this);
        view.findViewById(R.id.btnBin1).setOnClickListener(this);
        view.findViewById(R.id.btnBinSuma).setOnClickListener(this);
        view.findViewById(R.id.btnBinIgual).setOnClickListener(this);
        view.findViewById(R.id.btnBinLimpiar).setOnClickListener(this);
        view.findViewById(R.id.btnBinSuprimir).setOnClickListener(this);
        txvResultado = (TextView) view.findViewById(R.id.txvResultado);

        return view;
    }

    @Override
    public void onClick(final View clicked) {

        strContenidoEditText = txvResultado.getText().toString();

        try {
            switch (clicked.getId()) {
                case R.id.btnBinLimpiar:
                    blnSuma= false;
                    txvResultado.setText("");
                    break;
                case R.id.btnBinSuprimir:
                    if(strContenidoEditText.length()==1)
                    {
                        txvResultado.setText("");
                    }
                    else
                    {
                        txvResultado.setText(strContenidoEditText.substring(0, strContenidoEditText.length() -1));
                    }
                    break;
                case R.id.btnBin0:
                    txvResultado.setText(strContenidoEditText + "0");
                    break;
                case R.id.btnBin1:
                    txvResultado.setText(strContenidoEditText + "1");
                    break;
                case R.id.btnBinSuma:
                    blnSuma= true;
                    numerosBin[0]=strContenidoEditText;
                    txvResultado.setText("");
                    break;
                case R.id.btnBinIgual:
                    numerosBin[1]= strContenidoEditText;
                    if(blnSuma == true)
                    {
                        int a= Integer.parseInt(numerosBin[0],2);
                        int b= Integer.parseInt(numerosBin[1],2);
                        int c = a+b;
                        txvResultado.setText(String.valueOf(Integer.toString(c,2)));
                    }
                    blnSuma=false;
                    break;
            }
        }catch(Exception e){
            txvResultado.setText("Error");
        }
    }






}
