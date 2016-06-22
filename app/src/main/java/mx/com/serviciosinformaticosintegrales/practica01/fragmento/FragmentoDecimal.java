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
    private String strContenidoEditText="";
    private boolean blnDecimal= false;
    private boolean blnSuma = false;
    private boolean blnResta = false;
    private boolean blnMultiplicacion = false;
    private boolean blnDivision = false;
    private boolean blnModulo = false;


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_decimal,container,false);
        view.findViewById(R.id.btnLimpiar).setOnClickListener(this);
        view.findViewById(R.id.btnSuprimir).setOnClickListener(this);
        view.findViewById(R.id.btnModulo).setOnClickListener(this);
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


        try {
            switch (clicked.getId()) {
                case R.id.btnLimpiar:
                    blnDecimal= false;
                    txvOperaciones.setText("");
                    txvResultado.setText("");
                    break;
                case R.id.btnSuprimir:

                    break;
                case R.id.btnModulo:
                    blnModulo= false;
                    strContenidoEditText = strContenidoEditText + "%";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btnDivision:
                    blnDivision= false;
                    strContenidoEditText = strContenidoEditText + "/";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn7:
                    strContenidoEditText = strContenidoEditText + "7";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn8:
                    strContenidoEditText = strContenidoEditText + "8";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn9:
                    strContenidoEditText = strContenidoEditText + "9";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btnMultiplicacion:
                    blnMultiplicacion= false;
                    strContenidoEditText = strContenidoEditText + "x";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn4:
                    strContenidoEditText = strContenidoEditText + "4";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn5:
                    strContenidoEditText = strContenidoEditText + "5";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn6:
                    strContenidoEditText = strContenidoEditText + "6";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btnResta:
                    blnResta= true;
                    strContenidoEditText = strContenidoEditText + "-";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn1:
                    strContenidoEditText = strContenidoEditText + "1";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn2:
                    strContenidoEditText = strContenidoEditText + "2";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn3:
                    strContenidoEditText = strContenidoEditText + "3";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btnSuma:
                    blnSuma= true
                    strContenidoEditText = strContenidoEditText + "+";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btn0:
                    strContenidoEditText = strContenidoEditText + "0";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btnPunto:
                    if(blnDecimal==false)
                    {
                        txvOperaciones.setText(strContenidoEditText+".");
                        blnDecimal= true;
                    }
                    else
                    {
                        return;
                    }

                    strContenidoEditText = strContenidoEditText + ".";
                    txvOperaciones.setText(strContenidoEditText);
                    break;
                case R.id.btnIgual:



                    
                    txvOperaciones.setText("Resultado");
                    txvOperaciones.setText(strContenidoEditText + ".");
                    break;
            }
        }catch(Exception e){
            txvOperaciones.setText("Error");
            txvOperaciones.setText("");
        }

    }
}
