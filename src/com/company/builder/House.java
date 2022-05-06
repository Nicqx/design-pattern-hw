package com.company.builder;

public class House {
    //required
    private String wallColour;
    private int windowCount;

    //optional
    private boolean gardenExist;

    public String getWallColour() {
        return wallColour;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public boolean getGardenExisit() {
        return gardenExist;
    }

    private House(HouseBuilder builder) {
        this.wallColour = builder.wallColour;
        this.windowCount = builder.windowCount;
        this.gardenExist = builder.gardenExist;
    }

    public static class HouseBuilder {

        private String wallColour;
        private int windowCount;
        private boolean gardenExist;

        public HouseBuilder(String wallColour, int windowCount) {
            this.wallColour = wallColour;
            this.windowCount = windowCount;
        }

        public HouseBuilder beGardenExist(boolean gardenExist) {
            this.gardenExist = gardenExist;

            return this;
        }

        public House build() {
            return new House(this);
        }


    }

}

