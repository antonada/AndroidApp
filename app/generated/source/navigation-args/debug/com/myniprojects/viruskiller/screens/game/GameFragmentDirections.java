package com.myniprojects.viruskiller.screens.game;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.myniprojects.viruskiller.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GameFragmentDirections {
  private GameFragmentDirections() {
  }

  @NonNull
  public static GameToShop gameToShop(@NonNull String bonuses, long money) {
    return new GameToShop(bonuses, money);
  }

  public static class GameToShop implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private GameToShop(@NonNull String bonuses, long money) {
      if (bonuses == null) {
        throw new IllegalArgumentException("Argument \"bonuses\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bonuses", bonuses);
      this.arguments.put("money", money);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public GameToShop setBonuses(@NonNull String bonuses) {
      if (bonuses == null) {
        throw new IllegalArgumentException("Argument \"bonuses\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bonuses", bonuses);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public GameToShop setMoney(long money) {
      this.arguments.put("money", money);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.game_to_shop;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      GameToShop that = (GameToShop) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getBonuses() != null ? getBonuses().hashCode() : 0);
      result = 31 * result + (int)(getMoney() ^ (getMoney() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "GameToShop(actionId=" + getActionId() + "){"
          + "bonuses=" + getBonuses()
          + ", money=" + getMoney()
          + "}";
    }
  }
}
