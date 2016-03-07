package crunching.rxandroid.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Playground.getObservable().subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                Log.d(Playground.TAG, s);
            }
        });
    }
}
