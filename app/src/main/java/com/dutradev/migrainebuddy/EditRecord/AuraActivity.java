package com.dutradev.migrainebuddy.EditRecord;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dutradev.migrainebuddy.EditRecord.AffectedActivity;
import com.dutradev.migrainebuddy.R;

public class AuraActivity extends AppCompatActivity {
    public boolean isNo = false;
    public boolean isWeakness = false;
    public boolean isFatigue = false;
    public boolean isVisualDisturbance = false;
    public boolean isTinglingInHead = false;
    public boolean isTinglingInNeck = false;
    public boolean isTinglingNearEyes = false;
    public boolean isYawning = false;
    public boolean isMuscleStiffness = false;
    public boolean isIrritability = false;
    public boolean isHeadache = false;
    public boolean isAuraOnly = false;
    public boolean isProdromeOnly = false;
    public boolean isUnusuallyEnergetic = false;
    public boolean isUnusuallyDepressed = false;
    public boolean isAdd = false;
    public boolean isRemove = false;
    public boolean isArrange = false;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aura);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void botherClick(View v) {
        finish();
    }

    public void skipClick(View v) {
        Intent intent = new Intent(this, AffectedActivity.class);
        startActivity(intent);
        finish();
    }

    public void NoClick(View v) {

        if (!isNo) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none_pressed));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none));
            count--;
        }

        isNo = !isNo;

        setSkipButton();
    }

    public void WeaknessClick(View v) {

        if (!isWeakness) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_weakness_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_weakness));
            count--;
        }

        isWeakness = !isWeakness;
        setSkipButton();
    }

    public void FatigueClick(View v) {

        if (!isFatigue) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_fatigue_achiness_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_fatigue_achiness));
            count--;
        }

        isFatigue = !isFatigue;
        setSkipButton();
    }

    public void VisualDisturbanceClick(View v) {

        if (!isVisualDisturbance) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_visual_disturbance_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_visual_disturbance));
            count--;
        }

        isVisualDisturbance = !isVisualDisturbance;
        setSkipButton();
    }

    public void TinglingInHeadClick(View v) {

        if (!isTinglingInHead) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_tingling_head_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_tingling_head));
            count--;
        }

        isTinglingInHead = !isTinglingInHead;
        setSkipButton();
    }

    public void TinglingInNeckClick(View v) {

        if (!isTinglingInNeck) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_tingling_neck_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_tingling_neck));
            count--;
        }

        isTinglingInNeck = !isTinglingInNeck;
        setSkipButton();
    }

    public void TinglingNearEyesClick(View v) {

        if (!isTinglingNearEyes) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_tingling_eye_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_tingling_eye));
            count--;
        }

        isTinglingNearEyes = !isTinglingNearEyes;
        setSkipButton();
    }

    public void YawningClick(View v) {

        if (!isYawning) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_yawning_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_yawning));
            count--;
        }

        isYawning = !isYawning;
        setSkipButton();
    }

    public void MuscleStiffnessClick(View v) {

        if (!isMuscleStiffness) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_muscle_stiffness_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_muscle_stiffness));
            count--;
        }

        isMuscleStiffness = !isMuscleStiffness;
        setSkipButton();
    }

    public void IrritabilityClick(View v) {

        if (!isIrritability) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_irritability_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_irritability));
            count--;
        }

        isIrritability = !isIrritability;
        setSkipButton();
    }

    public void HeadacheClick(View v) {

        if (!isHeadache) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_headache_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_headache));
            count--;
        }

        isHeadache = !isHeadache;
        setSkipButton();
    }

    public void AuraOnlyClick(View v) {

        if (!isAuraOnly) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_aura_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_aura));
            count--;
        }

        isAuraOnly = !isAuraOnly;
        setSkipButton();
    }

    public void ProdromeOnlyClick(View v) {

        if (!isProdromeOnly) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_prodrome_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_prodrome));
            count--;
        }

        isProdromeOnly = !isProdromeOnly;
        setSkipButton();
    }

    public void UnusuallyEnergeticClick(View v) {

        if (!isUnusuallyEnergetic) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_unusually_energetic_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_unusually_energetic));
            count--;
        }

        isUnusuallyEnergetic = !isUnusuallyEnergetic;
        setSkipButton();
    }

    public void UnusuallyDepressedClick(View v) {

        if (!isUnusuallyDepressed) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_unusually_depressed_press));
            count++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_unusually_depressed));
            count--;
        }

        isUnusuallyDepressed = !isUnusuallyDepressed;
        setSkipButton();
    }

    public void AddClick(View v) {
        if (!isAdd) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_add_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_add));
        }
        isAdd = !isAdd;
    }

    public void RemoveClick(View v) {
        if (!isRemove) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_delete_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_delete));
        }
        isRemove = !isRemove;
    }

    public void ArrangeClick(View v) {
        if (!isArrange) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_arrange_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_arrange));
        }
        isArrange = !isArrange;
    }

    public void setSkipButton() {
        LinearLayout lnLayoutSkip = (LinearLayout) findViewById(R.id.lnLayoutSkip);
        TextView tvSkip = (TextView) findViewById(R.id.tvConfirm);
        if (count > 0) {
            lnLayoutSkip.setBackground(new ColorDrawable(Color.parseColor("#03B0B7")));
            tvSkip.setText("NEXT");
        } else {
            lnLayoutSkip.setBackground(new ColorDrawable(Color.parseColor("#F1634C")));
            tvSkip.setText("SKIP");
        }
    }
}
