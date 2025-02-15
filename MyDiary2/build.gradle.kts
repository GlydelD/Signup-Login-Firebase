buildscript {
    dependencies {
        // Add the latest version of the Google Services plugin
        classpath("com.google.gms:google-services:4.4.2")

    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}