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
package com.goodow.realtime.store.custom;

import com.goodow.realtime.core.Handler;
import com.goodow.realtime.store.Document;
import com.goodow.realtime.store.Model;

/**
 * A namespace that includes methods for registering and working with custom collaborative objects.
 */
public class Custom {
  /**
   * Returns a reference that can be assigned to an object prototype field of a custom collaborative
   * object in order to define custom collaborative properties. For example: MyClass.prototype.name
   * = com.goodow.realtime.store.custom.collaborativeField('name'); The resulting field can be read
   * and assigned to like a regular field, but the value will automatically be saved and sent to
   * other collaborators.
   * 
   * @param name The stable field name.
   * @return A dynamic property identifier.
   */
  public static Object collaborativeField(String name) {
    return null;
  }

  /**
   * Returns the id of the given custom object.
   * 
   * @param obj A custom object.
   * @return The object id.
   */
  public static String getId(Object obj) {
    return null;
  }

  /**
   * Returns the model for the given custom object.
   * 
   * @param obj A custom object.
   * @return The collaborative model for the given object.
   */
  public static Model getModel(Object obj) {
    return null;
  }

  /**
   * Returns true if obj is a custom collaborative object, otherwise false.
   * 
   * @param obj A custom object.
   * @return true if obj is a custom collaborative object, otherwise false.
   */
  public static boolean isCustomObject(Object obj) {
    return false;
  }

  /**
   * Registers a user-defined type as a collaborative type. This must be called before
   * {@link com.goodow.realtime.store.Store#load(String, Handler, Handler, Handler)}
   * 
   * @param type The type to register.
   * @param name A name to use for this type.
   */
  public static void registerType(Object type, String name) {
  }

  /**
   * Sets the initializer function for the given type. The type must have already been registered
   * with a call to registerType.
   * 
   * @param type The type to register.
   * @param initializer An initializer function that will be called in the context of the
   *          initialized object.
   */
  public static void setInitializer(Object type, Handler<Model> initializer) {
  }

  /**
   * Sets the onLoaded function for the given type. The type must have already been registered with
   * a call to registerType.
   * 
   * @param type The type to register.
   * @param opt_onLoaded An optional onLoaded function that will be called in the context of the
   *          newly-loaded object. If not specified, a default onLoaded handler will be used.
   */
  public static void setOnLoaded(Object type, Handler<Document> opt_onLoaded) {
  }
}
