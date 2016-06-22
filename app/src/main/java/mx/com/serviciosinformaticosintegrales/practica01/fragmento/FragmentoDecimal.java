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
    private TextView txvResultado;
    private String strContenidoEditText="";
    private boolean blnDecimal= false;
    private boolean blnSuma = false;
    private boolean blnResta = false;
    private boolean blnMultiplicacion = false;
    private boolean blnDivision = false;
    private boolean blnModulo = false;
    Double[] numeros = new Double[2];

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
        txvResultado = (TextView) view.findViewById(R.id.txvResultado);

        return view;
    }


    @Override
    public void onClick(final View clicked) {
        Double dblResultado;

        strContenidoEditText = txvResultado.getText().toString().replaceFirst("^0*", "");

        try {
            switch (clicked.getId()) {
                case R.id.btnLimpiar:
                    blnDecimal= false;
                    blnSuma= false;
                    blnResta= false;
                    blnMultiplicacion=false;
                    blnDivision=false;
                    blnModulo= false;
                    txvResultado.setText("");
                    break;
                case R.id.btnSuprimir:
                    if(strContenidoEditText.length()==1 || strContenidoEditText=="")
                    {
                        txvResultado.setText("");
                    }
                    else
                    {
                        txvResultado.setText(strContenidoEditText.substring(0, strContenidoEditText.length() -1));
                    }
                    break;
                case R.id.btnModulo:
                    blnModulo= true;
                    blnDecimal=false;
                    numeros[0]=Double.parseDouble(strContenidoEditText);
                    txvResultado.setText("");
                    break;
                case R.id.btnDivision:
                    blnDivision= true;
                    blnDecimal=false;
                    numeros[0]=Double.parseDouble(strContenidoEditText);
                    txvResultado.setText("");
                    break;
                case R.id.btn7:
                    txvResultado.setText(strContenidoEditText + "7");
                    break;
                case R.id.btn8:
                    txvResultado.setText(strContenidoEditText + "8");
                    break;
                case R.id.btn9:
                    txvResultado.setText(strContenidoEditText + "9");
                    break;
                case R.id.btnMultiplicacion:
                    blnMultiplicacion= true;
                    blnDecimal=false;
                    numeros[0]=Double.parseDouble(strContenidoEditText);
                    txvResultado.setText("");
                    break;
                case R.id.btn4:
                    txvResultado.setText(strContenidoEditText + "4");
                    break;
                case R.id.btn5:
                    txvResultado.setText(strContenidoEditText + "5");
                    break;
                case R.id.btn6:
                    txvResultado.setText(strContenidoEditText + "6");
                    break;
                case R.id.btnResta:
                    blnResta= true;
                    blnDecimal=false;
                    numeros[0]=Double.parseDouble(strContenidoEditText);
                    txvResultado.setText("");
                    break;
                case R.id.btn1:
                    txvResultado.setText(strContenidoEditText + "1");
                    break;
                case R.id.btn2:
                    txvResultado.setText(strContenidoEditText + "2");
                    break;
                case R.id.btn3:
                    txvResultado.setText(strContenidoEditText + "3");
                    break;
                case R.id.btnSuma:
                    blnSuma= true;
                    blnDecimal=false;
                    numeros[0]=Double.parseDouble(strContenidoEditText);
                    txvResultado.setText("");
                    break;
                case R.id.btn0:
                    txvResultado.setText(strContenidoEditText + "0");
                    break;
                case R.id.btnPunto:
                    if(blnDecimal==false)
                    {
                        txvResultado.setText(strContenidoEditText+".");
                        txvResultado.setText(strContenidoEditText + ".");
                        blnDecimal= true;
                    }
                    else
                    {
                        return;
                    }
                    break;
                case R.id.btnIgual:
                    numeros[1]= Double.parseDouble(strContenidoEditText);
                    if(blnSuma == true)
                    {
                        dblResultado = numeros[0] + numeros [1];
                        txvResultado.setText(String.valueOf(dblResultado));
                    }
                    else if (blnResta==true)
                    {
                        dblResultado = numeros[0] - numeros [1];
                        txvResultado.setText(String.valueOf(dblResultado));
                    }
                    else if (blnMultiplicacion==true)
                    {
                        dblResultado = numeros[0] * numeros [1];
                        txvResultado.setText(String.valueOf(dblResultado));
                    }
                    else if(blnDivision==true)
                    {
                        dblResultado = numeros[0] / numeros [1];
                        txvResultado.setText(String.valueOf(dblResultado));
                    }
                    else if (blnModulo==true)
                    {
                        dblResultado = numeros[0] % numeros [1];
                        txvResultado.setText(String.valueOf(dblResultado));
                    }

                    blnDecimal=false;
                    blnSuma=false;
                    blnResta=false;
                    blnMultiplicacion=false;
                    blnDivision=false;
                    blnModulo=false;
                    break;
            }
        }catch(Exception e){
            txvResultado.setText("Error");
        }

    }
}
