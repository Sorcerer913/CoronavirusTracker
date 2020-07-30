package com.maximemelianov.coronavirus.presentors;

import com.maximemelianov.coronavirus.api.APIConfig;
import com.maximemelianov.coronavirus.api.APIServerConstructor;
import com.maximemelianov.coronavirus.api.APIService;
import com.maximemelianov.coronavirus.api.ResponseData;
import com.maximemelianov.coronavirus.views.IMainView;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


@InjectViewState
public class MainPresenter extends MvpPresenter<IMainView> {

    APIService service;

    public MainPresenter(){
        service = APIServerConstructor.CreateService(APIService.class);
        loadData();
    }

    public void loadData(){

        getViewState().loading();

        Call<ResponseData> call = service.getDataCountry(APIConfig.COUNTRY);
        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                if (response.body() != null){
                    getViewState().success(response.body().getCountrydata().get(0));
                } else {
                    getViewState().error();
                }
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
                getViewState().error();
            }
        });
    }

}
