/*
 * SPDX-FileCopyrightText: 2026, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package org.microg.gms;

import android.app.Application;
import android.os.Build;

import com.google.android.gms.common.security.ProviderInstallerImpl;

/**
 * microG's own process: before Android 10 the platform has no TLS 1.3, so the bundled Conscrypt
 * becomes the first security provider and the default TLS of microG's own connections (sign-in,
 * check-in, GCM), as it is for apps through ProviderInstaller.
 */
public class MicroGApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT < 29) ProviderInstallerImpl.insertProvider(this);
    }
}
