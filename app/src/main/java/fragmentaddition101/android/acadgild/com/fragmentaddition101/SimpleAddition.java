package fragmentaddition101.android.acadgild.com.fragmentaddition101;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.SharedPreferencesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jal on 28-07-2017.
 */

public class SimpleAddition extends Fragment {


    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.addition_activity_layout, container, false);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        Button bt=(Button)getActivity().findViewById(R.id.btnSubmit);
        
        bt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et = (EditText)getActivity().findViewById(R.id.etNum);
                TextView tResult = (TextView)getActivity().findViewById(R.id.txtResult);
                Float result;
                Toast.makeText(getActivity().getApplicationContext(),"Clicked on Button "+ et.getText() ,Toast.LENGTH_LONG).show();
                result = (Float.parseFloat(tResult.getText().toString()==""?"0":tResult.getText().toString()) + Float.parseFloat(et.getText().toString()==""?"0":et.getText().toString()));
                tResult.setText(""+result);
            }
        });
    }
}
