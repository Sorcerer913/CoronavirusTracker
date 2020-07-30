package com.maximemelianov.coronavirus.views;

import android.os.Bundle;
import android.widget.TextView;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.snackbar.Snackbar;
import com.maximemelianov.coronavirus.model.CountryData;
import com.maximemelianov.coronavirus.R;
import com.maximemelianov.coronavirus.api.APIConfig;
import com.maximemelianov.coronavirus.api.APIServerConstructor;
import com.maximemelianov.coronavirus.api.APIService;
import com.maximemelianov.coronavirus.api.ResponseData;
import com.maximemelianov.coronavirus.presentors.MainPresenter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends MvpAppCompatActivity implements IMainView {

    @InjectPresenter
    public MainPresenter presenter;

    TextView textView;
    SwipeRefreshLayout refresh_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        refresh_layout = findViewById(R.id.refresh_layout);

        refresh_layout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.loadData();
            }
        });

    }

    @Override
    public void loading() {
        refresh_layout.setRefreshing(true);
    }

    @Override
    public void success(CountryData data) {
        if (data != null){
            textView.setText(data.toString());
        }
        refresh_layout.setRefreshing(false);
    }

    @Override
    public void error() {
        Snackbar.make(refresh_layout, "Что-то пошло не так... =((", Snackbar.LENGTH_LONG).show();
        refresh_layout.setRefreshing(false);
    }

    /*public void loading() {
        if (!refresh_layout.isRefreshing())
            refresh_layout.setRefreshing(true);

        service = APIServerConstructor.CreateService(APIService.class);

        Call<ResponseData> call = service.getDataCountry(APIConfig.COUNTRY);
        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                if (response.body() != null){
                    ResponseData responseData = response.body();
                    CountryData data = responseData.getCountrydata().get(0);
                    textView.setText(data.toString());
                }
                refresh_layout.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
                Snackbar.make(refresh_layout, "Что-то пошло не так... =((", Snackbar.LENGTH_LONG).show();
                refresh_layout.setRefreshing(false);
            }
        });
    }*/
}