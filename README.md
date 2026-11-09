# Fork of Vanced MicroG

[![github](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/github_vector.svg)](https://github.com/DavidCGranger/MicroG/releases/latest)

![Build Status](https://github.com/DavidCGranger/MicroG/actions/workflows/build-for-sdk-19.yml/badge.svg)
[![Github All Releases](https://img.shields.io/github/downloads/DavidCGranger/MicroG/total.svg)](https://github.com/DavidCGranger/MicroG/releases) [![Github All Releases](https://img.shields.io/github/v/release/DavidCGranger/MicroG.svg)](https://github.com/DavidCGranger/MicroG/releases)

This fork fixes login on old versions of YouTube Vanced.

Current pre-releases also integrate support for older versions of Android. 
Credits go to https://gist.github.com/Smu1zel/b55551cab92141f13f5590b8c84ffefc!

It runs on Android 4.0.3 (API 15) and later, Cast device discovery from Android 4.1. Before
Android 10, its own connections (sign-in, check-in, push) use TLS 1.3 through the bundled
Conscrypt, which also is what apps get from its ProviderInstaller. The Cronet module (Chromium's
network stack for apps, version 91) is not included.

This fork will likely do ABSOLUTELY NOTHING for you. YouTube Vanced no longer works. The API has been shut down.

# Vanced MicroG

microG GmsCore is a FLOSS (Free/Libre Open Source Software) framework to allow applications designed for Google Play Services to run on systems, where Play Services is not available.

This fork tweaks MicroG to be usable by applications that require Google authentication such as Vanced.

## Notable changes

- No longer a system app
- Package name changed from `com.google.android.gms` to `com.mgoogle.android.gms` to support installation alongside the official MicroG
- Removed unnecessary features:
  - Ads
  - Analytics
  - Car
  - Droidguard
  - Exposure-Notifications
  - Feedback
  - Firebase
  - Games
  - Maps
  - Recovery
  - Registering app permissions
  - SafetyNet
  - Self-Check
  - Search
  - TapAndPay
  - Wallet
  - Wear-Api
- Removed all permissions, as none are required for Google authentication
