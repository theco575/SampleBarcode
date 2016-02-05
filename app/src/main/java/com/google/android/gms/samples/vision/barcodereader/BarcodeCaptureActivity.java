/*
 * Copyright (C) The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.gms.samples.vision.barcodereader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

 /*
   todo : CaptureGesture 리스너 제거 후 OnClick 리스너로 변경.
   todo : Auto focus is default value true.
   todo :

 */

/**
 * Activity for the multi-tracker app.  This app detects barcodes and displays the value with the
 * rear facing camera. During detection overlay graphics are drawn to indicate the position,
 * size, and ID of each barcode.
 */
public final class BarcodeCaptureActivity extends AppCompatActivity {
    private static final String TAG = "Barcode-reader";

    private CaptureDialogFragment mPrieviewDialog;

    /**
     * Initializes the UI and creates the detector pipeline.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        mPrieviewDialog = new CaptureDialogFragment();
    }

    @Override
    protected void onResume() {
        super.onResume();

        mPrieviewDialog.setArguments(getIntent().getExtras());
        mPrieviewDialog.show(getSupportFragmentManager(), null);
    }
}
