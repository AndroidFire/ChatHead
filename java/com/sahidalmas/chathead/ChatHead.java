package com.sahidalmas.chathead;


import android.view.View;

import com.sahidalmas.chathead.components.FloatingView;

public class ChatHead extends FloatingView
{
    @Override
    protected View inflateButton() {
        return View.inflate(getContext(), R.layout.floating_icon, null);
    }

    @Override
    protected View inflateView() {
        return View.inflate(getContext(), R.layout.floating_view, null);
    }
}
