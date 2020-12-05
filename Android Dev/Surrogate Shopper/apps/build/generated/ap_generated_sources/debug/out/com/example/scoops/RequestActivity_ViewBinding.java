// Generated code from Butter Knife. Do not modify!
package com.example.scoops;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RequestActivity_ViewBinding implements Unbinder {
  private RequestActivity target;

  @UiThread
  public RequestActivity_ViewBinding(RequestActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RequestActivity_ViewBinding(RequestActivity target, View source) {
    this.target = target;

    target.bottomNavigation = Utils.findRequiredViewAsType(source, R.id.bottom_navigation, "field 'bottomNavigation'", BottomNavigationView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RequestActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.bottomNavigation = null;
    target.toolbar = null;
  }
}
