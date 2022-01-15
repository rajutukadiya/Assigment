package com.app.assigmenttask.activity.seated.model;

import java.util.List;

public class SeatedModel {
    private List<FloorsDTO> Floors;

    public List<FloorsDTO> getFloors() {
        return Floors;
    }

    public void setFloors(List<FloorsDTO> Floors) {
        this.Floors = Floors;
    }

    public static class FloorsDTO {


        private String table_no;
        private String bookingId;
        private String floorName;
        private String convertTime;
        private UserDTO user;

        public String getFloorName() {
            return floorName;
        }

        public void setFloorName(String floorName) {
            this.floorName = floorName;
        }

        public String getBookingId() {
            return bookingId;
        }

        public void setBookingId(String bookingId) {
            this.bookingId = bookingId;
        }

        public String getConvertTime() {
            return convertTime;
        }

        public void setConvertTime(String convertTime) {
            this.convertTime = convertTime;
        }

        public String getTable_no() {
            return table_no;
        }

        public void setTable_no(String table_no) {
            this.table_no = table_no;
        }

        public UserDTO getUser() {
            return user;
        }

        public void setUser(UserDTO user) {
            this.user = user;
        }

        public static class UserDTO {
            private String full_name;
            private String mobile;

            public String getFullName() {
                return full_name;
            }

            public void setFullName(String fullName) {
                this.full_name = fullName;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }
        }
    }


}
