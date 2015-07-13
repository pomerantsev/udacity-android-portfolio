package udacity.pomerantsevp.ru.portfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MyAppPortfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
    }

    public void onButtonClick(View view) {
        int textResourceId = 0;

        switch (view.getId()) {
            case R.id.app1:
                textResourceId = R.string.app1_toast;
                break;
            case R.id.app2:
                textResourceId = R.string.app2_toast;
                break;
            case R.id.app3:
                textResourceId = R.string.app3_toast;
                break;
            case R.id.app4:
                textResourceId = R.string.app4_toast;
                break;
            case R.id.app5:
                textResourceId = R.string.app5_toast;
                break;
            case R.id.app6:
                textResourceId = R.string.app6_toast;
                break;
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, textResourceId, duration);
        toast.show();
    }

}
