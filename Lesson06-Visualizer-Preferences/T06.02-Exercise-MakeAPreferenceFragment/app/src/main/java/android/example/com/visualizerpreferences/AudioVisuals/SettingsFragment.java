package android.example.com.visualizerpreferences.AudioVisuals;

import android.example.com.visualizerpreferences.R;
import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by Alex on 5/27/17.
 */

public class SettingsFragment extends PreferenceFragmentCompat {

    // COMPLETED (5) In SettingsFragment's onCreatePreferences method add the preference file using the
    // addPreferencesFromResource method
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
