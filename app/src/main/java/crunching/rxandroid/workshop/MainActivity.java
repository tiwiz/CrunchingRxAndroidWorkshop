package crunching.rxandroid.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Playground.create().subscribe(Playground.logStringAction());
        Playground.just().subscribe(Playground.logStringAction(), Playground.logError());
        Playground.just().subscribe(Playground.logStringAction(), Playground.logError(), Playground.logCompleted());

        Observable.just("").subscribe(new Action1<String>() {
            @Override
            public void call(String s) {

            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {

            }
        }, new Action0() {
            @Override
            public void call() {

            }
        });
    }
}
