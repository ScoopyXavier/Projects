// Generated code from Butter Knife. Do not modify!
package com.example.scoops;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PostRequest_ViewBinding implements Unbinder {
  private PostRequest target;

  @UiThread
  public PostRequest_ViewBinding(PostRequest target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PostRequest_ViewBinding(PostRequest target, View source) {
    this.target = target;

    target.postBtnTxt = Utils.findRequiredViewAsType(source, R.id.postBtnTxt, "field 'postBtnTxt'", TextView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.requestEdit = Utils.findRequiredViewAsType(source, R.id.request_edit, "field 'requestEdit'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PostRequest target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.postBtnTxt = null;
    target.toolbar = null;
    target.requestEdit = null;
  }
}
