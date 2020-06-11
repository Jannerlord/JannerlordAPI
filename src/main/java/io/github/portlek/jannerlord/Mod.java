package io.github.portlek.jannerlord;

import io.github.portlek.jannerlord.game.Game;
import io.github.portlek.jannerlord.game.IGameStarter;
import io.github.portlek.jannerlord.mission.Mission;
import org.jetbrains.annotations.NotNull;

public interface Mod {

    default boolean doLoading(@NotNull Game game) {
        return true;
    }

    void onSubModuleLoad();

    void onSubModuleUnloaded();

    void onBeforeInitialModuleScreenSetAsRoot();

    void onGameStart(@NotNull Game game, @NotNull IGameStarter gameStarterObject);

    void onApplicationTick(float dt);

    void onGameLoaded(@NotNull Game game, @NotNull Object initializerObject);

    void onNewGameCreated(@NotNull Game game, @NotNull Object initializerObject);

    void beginGameStart(@NotNull Game game);

    void onCampaignStart(@NotNull Game game, @NotNull Object starterObject);

    void onMultiplayerGameStart(@NotNull Game game, @NotNull Object starterObject);

    void onGameInitializationFinished(@NotNull Game game);

    void onGameEnd(@NotNull Game game);

    void onMissionBehaviourInitialize(@NotNull Mission mission);

}
