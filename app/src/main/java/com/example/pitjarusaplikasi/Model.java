package com.example.pitjarusaplikasi;

import java.util.ArrayList;

public class Model {
    String stores;
    ArrayList<data> data;

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public ArrayList<Model.data> getData() {
        return data;
    }

    public void setData(ArrayList<Model.data> data) {
        this.data = data;
    }

    public class data{
        String store_id;
        String store_code;
        String store_name;
        String address;
        String dc_id;
        String dc_name;
        String account_id;
        String account_name;
        String subchannel_id;
        String subchannel_name;
        String channel_id;
        String channel_name;
        String area_id;
        String area_name;
        String region_id;
        String region_name;
        String latitude;
        String longitude;

        public String getStore_id() {
            return store_id;
        }

        public void setStore_id(String store_id) {
            this.store_id = store_id;
        }

        public String getStore_code() {
            return store_code;
        }

        public void setStore_code(String store_code) {
            this.store_code = store_code;
        }

        public String getStore_name() {
            return store_name;
        }

        public void setStore_name(String store_name) {
            this.store_name = store_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDc_id() {
            return dc_id;
        }

        public void setDc_id(String dc_id) {
            this.dc_id = dc_id;
        }

        public String getDc_name() {
            return dc_name;
        }

        public void setDc_name(String dc_name) {
            this.dc_name = dc_name;
        }

        public String getAccount_id() {
            return account_id;
        }

        public void setAccount_id(String account_id) {
            this.account_id = account_id;
        }

        public String getAccount_name() {
            return account_name;
        }

        public void setAccount_name(String account_name) {
            this.account_name = account_name;
        }

        public String getSubchannel_id() {
            return subchannel_id;
        }

        public void setSubchannel_id(String subchannel_id) {
            this.subchannel_id = subchannel_id;
        }

        public String getSubchannel_name() {
            return subchannel_name;
        }

        public void setSubchannel_name(String subchannel_name) {
            this.subchannel_name = subchannel_name;
        }

        public String getChannel_id() {
            return channel_id;
        }

        public void setChannel_id(String channel_id) {
            this.channel_id = channel_id;
        }

        public String getChannel_name() {
            return channel_name;
        }

        public void setChannel_name(String channel_name) {
            this.channel_name = channel_name;
        }

        public String getArea_id() {
            return area_id;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public String getArea_name() {
            return area_name;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }

        public String getRegion_id() {
            return region_id;
        }

        public void setRegion_id(String region_id) {
            this.region_id = region_id;
        }

        public String getRegion_name() {
            return region_name;
        }

        public void setRegion_name(String region_name) {
            this.region_name = region_name;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }
}
