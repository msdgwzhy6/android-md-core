/*
 * Copyright 2015 "Henry Tao <hi@henrytao.me>"
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

package me.henrytao.mddemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.henrytao.mdcore.widgets.MdIconToggle;
import me.henrytao.mddemo.R;

public class IconActivity extends BaseSimpleActivity {

  public static Intent newIntent(Activity activity) {
    return new Intent(activity, IconActivity.class);
  }

  @Bind(R.id.toggle_up) MdIconToggle vMdIconToggleUp;

  private int mCount;

  @Override
  public int getLayoutId() {
    return R.layout.activity_icon;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ButterKnife.bind(this);

    vMdIconToggleUp.setOnCheckedChangeListener((buttonView, isChecked) -> {
      mCount += 1;
      vMdIconToggleUp.setText(String.valueOf(mCount));
    });
  }
}
