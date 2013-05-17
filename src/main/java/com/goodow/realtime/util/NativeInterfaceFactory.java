/*
 * Copyright 2012 Goodow.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.goodow.realtime.util;

import com.goodow.realtime.CollaborativeString;

public interface NativeInterfaceFactory {
  String PACKAGE_PREFIX_REALTIME = "gdr";
  String PACKAGE_PREFIX_CUSTOM = "gdr.custom";
  String PACKAGE_PREFIX_DATABINDING = "gdr.databinding";
  String PACKAGE_PREFIX_OVERLAY = "gdr._ExportOverlay_";

  String JS_REGISTER_PROPERTIES = "J2ObjC blocked by JSNI";
  String JS_REGISTER_MATHODS = "J2ObjC blocked by JSNI";

  // Rpc getRpc();

  /**
   * A deferred command is executed after the event loop returns.
   */
  void scheduleDeferred(Runnable cmd);

  /**
   * Schedules a repeating command that is scheduled with a constant delay. That is, the next
   * invocation of the command will be scheduled for <code>delayMs</code> milliseconds after the
   * last invocation completes.
   * <p>
   * For example, assume that a command takes 30ms to run and a 100ms delay is provided. The second
   * invocation of the command will occur at 130ms after the first invocation starts.
   * 
   * @param cmd the command to execute
   * @param delayMs the amount of time to wait after one invocation ends before the next invocation
   */
  void scheduleFixedDelay(Runnable cmd, int delayMs);

  void setText(CollaborativeString str, String text);
}
