package com.app.assigmenttask.activity.homescreen.request;

public class ReqRestaurants {
   double latitude,longitude;
   int page;

   public double getLatitude() {
      return latitude;
   }

   public void setLatitude(double latitude) {
      this.latitude = latitude;
   }

   public double getLongitude() {
      return longitude;
   }

   public void setLongitude(double longitude) {
      this.longitude = longitude;
   }

   public int getPage() {
      return page;
   }

   public void setPage(int page) {
      this.page = page;
   }
}
