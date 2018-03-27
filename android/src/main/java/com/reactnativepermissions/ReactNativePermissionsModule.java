package com.reactnativepermissions;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.support.v4.app.NotificationManagerCompat;

public class ReactNativePermissionsModule extends ReactContextBaseJavaModule {
    public ReactNativePermissionsModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void areNotificationsEnabled(Promise promise) {
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getReactApplicationContext());
        boolean areNotificationsEnabled = notificationManagerCompat.areNotificationsEnabled();
        promise.resolve(areNotificationsEnabled);
    }

    @Override
    public String getName() {
        return "ReactNativePermissions";
    }
}