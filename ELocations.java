public enum ELocations {
        FOODSTORAGE(0);

        protected int floor;

        ELocations(int floor) {
            this.floor = floor;
        }

        public int getFloor() {
            return floor;
        }

}
