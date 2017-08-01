package fragmentaddition101.android.acadgild.com.fragmentaddition101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleAddition details = new SimpleAddition();

        // get and set the position input by user (i.e., "index")
        // which is the construction arguments for this fragment
        details.setArguments(getIntent().getExtras());

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, details).commit();
    }
}
