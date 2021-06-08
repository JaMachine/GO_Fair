package com.go.fair.org.app;

import android.app.Application;

import com.onesignal.OneSignal;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;

public class MainApplication extends Application {
    private static final String ONESIGNAL_APP_ID = "cbe8b549-10b1-4f62-8a6b-6868225fbb64";

    @Override
    public void onCreate() {
        super.onCreate();

        yandexMetric();
        startOneSignal();
    }

    void yandexMetric() {
        YandexMetricaConfig config = YandexMetricaConfig.newConfigBuilder("2596abaa-f72d-4279-9f51-508e9cbec44a").build();
        YandexMetrica.activate(getApplicationContext(), config);
        YandexMetrica.enableActivityAutoTracking(this);
    }

    void startOneSignal() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
