/*
 * Copyright 2016 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.hippo.ehviewer.R;
import com.hippo.ehviewer.client.EhUtils;
import com.hippo.preference.MessagePreference;

public class SignOutPreference extends MessagePreference {

    public SignOutPreference(Context context) {
        super(context);
        init();
    }

    public SignOutPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SignOutPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setDialogMessage(getContext().getString(R.string.settings_eh_sign_out_warning));
    }

    @Override
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setPositiveButton(R.string.settings_eh_sign_out_yes, this);
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
        super.onDialogClosed(positiveResult);
        if (positiveResult) {
            EhUtils.signOut(getContext());
            Toast.makeText(getContext(), R.string.settings_eh_sign_out_tip, Toast.LENGTH_SHORT).show();
        }
    }
}
