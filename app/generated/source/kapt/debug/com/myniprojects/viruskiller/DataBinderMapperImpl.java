package com.myniprojects.viruskiller;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.myniprojects.viruskiller.databinding.FragmentGameBindingImpl;
import com.myniprojects.viruskiller.databinding.FragmentHelpBindingImpl;
import com.myniprojects.viruskiller.databinding.FragmentMenuBindingImpl;
import com.myniprojects.viruskiller.databinding.FragmentShopBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTGAME = 1;

  private static final int LAYOUT_FRAGMENTHELP = 2;

  private static final int LAYOUT_FRAGMENTMENU = 3;

  private static final int LAYOUT_FRAGMENTSHOP = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myniprojects.viruskiller.R.layout.fragment_game, LAYOUT_FRAGMENTGAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myniprojects.viruskiller.R.layout.fragment_help, LAYOUT_FRAGMENTHELP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myniprojects.viruskiller.R.layout.fragment_menu, LAYOUT_FRAGMENTMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myniprojects.viruskiller.R.layout.fragment_shop, LAYOUT_FRAGMENTSHOP);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTGAME: {
          if ("layout/fragment_game_0".equals(tag)) {
            return new FragmentGameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_game is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHELP: {
          if ("layout/fragment_help_0".equals(tag)) {
            return new FragmentHelpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_help is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMENU: {
          if ("layout/fragment_menu_0".equals(tag)) {
            return new FragmentMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOP: {
          if ("layout/fragment_shop_0".equals(tag)) {
            return new FragmentShopBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_shop is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "gameViewModel");
      sKeys.put(2, "menuViewModel");
      sKeys.put(3, "shopViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_game_0", com.myniprojects.viruskiller.R.layout.fragment_game);
      sKeys.put("layout/fragment_help_0", com.myniprojects.viruskiller.R.layout.fragment_help);
      sKeys.put("layout/fragment_menu_0", com.myniprojects.viruskiller.R.layout.fragment_menu);
      sKeys.put("layout/fragment_shop_0", com.myniprojects.viruskiller.R.layout.fragment_shop);
    }
  }
}
