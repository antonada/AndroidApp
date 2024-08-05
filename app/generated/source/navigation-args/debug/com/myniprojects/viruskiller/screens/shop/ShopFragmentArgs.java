package com.myniprojects.viruskiller.screens.shop;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ShopFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ShopFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ShopFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ShopFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ShopFragmentArgs __result = new ShopFragmentArgs();
    bundle.setClassLoader(ShopFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("bonuses")) {
      String bonuses;
      bonuses = bundle.getString("bonuses");
      if (bonuses == null) {
        throw new IllegalArgumentException("Argument \"bonuses\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("bonuses", bonuses);
    } else {
      throw new IllegalArgumentException("Required argument \"bonuses\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("money")) {
      long money;
      money = bundle.getLong("money");
      __result.arguments.put("money", money);
    } else {
      throw new IllegalArgumentException("Required argument \"money\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ShopFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    ShopFragmentArgs __result = new ShopFragmentArgs();
    if (savedStateHandle.contains("bonuses")) {
      String bonuses;
      bonuses = savedStateHandle.get("bonuses");
      if (bonuses == null) {
        throw new IllegalArgumentException("Argument \"bonuses\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("bonuses", bonuses);
    } else {
      throw new IllegalArgumentException("Required argument \"bonuses\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("money")) {
      long money;
      money = savedStateHandle.get("money");
      __result.arguments.put("money", money);
    } else {
      throw new IllegalArgumentException("Required argument \"money\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getBonuses() {
    return (String) arguments.get("bonuses");
  }

  @SuppressWarnings("unchecked")
  public long getMoney() {
    return (long) arguments.get("money");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("bonuses")) {
      String bonuses = (String) arguments.get("bonuses");
      __result.putString("bonuses", bonuses);
    }
    if (arguments.containsKey("money")) {
      long money = (long) arguments.get("money");
      __result.putLong("money", money);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("bonuses")) {
      String bonuses = (String) arguments.get("bonuses");
      __result.set("bonuses", bonuses);
    }
    if (arguments.containsKey("money")) {
      long money = (long) arguments.get("money");
      __result.set("money", money);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ShopFragmentArgs that = (ShopFragmentArgs) object;
    if (arguments.containsKey("bonuses") != that.arguments.containsKey("bonuses")) {
      return false;
    }
    if (getBonuses() != null ? !getBonuses().equals(that.getBonuses()) : that.getBonuses() != null) {
      return false;
    }
    if (arguments.containsKey("money") != that.arguments.containsKey("money")) {
      return false;
    }
    if (getMoney() != that.getMoney()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getBonuses() != null ? getBonuses().hashCode() : 0);
    result = 31 * result + (int)(getMoney() ^ (getMoney() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "ShopFragmentArgs{"
        + "bonuses=" + getBonuses()
        + ", money=" + getMoney()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ShopFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String bonuses, long money) {
      if (bonuses == null) {
        throw new IllegalArgumentException("Argument \"bonuses\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bonuses", bonuses);
      this.arguments.put("money", money);
    }

    @NonNull
    public ShopFragmentArgs build() {
      ShopFragmentArgs result = new ShopFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setBonuses(@NonNull String bonuses) {
      if (bonuses == null) {
        throw new IllegalArgumentException("Argument \"bonuses\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bonuses", bonuses);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setMoney(long money) {
      this.arguments.put("money", money);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getBonuses() {
      return (String) arguments.get("bonuses");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public long getMoney() {
      return (long) arguments.get("money");
    }
  }
}
