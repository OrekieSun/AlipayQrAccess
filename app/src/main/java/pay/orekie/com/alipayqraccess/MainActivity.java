package pay.orekie.com.alipayqraccess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orekie.pay.ali.Pay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pay.pay("https://qr.alipay.com/a6x007900dnz5fvpyfgve79", this);
    }
}
