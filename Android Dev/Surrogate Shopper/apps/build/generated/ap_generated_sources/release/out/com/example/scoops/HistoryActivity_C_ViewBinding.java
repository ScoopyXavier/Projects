// Generated code from Butter Knife. Do not modify!
package com.example.scoops;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HistoryActivity_C_ViewBinding implements Unbinder {
  private HistoryActivity_C target;

  @UiThread
  public HistoryActivity_C_ViewBinding(HistoryActivity_C target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HistoryActivity_C_ViewBinding(HistoryActivity_C target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HistoryActivity_C target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
  }
}
