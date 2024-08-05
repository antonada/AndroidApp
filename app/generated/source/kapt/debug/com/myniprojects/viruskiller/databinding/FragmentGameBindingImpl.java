package com.myniprojects.viruskiller.databinding;
import com.myniprojects.viruskiller.R;
import com.myniprojects.viruskiller.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGameBindingImpl extends FragmentGameBinding implements com.myniprojects.viruskiller.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linLayImgStats, 14);
        sViewsWithIds.put(R.id.imgKilled, 15);
        sViewsWithIds.put(R.id.imgSaved, 16);
        sViewsWithIds.put(R.id.imgMoney, 17);
        sViewsWithIds.put(R.id.imgLvl, 18);
        sViewsWithIds.put(R.id.imgXp, 19);
        sViewsWithIds.put(R.id.linLayTxtStats, 20);
        sViewsWithIds.put(R.id.linLayVirusStats, 21);
        sViewsWithIds.put(R.id.gdlVirusUp, 22);
        sViewsWithIds.put(R.id.relativeLayout2, 23);
        sViewsWithIds.put(R.id.imgAdReward, 24);
        sViewsWithIds.put(R.id.imgShop, 25);
        sViewsWithIds.put(R.id.gdlShopLeft, 26);
        sViewsWithIds.put(R.id.relativeLayout, 27);
        sViewsWithIds.put(R.id.gdlChestRight, 28);
        sViewsWithIds.put(R.id.linLayAttack, 29);
        sViewsWithIds.put(R.id.layDynamic, 30);
        sViewsWithIds.put(R.id.txtDmg, 31);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private FragmentGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 12
            , (android.widget.TextView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[28]
            , (androidx.constraintlayout.widget.Guideline) bindings[26]
            , (androidx.constraintlayout.widget.Guideline) bindings[22]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.RelativeLayout) bindings[27]
            , (android.widget.RelativeLayout) bindings[23]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            );
        this.TxtVirusReward.setTag(null);
        this.conLayBack.setTag(null);
        this.imgStorage.setTag(null);
        this.imgVirus.setTag(null);
        this.txtClicks.setTag(null);
        this.txtCrit.setTag(null);
        this.txtLvl.setTag(null);
        this.txtMoney.setTag(null);
        this.txtSavedLives.setTag(null);
        this.txtStorage.setTag(null);
        this.txtVirusHp.setTag(null);
        this.txtVirusKilled.setTag(null);
        this.txtVirusLvl.setTag(null);
        this.txtXp.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.myniprojects.viruskiller.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.myniprojects.viruskiller.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gameViewModel == variableId) {
            setGameViewModel((com.myniprojects.viruskiller.screens.game.GameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameViewModel(@Nullable com.myniprojects.viruskiller.screens.game.GameViewModel GameViewModel) {
        this.mGameViewModel = GameViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.gameViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGameViewModelGameStateVirusLvlString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeGameViewModelGameStateLvl((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeGameViewModelGameStateAttackPerClick((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeGameViewModelGameStateVirusHpString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeGameViewModelGameStateVirusRewardString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeGameViewModelGameStateKilledViruses((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 6 :
                return onChangeGameViewModelGameStateVirusImg((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 7 :
                return onChangeGameViewModelGameStateXpString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeGameViewModelGameStateMoney((androidx.lifecycle.LiveData<java.lang.Long>) object, fieldId);
            case 9 :
                return onChangeGameViewModelGameStateSavedLives((androidx.lifecycle.LiveData<java.lang.Long>) object, fieldId);
            case 10 :
                return onChangeGameViewModelGameStateStorage((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeGameViewModelGameStateCrit((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateVirusLvlString(androidx.lifecycle.LiveData<java.lang.String> GameViewModelGameStateVirusLvlString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateLvl(androidx.lifecycle.LiveData<java.lang.Integer> GameViewModelGameStateLvl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateAttackPerClick(androidx.lifecycle.LiveData<java.lang.String> GameViewModelGameStateAttackPerClick, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateVirusHpString(androidx.lifecycle.LiveData<java.lang.String> GameViewModelGameStateVirusHpString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateVirusRewardString(androidx.lifecycle.LiveData<java.lang.String> GameViewModelGameStateVirusRewardString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateKilledViruses(androidx.lifecycle.LiveData<java.lang.Integer> GameViewModelGameStateKilledViruses, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateVirusImg(androidx.lifecycle.LiveData<java.lang.Integer> GameViewModelGameStateVirusImg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateXpString(androidx.lifecycle.LiveData<java.lang.String> GameViewModelGameStateXpString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateMoney(androidx.lifecycle.LiveData<java.lang.Long> GameViewModelGameStateMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateSavedLives(androidx.lifecycle.LiveData<java.lang.Long> GameViewModelGameStateSavedLives, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateStorage(androidx.lifecycle.LiveData<java.lang.String> GameViewModelGameStateStorage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelGameStateCrit(androidx.lifecycle.LiveData<java.lang.String> GameViewModelGameStateCrit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelGameStateVirusLvlString = null;
        androidx.lifecycle.LiveData<java.lang.Integer> gameViewModelGameStateLvl = null;
        java.lang.String gameViewModelGameStateKilledVirusesToString = null;
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelGameStateAttackPerClick = null;
        com.myniprojects.viruskiller.screens.game.GameViewModel gameViewModel = mGameViewModel;
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelGameStateVirusHpString = null;
        java.lang.String gameViewModelGameStateVirusLvlStringGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelGameStateVirusRewardString = null;
        java.lang.Long gameViewModelGameStateSavedLivesGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxGameViewModelGameStateVirusImgGetValue = 0;
        androidx.lifecycle.LiveData<java.lang.Integer> gameViewModelGameStateKilledViruses = null;
        java.lang.String gameViewModelGameStateVirusRewardStringToString = null;
        java.lang.String gameViewModelGameStateAttackPerClickGetValue = null;
        java.lang.String gameViewModelGameStateVirusHpStringGetValue = null;
        java.lang.Long gameViewModelGameStateMoneyGetValue = null;
        java.lang.String gameViewModelGameStateCritGetValue = null;
        com.myniprojects.viruskiller.model.Virus gameViewModelGameStateVirus = null;
        java.lang.String gameViewModelGameStateStorageGetValue = null;
        java.lang.String gameViewModelGameStateSavedLivesToString = null;
        androidx.lifecycle.LiveData<java.lang.Integer> gameViewModelGameStateVirusImg = null;
        java.lang.String gameViewModelGameStateVirusRewardStringGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelGameStateXpString = null;
        androidx.lifecycle.LiveData<java.lang.Long> gameViewModelGameStateMoney = null;
        androidx.lifecycle.LiveData<java.lang.Long> gameViewModelGameStateSavedLives = null;
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelGameStateStorage = null;
        java.lang.Integer gameViewModelGameStateKilledVirusesGetValue = null;
        java.lang.String gameViewModelGameStateVirusLvlStringToString = null;
        java.lang.String gameViewModelGameStateXpStringGetValue = null;
        java.lang.Integer gameViewModelGameStateLvlGetValue = null;
        com.myniprojects.viruskiller.model.GameState gameViewModelGameState = null;
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelGameStateCrit = null;
        java.lang.String txtMoneyAndroidStringMoneyGameFormatGameViewModelGameStateMoney = null;
        java.lang.String txtLvlAndroidStringLvlGameFormatGameViewModelGameStateLvl = null;
        java.lang.Integer gameViewModelGameStateVirusImgGetValue = null;

        if ((dirtyFlags & 0x3fffL) != 0) {



                if (gameViewModel != null) {
                    // read gameViewModel.gameState
                    gameViewModelGameState = gameViewModel.getGameState();
                }

            if ((dirtyFlags & 0x3002L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.lvl
                        gameViewModelGameStateLvl = gameViewModelGameState.getLvl();
                    }
                    updateLiveDataRegistration(1, gameViewModelGameStateLvl);


                    if (gameViewModelGameStateLvl != null) {
                        // read gameViewModel.gameState.lvl.getValue()
                        gameViewModelGameStateLvlGetValue = gameViewModelGameStateLvl.getValue();
                    }


                    // read @android:string/lvl_game_format
                    txtLvlAndroidStringLvlGameFormatGameViewModelGameStateLvl = txtLvl.getResources().getString(R.string.lvl_game_format, gameViewModelGameStateLvlGetValue);
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.attackPerClick
                        gameViewModelGameStateAttackPerClick = gameViewModelGameState.getAttackPerClick();
                    }
                    updateLiveDataRegistration(2, gameViewModelGameStateAttackPerClick);


                    if (gameViewModelGameStateAttackPerClick != null) {
                        // read gameViewModel.gameState.attackPerClick.getValue()
                        gameViewModelGameStateAttackPerClickGetValue = gameViewModelGameStateAttackPerClick.getValue();
                    }
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.killedViruses
                        gameViewModelGameStateKilledViruses = gameViewModelGameState.getKilledViruses();
                    }
                    updateLiveDataRegistration(5, gameViewModelGameStateKilledViruses);


                    if (gameViewModelGameStateKilledViruses != null) {
                        // read gameViewModel.gameState.killedViruses.getValue()
                        gameViewModelGameStateKilledVirusesGetValue = gameViewModelGameStateKilledViruses.getValue();
                    }


                    if (gameViewModelGameStateKilledVirusesGetValue != null) {
                        // read gameViewModel.gameState.killedViruses.getValue().toString()
                        gameViewModelGameStateKilledVirusesToString = gameViewModelGameStateKilledVirusesGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x3059L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.virus
                        gameViewModelGameStateVirus = gameViewModelGameState.getVirus();
                    }

                if ((dirtyFlags & 0x3001L) != 0) {

                        if (gameViewModelGameStateVirus != null) {
                            // read gameViewModel.gameState.virus.lvlString
                            gameViewModelGameStateVirusLvlString = gameViewModelGameStateVirus.getLvlString();
                        }
                        updateLiveDataRegistration(0, gameViewModelGameStateVirusLvlString);


                        if (gameViewModelGameStateVirusLvlString != null) {
                            // read gameViewModel.gameState.virus.lvlString.getValue()
                            gameViewModelGameStateVirusLvlStringGetValue = gameViewModelGameStateVirusLvlString.getValue();
                        }


                        if (gameViewModelGameStateVirusLvlStringGetValue != null) {
                            // read gameViewModel.gameState.virus.lvlString.getValue().toString()
                            gameViewModelGameStateVirusLvlStringToString = gameViewModelGameStateVirusLvlStringGetValue.toString();
                        }
                }
                if ((dirtyFlags & 0x3008L) != 0) {

                        if (gameViewModelGameStateVirus != null) {
                            // read gameViewModel.gameState.virus.hpString
                            gameViewModelGameStateVirusHpString = gameViewModelGameStateVirus.getHpString();
                        }
                        updateLiveDataRegistration(3, gameViewModelGameStateVirusHpString);


                        if (gameViewModelGameStateVirusHpString != null) {
                            // read gameViewModel.gameState.virus.hpString.getValue()
                            gameViewModelGameStateVirusHpStringGetValue = gameViewModelGameStateVirusHpString.getValue();
                        }
                }
                if ((dirtyFlags & 0x3010L) != 0) {

                        if (gameViewModelGameStateVirus != null) {
                            // read gameViewModel.gameState.virus.rewardString
                            gameViewModelGameStateVirusRewardString = gameViewModelGameStateVirus.getRewardString();
                        }
                        updateLiveDataRegistration(4, gameViewModelGameStateVirusRewardString);


                        if (gameViewModelGameStateVirusRewardString != null) {
                            // read gameViewModel.gameState.virus.rewardString.getValue()
                            gameViewModelGameStateVirusRewardStringGetValue = gameViewModelGameStateVirusRewardString.getValue();
                        }


                        if (gameViewModelGameStateVirusRewardStringGetValue != null) {
                            // read gameViewModel.gameState.virus.rewardString.getValue().toString()
                            gameViewModelGameStateVirusRewardStringToString = gameViewModelGameStateVirusRewardStringGetValue.toString();
                        }
                }
                if ((dirtyFlags & 0x3040L) != 0) {

                        if (gameViewModelGameStateVirus != null) {
                            // read gameViewModel.gameState.virus.img
                            gameViewModelGameStateVirusImg = gameViewModelGameStateVirus.getImg();
                        }
                        updateLiveDataRegistration(6, gameViewModelGameStateVirusImg);


                        if (gameViewModelGameStateVirusImg != null) {
                            // read gameViewModel.gameState.virus.img.getValue()
                            gameViewModelGameStateVirusImgGetValue = gameViewModelGameStateVirusImg.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(gameViewModel.gameState.virus.img.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxGameViewModelGameStateVirusImgGetValue = androidx.databinding.ViewDataBinding.safeUnbox(gameViewModelGameStateVirusImgGetValue);
                }
            }
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.xpString
                        gameViewModelGameStateXpString = gameViewModelGameState.getXpString();
                    }
                    updateLiveDataRegistration(7, gameViewModelGameStateXpString);


                    if (gameViewModelGameStateXpString != null) {
                        // read gameViewModel.gameState.xpString.getValue()
                        gameViewModelGameStateXpStringGetValue = gameViewModelGameStateXpString.getValue();
                    }
            }
            if ((dirtyFlags & 0x3100L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.money
                        gameViewModelGameStateMoney = gameViewModelGameState.getMoney();
                    }
                    updateLiveDataRegistration(8, gameViewModelGameStateMoney);


                    if (gameViewModelGameStateMoney != null) {
                        // read gameViewModel.gameState.money.getValue()
                        gameViewModelGameStateMoneyGetValue = gameViewModelGameStateMoney.getValue();
                    }


                    // read @android:string/money_game_format
                    txtMoneyAndroidStringMoneyGameFormatGameViewModelGameStateMoney = txtMoney.getResources().getString(R.string.money_game_format, gameViewModelGameStateMoneyGetValue);
            }
            if ((dirtyFlags & 0x3200L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.savedLives
                        gameViewModelGameStateSavedLives = gameViewModelGameState.getSavedLives();
                    }
                    updateLiveDataRegistration(9, gameViewModelGameStateSavedLives);


                    if (gameViewModelGameStateSavedLives != null) {
                        // read gameViewModel.gameState.savedLives.getValue()
                        gameViewModelGameStateSavedLivesGetValue = gameViewModelGameStateSavedLives.getValue();
                    }


                    if (gameViewModelGameStateSavedLivesGetValue != null) {
                        // read gameViewModel.gameState.savedLives.getValue().toString()
                        gameViewModelGameStateSavedLivesToString = gameViewModelGameStateSavedLivesGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x3400L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.storage
                        gameViewModelGameStateStorage = gameViewModelGameState.getStorage();
                    }
                    updateLiveDataRegistration(10, gameViewModelGameStateStorage);


                    if (gameViewModelGameStateStorage != null) {
                        // read gameViewModel.gameState.storage.getValue()
                        gameViewModelGameStateStorageGetValue = gameViewModelGameStateStorage.getValue();
                    }
            }
            if ((dirtyFlags & 0x3800L) != 0) {

                    if (gameViewModelGameState != null) {
                        // read gameViewModel.gameState.crit
                        gameViewModelGameStateCrit = gameViewModelGameState.getCrit();
                    }
                    updateLiveDataRegistration(11, gameViewModelGameStateCrit);


                    if (gameViewModelGameStateCrit != null) {
                        // read gameViewModel.gameState.crit.getValue()
                        gameViewModelGameStateCritGetValue = gameViewModelGameStateCrit.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.TxtVirusReward, gameViewModelGameStateVirusRewardStringToString);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.imgStorage.setOnClickListener(mCallback1);
            this.txtStorage.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x3040L) != 0) {
            // api target 1

            this.imgVirus.setImageResource(androidxDatabindingViewDataBindingSafeUnboxGameViewModelGameStateVirusImgGetValue);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtClicks, gameViewModelGameStateAttackPerClickGetValue);
        }
        if ((dirtyFlags & 0x3800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCrit, gameViewModelGameStateCritGetValue);
        }
        if ((dirtyFlags & 0x3002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLvl, txtLvlAndroidStringLvlGameFormatGameViewModelGameStateLvl);
        }
        if ((dirtyFlags & 0x3100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMoney, txtMoneyAndroidStringMoneyGameFormatGameViewModelGameStateMoney);
        }
        if ((dirtyFlags & 0x3200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSavedLives, gameViewModelGameStateSavedLivesToString);
        }
        if ((dirtyFlags & 0x3400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtStorage, gameViewModelGameStateStorageGetValue);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVirusHp, gameViewModelGameStateVirusHpStringGetValue);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVirusKilled, gameViewModelGameStateKilledVirusesToString);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVirusLvl, gameViewModelGameStateVirusLvlStringToString);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtXp, gameViewModelGameStateXpStringGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // gameViewModel
                com.myniprojects.viruskiller.screens.game.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;
                // gameViewModel.gameState
                com.myniprojects.viruskiller.model.GameState gameViewModelGameState = null;
                // gameViewModel.gameState != null
                boolean gameViewModelGameStateJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {


                    gameViewModelGameState = gameViewModel.getGameState();

                    gameViewModelGameStateJavaLangObjectNull = (gameViewModelGameState) != (null);
                    if (gameViewModelGameStateJavaLangObjectNull) {


                        gameViewModelGameState.collectStorage();
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // gameViewModel
                com.myniprojects.viruskiller.screens.game.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;
                // gameViewModel.gameState
                com.myniprojects.viruskiller.model.GameState gameViewModelGameState = null;
                // gameViewModel.gameState != null
                boolean gameViewModelGameStateJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {


                    gameViewModelGameState = gameViewModel.getGameState();

                    gameViewModelGameStateJavaLangObjectNull = (gameViewModelGameState) != (null);
                    if (gameViewModelGameStateJavaLangObjectNull) {


                        gameViewModelGameState.collectStorage();
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameViewModel.gameState.virus.lvlString
        flag 1 (0x2L): gameViewModel.gameState.lvl
        flag 2 (0x3L): gameViewModel.gameState.attackPerClick
        flag 3 (0x4L): gameViewModel.gameState.virus.hpString
        flag 4 (0x5L): gameViewModel.gameState.virus.rewardString
        flag 5 (0x6L): gameViewModel.gameState.killedViruses
        flag 6 (0x7L): gameViewModel.gameState.virus.img
        flag 7 (0x8L): gameViewModel.gameState.xpString
        flag 8 (0x9L): gameViewModel.gameState.money
        flag 9 (0xaL): gameViewModel.gameState.savedLives
        flag 10 (0xbL): gameViewModel.gameState.storage
        flag 11 (0xcL): gameViewModel.gameState.crit
        flag 12 (0xdL): gameViewModel
        flag 13 (0xeL): null
    flag mapping end*/
    //end
}