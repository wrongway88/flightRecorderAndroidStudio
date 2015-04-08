package com.example.flightrecorder.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;

import com.example.flightrecorder.R;

public class DialogNoRecording extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        final Activity activity = getActivity();

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(getString(R.string.dialog_no_recording));
        builder.setMessage(getString(R.string.dialog_no_recording_message_0) + "\n"
            + getString(R.string.dialog_no_recording_message_1) + " " + getString(R.string.email_address));
        builder.setPositiveButton("OK",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface d, int id)
                    {
                        d.cancel();
                    }
                });

        return builder.create();
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }
}