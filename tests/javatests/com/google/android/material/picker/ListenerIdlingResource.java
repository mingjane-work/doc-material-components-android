/*
 * Copyright 2019 The Android Open Source Project
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
package com.google.android.material.picker;

import androidx.test.espresso.IdlingResource;

class ListenerIdlingResource implements IdlingResource {

  private ResourceCallback resourceCallback;
  private boolean blocking;
  private boolean listenerCalled;

  ListenerIdlingResource() {
    blocking = false;
    listenerCalled = false;
  }

  void beginBlocking() {
    blocking = true;
  }

  void callFromListener() {
    listenerCalled = true;
    if (resourceCallback != null) {
      resourceCallback.onTransitionToIdle();
    }
  }

  @Override
  public String getName() {
    return "Listener IdlingResource";
  }

  @Override
  public boolean isIdleNow() {
    return !blocking || listenerCalled;
  }

  @Override
  public void registerIdleTransitionCallback(ResourceCallback callback) {
    resourceCallback = callback;
  }
}
