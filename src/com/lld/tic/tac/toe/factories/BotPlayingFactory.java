package com.lld.tic.tac.toe.factories;

import com.lld.tic.tac.toe.model.BotDifficultyLevel;
import com.lld.tic.tac.toe.stratgies.botplayingstrategy.BotPlayingStrategy;
import com.lld.tic.tac.toe.stratgies.botplayingstrategy.EasyBotPlayingStrategy;
import com.lld.tic.tac.toe.stratgies.botplayingstrategy.HardBotPlayingStrategy;
import com.lld.tic.tac.toe.stratgies.botplayingstrategy.MediumBotPlayingStrategy;

public class BotPlayingFactory {
    public static BotPlayingStrategy getBotPlayingStrategyFactory(BotDifficultyLevel botDifficultyLevel) {
        if (botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        } else {
            return new HardBotPlayingStrategy();
        }
    }
}
