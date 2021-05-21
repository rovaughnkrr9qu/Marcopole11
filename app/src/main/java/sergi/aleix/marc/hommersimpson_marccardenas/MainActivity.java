package sergi.aleix.marc.hommersimpson_marccardenas;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable titolSimpsons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView titolAnim =(ImageView)findViewById(R.id.simpsonsAnim);
        titolAnim.setBackgroundResource(R.drawable.simpsons_anim);
        titolSimpsons = (AnimationDrawable) titolAnim.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean focus) {
        super.onWindowFocusChanged(focus);
        titolSimpsons.start();
    }
}

