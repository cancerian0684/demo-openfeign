package com.shunya.demoopenfeign;

public class ServiceResponse {

    private User data;

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ServiceResponse{" +
                "data=" + data +
                '}';
    }
}


