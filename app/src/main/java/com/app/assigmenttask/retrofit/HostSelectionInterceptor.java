package com.app.assigmenttask.retrofit;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.net.URISyntaxException;

import kotlin.jvm.Volatile;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HostSelectionInterceptor implements Interceptor {
    @Volatile
    private HttpUrl host = null;

    public void setHost(HttpUrl host) {
        this.host = host;
    }

    public void clear() {
        host = null;
    }

    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request();
        if (host != null) {
            try {
                HttpUrl newUrl = request.url().newBuilder()
                        .scheme(host.scheme()).host(host.url().toURI().getHost()).port(host.port()).build();

                request = request.newBuilder().url(newUrl).build();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }


        }


        return chain.proceed(request);
    }




}
