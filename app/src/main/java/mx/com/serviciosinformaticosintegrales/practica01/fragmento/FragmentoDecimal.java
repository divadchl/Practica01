package mx.com.serviciosinformaticosintegrales.practica01.fragmento;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import mx.com.serviciosinformaticosintegrales.practica01.R;

/**
 * Created by David on 20/06/2016.
 */
public class FragmentoDecimal extends Fragment implements View.OnClickListener {

    EditText edtOperaciones;
    EditText edtResultado;
    String strContenidoEditText;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_decimal,container,false);
        view.findViewById(R.id.btnClear).setOnClickListener(this);
        edtOperaciones = (EditText) view.findViewById(R.id.edtOperaciones);
        edtResultado = (EditText) view.findViewById(R.id.edtResultado);
        return view;
    }

    @Override
    public void onClick(final View clicked) {
        switch (clicked.getId())
        {
            case R.id.btnClear:
                edtOperaciones.setText("");
                break;
            case R.id.btnDivision:
                edtOperaciones.setText(strContenidoEditText + "/");
                break;
            case R.id.btn7:
                edtOperaciones.setText(strContenidoEditText + "7");
                break;
            case R.id.btn8:
                edtOperaciones.setText(strContenidoEditText + "8");
                break;
            case R.id.btn9:
                edtOperaciones.setText(strContenidoEditText + "9");
                break;
            case R.id.btnMultiplicacion:
                edtOperaciones.setText(strContenidoEditText + "X");
                break;
            case R.id.btn4:
                edtOperaciones.setText(strContenidoEditText + "4");
                break;
            case R.id.btn5:
                edtOperaciones.setText(strContenidoEditText + "5");
                break;
            case R.id.btn6:
                edtOperaciones.setText(strContenidoEditText + "6");
                break;
            case R.id.btnResta:
                edtOperaciones.setText(strContenidoEditText + "-");
                break;
            case R.id.btn1:
                edtOperaciones.setText(strContenidoEditText + "1");
                break;
            case R.id.btn2:
                edtOperaciones.setText(strContenidoEditText + "2");
                break;
            case R.id.btn3:
                edtOperaciones.setText(strContenidoEditText + "3");
                break;
            case R.id.btnSuma:
                edtOperaciones.setText(strContenidoEditText + "+");
                break;
            case R.id.btn0:
                edtOperaciones.setText(strContenidoEditText + "0");
                break;
            case R.id.btnPunto:
                edtOperaciones.setText(strContenidoEditText + ".");
                break;
            case R.id.btnIgual:
                edtResultado.setText("Resultado");
                edtOperaciones.setText(strContenidoEditText + ".");
                break;
        }

    }
}
