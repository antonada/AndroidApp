package com.myniprojects.viruskiller.screens.game;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\rH\u0002J\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/myniprojects/viruskiller/screens/game/GameViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_gameState", "Lcom/myniprojects/viruskiller/model/GameState;", "gameState", "getGameState", "()Lcom/myniprojects/viruskiller/model/GameState;", "parentJob", "Lkotlinx/coroutines/Job;", "loadMoneyAndBonuses", "", "onPause", "onResume", "oneMinutePassed", "rewardAttack", "saveGame", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.myniprojects.viruskiller.model.GameState _gameState = null;
    private kotlinx.coroutines.Job parentJob;
    
    public GameViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.myniprojects.viruskiller.model.GameState getGameState() {
        return null;
    }
    
    public final void onResume() {
    }
    
    public final void onPause() {
    }
    
    private final void oneMinutePassed() {
    }
    
    public final void saveGame() {
    }
    
    public final void loadMoneyAndBonuses() {
    }
    
    public final void rewardAttack() {
    }
}