package crunching.rxandroid.workshop;

import android.util.Log;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;

public class Playground {
    private static String TAG = "Playground";

    public static Observable<String> create() {
        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello, World!");
                subscriber.onCompleted();
            }
        });
    }

    public static Observable<String> just() {
        return Observable.just("Hello, World!");
    }

    public static Observable<String> from() {
        return Observable.from(new String[] {"Hello", "World", "from", "Crunching", "RxAndroid", "Workshop"});
    }

    public static Action1<String> logStringAction() {
        return new Action1<String>() {
            @Override
            public void call(String s) {
                Log.d(TAG, s);
            }
        };
    }

    public static Action1<Throwable> logError() {
        return new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Log.e(TAG, throwable.getMessage());
            }
        };
    }

    public static Action0 logCompleted() {
        return new Action0() {
            @Override
            public void call() {
                Log.d(TAG, "onCompleted()");
            }
        };
    }
}
