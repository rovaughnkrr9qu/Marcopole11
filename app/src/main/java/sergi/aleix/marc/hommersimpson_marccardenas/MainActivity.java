package sergi.aleix.marc.hommersimpson_marccardenas;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable titolSimpsons;
    ImageView Hide1, Hide2, Hide3, Hide4, Hide5;
    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView titolAnim = findViewById(R.id.simpsonsAnim);
        titolAnim.setBackgroundResource(R.drawable.simpsons_anim);
        titolSimpsons = (AnimationDrawable) titolAnim.getBackground();
        Hide1 = findViewById(R.id.verdView);
        Hide2 = findViewById(R.id.blauView);
        Hide3 = findViewById(R.id.vermellView);
        Hide4 = findViewById(R.id.ullView);
        Hide5 = findViewById(R.id.donutView);
        Hide1.setVisibility(View.INVISIBLE);
        Hide2.setVisibility(View.INVISIBLE);
        Hide3.setVisibility(View.INVISIBLE);
        Hide4.setVisibility(View.INVISIBLE);
        Hide5.setVisibility(View.INVISIBLE);
        audio = MediaPlayer.create(this,R.raw.the_simpsons);
        audio.setLooping(true);
    }

    @Override
    public void onWindowFocusChanged(boolean focus) {
        super.onWindowFocusChanged(focus);
        titolSimpsons.start();
    }
    public void revelarVerdad(View view){
        if(Hide1.getVisibility() == View.VISIBLE){
            Hide1.setVisibility(View.INVISIBLE);
            Hide2.setVisibility(View.INVISIBLE);
            Hide3.setVisibility(View.INVISIBLE);
            Hide4.setVisibility(View.INVISIBLE);
            Hide5.setVisibility(View.INVISIBLE);
        } else {
            Hide1.setVisibility(View.VISIBLE);
            Hide2.setVisibility(View.VISIBLE);
            Hide3.setVisibility(View.VISIBLE);
            Hide4.setVisibility(View.VISIBLE);
            Hide5.setVisibility(View.VISIBLE);
        }
    }
    public void sonarMusic(View view){
        if(audio.isPlaying()){
            audio.pause();
        } else{
            audio.start();
        }
    }
}

