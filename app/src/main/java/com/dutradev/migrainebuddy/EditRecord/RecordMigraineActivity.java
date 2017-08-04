package com.dutradev.migrainebuddy.EditRecord;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dutradev.migrainebuddy.EditRecord.AffectedActivity;
import com.dutradev.migrainebuddy.EditRecord.AttackTypesActivity;
import com.dutradev.migrainebuddy.EditRecord.AuraActivity;
import com.dutradev.migrainebuddy.EditRecord.DurationActivity;
import com.dutradev.migrainebuddy.EditRecord.IndensityActivity;
import com.dutradev.migrainebuddy.EditRecord.LocationActivity;
import com.dutradev.migrainebuddy.EditRecord.MedicationActivity;
import com.dutradev.migrainebuddy.EditRecord.MenstruationActivity;
import com.dutradev.migrainebuddy.EditRecord.NoteActivity;
import com.dutradev.migrainebuddy.EditRecord.ReliefActivity;
import com.dutradev.migrainebuddy.EditRecord.SymptonsActivity;
import com.dutradev.migrainebuddy.EditRecord.TriggersActivity;
import com.dutradev.migrainebuddy.R;

public class RecordMigraineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_migraine);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    public void click(View v) {
        switch (v.getId()) {
            case R.id.durationRow:
                IntentView(DurationActivity.class);
                break;
            case R.id.weatherRow:
                break;
            case R.id.notesRow:
                IntentView(NoteActivity.class);
                break;
            case R.id.intensityRow:
                IntentView(IndensityActivity.class);
                break;
            case R.id.painonsetRow:
                break;
            case R.id.medicationRow:
                IntentView(MedicationActivity.class);
                break;
            case R.id.reliefsRow:
                IntentView(ReliefActivity.class);
                break;
            case R.id.symtomsRow:
                IntentView(SymptonsActivity.class);
                break;
            case R.id.auraRow:
                IntentView(AuraActivity.class);
                break;
            case R.id.activitiesRow:
                IntentView(AffectedActivity.class);
                break;
            case R.id.locationRow:
                IntentView(LocationActivity.class);
                break;
            case R.id.triggersRow:
                IntentView(TriggersActivity.class);
                break;
            case R.id.menstruationRow:
                IntentView(MenstruationActivity.class);
                break;
            case R.id.attacktypesRow:
                IntentView(AttackTypesActivity.class);
                break;
            case R.id.rltConfirm:
                finish();
                break;
        }

    }

    public void IntentView(Class<?> sender) {
        Intent intent = new Intent(getApplicationContext(), sender);
        startActivity(intent);
    }
}
