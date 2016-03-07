package crunching.rxandroid.workshop;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class Playground {

    public static Observable<String> getChangeTextObservable() {
        return Observable.just("I changed the value")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }

}
