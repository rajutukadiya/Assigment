package com.app.assigmenttask.activity.tableview.model;

import java.util.List;

public class FloorsTableModel {

    private OutputDTO output;

    public OutputDTO getOutput() {
        return output;
    }

    public void setOutput(OutputDTO output) {
        this.output = output;
    }

    public static class OutputDTO {
        private String status;
        private String message;


        private List<FloorTableDetailsDTO> floorTableDetails;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<FloorTableDetailsDTO> getFloorTableDetails() {
            return floorTableDetails;
        }

        public void setFloorTableDetails(List<FloorTableDetailsDTO> floorTableDetails) {
            this.floorTableDetails = floorTableDetails;
        }

        public static class FloorTableDetailsDTO {

            private String tableImg;
            private int x_position,y_position;

            public int getX_position() {
                return x_position;
            }

            public void setX_position(int x_position) {
                this.x_position = x_position;
            }

            public int getY_position() {
                return y_position;
            }

            public void setY_position(int y_position) {
                this.y_position = y_position;
            }

            public String getTableImg() {
                return tableImg;
            }

            public void setTableImg(String tableImg) {
                this.tableImg = tableImg;
            }


        }
    }
}
