package com.myniprojects.viruskiller.screens.menu;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.myniprojects.viruskiller.R;

public class MenuFragmentDirections {
  private MenuFragmentDirections() {
  }

  @NonNull
  public static NavDirections menuToHelp() {
    return new ActionOnlyNavDirections(R.id.menu_to_help);
  }

  @NonNull
  public static NavDirections menuToGame() {
    return new ActionOnlyNavDirections(R.id.menu_to_game);
  }
}
