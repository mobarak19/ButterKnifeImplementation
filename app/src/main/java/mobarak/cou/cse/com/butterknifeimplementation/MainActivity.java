package mobarak.cou.cse.com.butterknifeimplementation;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemLongClick;
import butterknife.OnLongClick;

public class MainActivity extends Activity {

    @BindView(R.id.text_title)
    TextView textTitle;
    @BindView(R.id.text_subtitle)
    TextView textSubtitle;
    @BindView(R.id.showToast)
    Button showToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.showToast)
    public void onViewClicked() {
        Toast.makeText(this,"This is a toast",Toast.LENGTH_LONG).show();
    }
    @OnLongClick(R.id.showToast)
    public boolean onViewLongClicked() {
        Toast.makeText(this,"This is a LOng toast",Toast.LENGTH_LONG).show();
        return true;
    }
}
