package com.timehop.stickyheadersrecyclerview;

import android.view.View;

public interface StickyHeaderBeingPushCalback {

    void show(View showHeader);

    void show(View showHeader, View hideHeader);

}
