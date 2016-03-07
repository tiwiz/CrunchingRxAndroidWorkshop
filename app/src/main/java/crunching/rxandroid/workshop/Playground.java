package crunching.rxandroid.workshop;

import java.util.Locale;

import rx.Observable;
import rx.functions.Func1;

public class Playground {

    public static String TAG = "Playground";


    public static Observable<String> getObservable() {
        return Observable.range(1, 100)
                .filter(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer i) {
                        return (i % 2) == 0;
                    }
                }).map(new Func1<Integer, String>() {
                    @Override
                    public String call(Integer i) {
                        return String.format(Locale.getDefault(), "Emitted %d", i);
                    }
                }).take(10);
    }

}
