package mx.com.serviciosinformaticosintegrales.practica01.fragmento;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mx.com.serviciosinformaticosintegrales.practica01.R;

/**
 * Created by David on 20/06/2016.
 */
public class FragmentoDecimal extends Fragment implements View.OnClickListener {
    private TextView txvOperaciones;
    private TextView txvResultado;
    private String strContenidoEditText="h";

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_decimal,container,false);
        view.findViewById(R.id.btnClear).setOnClickListener(this);
        view.findViewById(R.id.btnDivision).setOnClickListener(this);
        view.findViewById(R.id.btn7).setOnClickListener(this);
        view.findViewById(R.id.btn8).setOnClickListener(this);
        view.findViewById(R.id.btn9).setOnClickListener(this);
        view.findViewById(R.id.btnMultiplicacion).setOnClickListener(this);
        view.findViewById(R.id.btn4).setOnClickListener(this);
        view.findViewById(R.id.btn5).setOnClickListener(this);
        view.findViewById(R.id.btn6).setOnClickListener(this);
        view.findViewById(R.id.btnResta).setOnClickListener(this);
        view.findViewById(R.id.btn1).setOnClickListener(this);
        view.findViewById(R.id.btn2).setOnClickListener(this);
        view.findViewById(R.id.btn3).setOnClickListener(this);
        view.findViewById(R.id.btnSuma).setOnClickListener(this);
        view.findViewById(R.id.btn0).setOnClickListener(this);
        view.findViewById(R.id.btnPunto).setOnClickListener(this);
        view.findViewById(R.id.btnIgual).setOnClickListener(this);

        txvOperaciones = (TextView) view.findViewById(R.id.txvOperaciones);
        txvResultado = (TextView) view.findViewById(R.id.txvResultado);

        return view;
    }


    @Override
    public void onClick(final View clicked) {
        switch (clicked.getId())
        {
            case R.id.btnClear:
                txvOperaciones.setText("");
                txvResultado.setText("");
                break;
            case R.id.btnDivision:
                txvOperaciones.setText(strContenidoEditText + "/");
                break;
            case R.id.btn7:
                txvOperaciones.setText(strContenidoEditText + "7");
                break;
            case R.id.btn8:
                txvOperaciones.setText(strContenidoEditText + "8");
                break;
            case R.id.btn9:
                txvOperaciones.setText(strContenidoEditText + "9");
                break;
            case R.id.btnMultiplicacion:
                txvOperaciones.setText(strContenidoEditText + "X");
                break;
            case R.id.btn4:
                txvOperaciones.setText(strContenidoEditText + "4");
                break;
            case R.id.btn5:
                txvOperaciones.setText(strContenidoEditText + "5");
                break;
            case R.id.btn6:
                txvOperaciones.setText(strContenidoEditText + "6");
                break;
            case R.id.btnResta:
                txvOperaciones.setText(strContenidoEditText + "-");
                break;
            case R.id.btn1:
                txvOperaciones.setText(strContenidoEditText + "1");
                break;
            case R.id.btn2:
                txvOperaciones.setText(strContenidoEditText + "2");
                break;
            case R.id.btn3:
                txvOperaciones.setText(strContenidoEditText + "3");
                break;
            case R.id.btnSuma:
                txvOperaciones.setText(strContenidoEditText + "+");
                break;
            case R.id.btn0:
                txvOperaciones.setText(strContenidoEditText + "0");
                break;
            case R.id.btnPunto:
                txvOperaciones.setText(strContenidoEditText + ".");
                break;
            case R.id.btnIgual:
                txvOperaciones.setText("Resultado");
                txvOperaciones.setText(strContenidoEditText + ".");
                break;
        }

    }
}
