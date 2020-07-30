package com.maximemelianov.coronavirus.views;

import com.maximemelianov.coronavirus.model.CountryData;

import moxy.MvpView;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SingleStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface IMainView extends MvpView {

    @StateStrategyType(OneExecutionStateStrategy.class)
    void loading();

    @StateStrategyType(SingleStateStrategy.class)
    void success(CountryData data);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void error();

}
